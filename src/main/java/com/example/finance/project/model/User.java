package com.example.finance.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long userId;
    private String name;
    private String surname;
//    private Credit credit;
//    private Debit debit;
//    private Investment investment;
//    private SavingPlan savingPlan;
    private Double balance;
}