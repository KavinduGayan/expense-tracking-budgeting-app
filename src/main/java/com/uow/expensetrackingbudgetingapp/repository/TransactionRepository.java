package com.uow.expensetrackingbudgetingapp.repository;

import com.uow.expensetrackingbudgetingapp.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
}