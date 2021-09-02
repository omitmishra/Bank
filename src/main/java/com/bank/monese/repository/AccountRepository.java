package com.bank.monese.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.monese.entity.Account;



public interface AccountRepository extends JpaRepository<Account, Long> {

  Account findById(long  id);
}