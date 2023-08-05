package com.intership.microservisehabittracker.habit.repository;

import com.intership.microservisehabittracker.habit.entity.Habit;
import com.intership.microservisehabittracker.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HabitRepository extends JpaRepository<Habit,Long> {
    List<Habit> findByProfile(User profile);
}
