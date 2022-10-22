package com.example.finance.project.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Investment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long investmentId;

    private Double interest;
    private String type;

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

}
