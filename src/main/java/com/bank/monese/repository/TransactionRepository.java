package com.bank.monese.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.monese.entity.Transaction;



public interface TransactionRepository extends JpaRepository<Transaction, Long> {

	
}
