package com.expensetracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expensetracker.entity.transaction;

public interface transactionRepository extends JpaRepository<transaction,Integer> {

	
}
