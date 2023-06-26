package com.intership.microservisehabittracker.habit.repository;

import com.intership.microservisehabittracker.habit.entity.Habit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitRepository extends JpaRepository<Habit,Long> {
}
