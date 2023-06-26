package com.intership.microservisehabittracker.habit.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.util.Map;

@Entity
@Table
@Data
@EqualsAndHashCode(of={"id"})
public class Habit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private int repetitionsPerDay;

    private int repetitionRate;

    private String measurement;

    private LocalDate startDate;

    private LocalDate endDate;


    @ElementCollection
    private Map<LocalDate,Integer> habitData;
}
