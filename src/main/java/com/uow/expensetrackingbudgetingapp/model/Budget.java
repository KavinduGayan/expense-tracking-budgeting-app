package com.uow.expensetrackingbudgetingapp.model;

import javax.persistence.*;

@Entity
@Table(name = "budget")
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "budget_value", nullable = false)
    private float budgetValue;

    public float getBudgetValue() {
        return budgetValue;
    }

    public void setBudgetValue(float budgetValue) {
        this.budgetValue = budgetValue;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}