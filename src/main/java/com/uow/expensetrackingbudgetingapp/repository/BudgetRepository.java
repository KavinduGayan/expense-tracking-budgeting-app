package com.uow.expensetrackingbudgetingapp.repository;

import com.uow.expensetrackingbudgetingapp.model.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository extends JpaRepository<Budget, Integer> {
}