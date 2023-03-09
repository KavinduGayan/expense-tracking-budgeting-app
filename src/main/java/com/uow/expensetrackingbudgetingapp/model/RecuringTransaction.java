package com.uow.expensetrackingbudgetingapp.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "recuring_transaction")
public class RecuringTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "recuring_period")
    private String recuringPeriod;

    @Column(name = "start_date", nullable = false)
    private LocalDateTime startDate;

    @Column(name = "end_date", nullable = false)
    private String endDate;

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public String getRecuringPeriod() {
        return recuringPeriod;
    }

    public void setRecuringPeriod(String recuringPeriod) {
        this.recuringPeriod = recuringPeriod;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}