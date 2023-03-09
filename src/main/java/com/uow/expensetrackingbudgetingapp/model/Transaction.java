package com.uow.expensetrackingbudgetingapp.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "amount", nullable = false)
    private float amount;

    @Column(name = "note")
    private String note;

    @Column(name = "inserted_date")
    private LocalDateTime insertedDate;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "recuring_transaction_id")
    private RecuringTransaction recuringTransaction;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "income_id")
    private Income income;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "expense_id")
    private Expense expense;

    public Expense getExpense() {
        return expense;
    }

    public void setExpense(Expense expense) {
        this.expense = expense;
    }

    public Income getIncome() {
        return income;
    }

    public void setIncome(Income income) {
        this.income = income;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public RecuringTransaction getRecuringTransaction() {
        return recuringTransaction;
    }

    public void setRecuringTransaction(RecuringTransaction recuringTransaction) {
        this.recuringTransaction = recuringTransaction;
    }

    public LocalDateTime getInsertedDate() {
        return insertedDate;
    }

    public void setInsertedDate(LocalDateTime insertedDate) {
        this.insertedDate = insertedDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}