package com.example.finance.project.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
@Getter
@Setter
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

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;
}