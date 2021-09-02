package com.javatechie.crud.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.bank.monese.entity.Account;
import com.bank.monese.entity.Transaction;
import com.bank.monese.repository.AccountRepository;
import com.bank.monese.repository.TransactionRepository;
import com.bank.monese.service.AccountService;
import com.bank.monese.service.TransactionService;



@SpringBootTest
class SpringBootCrudExample2ApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	private AccountService accountService;

	@MockBean
	private AccountRepository accountRepository;

	@MockBean
	private TransactionRepository transactionRepository;

	@Autowired
	TransactionService transactionService;

	@BeforeEach
	void setUp() {
		Account account = new Account( 1l, 10.1, "John");

		// when(accountRepository.find("111").thenReturn(Optional.of(account)));
	}

	@Test
	void whenAccountDetails_thenAccountShouldBeFound() {
		Account account = accountService.getAccount(1l);
		// before trnsaction checking balance
		assertThat(account.getCurrentBalance()).isEqualTo(10.1);

		Transaction txn = new Transaction();
		txn.setAmount(5.1);
		txn.setSourceAccountId(1l);
		txn.setTargetAccountId(2l);
		// when(transactionRepository.save(txn).thenReturn(Optional.of(txn)));

		transactionService.save(txn);

		assertThat(account.getOwnerName()).isEqualTo("John");
		// after trnsaction checking balance
		assertThat(account.getCurrentBalance()).isEqualTo(5.0);

	}

}
