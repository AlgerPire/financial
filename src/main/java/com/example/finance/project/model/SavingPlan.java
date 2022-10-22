package com.example.finance.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class SavingPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Integer savingPlanId;
    private Double amount;
    private Double monthlyAmount;
    private Float percent;
    private LocalDate dateOfCredit;
}