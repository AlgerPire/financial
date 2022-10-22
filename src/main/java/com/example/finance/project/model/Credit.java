package com.example.finance.project.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Credit {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private double shuma;

    private LocalDate data;

    private String message;

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;


}
