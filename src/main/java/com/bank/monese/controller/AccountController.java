package com.bank.monese.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.monese.entity.Account;
import com.bank.monese.service.AccountService;


@RestController
public class AccountController {


	@Autowired
	private AccountService accountService;

	
	@PostMapping(path = "/createAccount")
	public Account createAccount(@RequestBody Account accn) {
		Account acc = accountService.save(accn);
		return acc;
	}
	

}
