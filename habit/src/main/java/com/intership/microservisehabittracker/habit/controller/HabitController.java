package com.intership.microservisehabittracker.habit.controller;

import com.intership.microservisehabittracker.habit.entity.Habit;
import com.intership.microservisehabittracker.habit.service.HabitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HabitController {
    private final HabitService habitService;
    @Autowired
    public HabitController(HabitService habitService) {
        this.habitService = habitService;
    }

    @GetMapping
    public List<Habit> getList(){
        return habitService.getList();
    }

    @PostMapping
    public Habit create(@RequestBody Habit habit){
        return habitService.create(habit);
    }

    @PutMapping("{id}")
    public Habit update(@PathVariable("id") Habit habitFromDb,
                        @RequestBody Habit habit
                        ){
        return habitService.update(habitFromDb,habit);
    }

    @PostMapping("updateCompleteReps/{id}")
    public Habit completeReps(@PathVariable("id") Habit habit,
                              @RequestBody Integer reps
                              ){
        return habitService.completeReps(habit,reps);
    }


    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Habit habit){
        habitService.delete(habit);
    }
}
