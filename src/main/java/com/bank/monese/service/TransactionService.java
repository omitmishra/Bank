package com.bank.monese.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.monese.entity.Account;
import com.bank.monese.entity.Transaction;
import com.bank.monese.repository.AccountRepository;
import com.bank.monese.repository.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	private TransactionRepository transactionRepository;

	@Autowired
	private AccountService accountService;

	public List<Transaction> getAll() {
		return transactionRepository.findAll();
	}

	public Transaction save(Transaction trxn) {
		debitSrcAcountBalance(trxn);
		creditTargetAcountBalance(trxn);
		return transactionRepository.save(trxn);
	}

	void debitSrcAcountBalance(Transaction trxn) {
		Account accn = accountService.getAccount(trxn.getSourceAccountId());
		accn.setCurrentBalance(accn.getCurrentBalance() - trxn.getAmount());
		accn.setOwnerName(trxn.getTargetOwnerName());
		accountService.save(accn);
	}

	void creditTargetAcountBalance(Transaction trxn) {
		Account accn = accountService.getAccount(trxn.getTargetAccountId());
		accn.setCurrentBalance(accn.getCurrentBalance() + trxn.getAmount());
		accn.setOwnerName(trxn.getTargetOwnerName());
		accountService.save(accn);
	}

}
