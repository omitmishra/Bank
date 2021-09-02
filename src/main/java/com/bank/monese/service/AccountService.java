package com.bank.monese.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.monese.entity.Account;
import com.bank.monese.repository.AccountRepository;

@Service
public class AccountService {
	
	@Autowired
	private AccountRepository accountRepository;
	
	public Account save(Account acn) {
		return accountRepository.save(acn);
	}
	
	public List<Account> saveAll(List<Account> acn) {
		return accountRepository.saveAll(acn);
	}
	
	public Account getAccount(long id) {
		return accountRepository.findById(id);
	}
	
	
}
