package com.bank.monese.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.monese.entity.Transaction;
import com.bank.monese.service.TransactionService;



@RestController
public class TransactionController {

	@Autowired
	private TransactionService transactionService;

	@GetMapping(path = "/showtransaction")
	public List<Transaction> showTransaction() {
		List<Transaction> trns = transactionService.getAll();
		return trns;
	}

	@PostMapping(path = "/transfermoney")
	public Transaction transferMoney(@RequestBody Transaction transaction) {
		Transaction trns = transactionService.save(transaction);
		return trns;
	}

}