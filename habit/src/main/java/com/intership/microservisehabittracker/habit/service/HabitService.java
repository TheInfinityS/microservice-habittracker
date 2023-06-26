package com.intership.microservisehabittracker.habit.service;

import com.intership.microservisehabittracker.habit.entity.Habit;
import com.intership.microservisehabittracker.habit.repository.HabitRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;

@Service
public class HabitService {
    private final HabitRepository habitRepository;

    @Autowired
    public HabitService(HabitRepository habitRepository) {
        this.habitRepository = habitRepository;
    }

    public Habit create(Habit habit) {
        habit.setRepetitionRate(0);
        return habitRepository.save(habit);
    }

    public List<Habit> getList() {
        return habitRepository.findAll();
    }

    public Habit update(Habit habitFromDb, Habit habit) {
        BeanUtils.copyProperties(habit,habitFromDb,"id");
        return habitRepository.save(habitFromDb);
    }

    public void delete(Habit habit) {
        habitRepository.delete(habit);
    }

    public Habit completeReps(Habit habit, Integer reps) {
        LocalDate localDate=LocalDate.now();
        if(habit.getHabitData().get(localDate)!=null){
            reps+=habit.getHabitData().get(localDate);
        }
        habit.getHabitData().put(localDate,reps);
        habit.setRepetitionRate(repsRate(habit,localDate));
        return habitRepository.save(habit);

    }

    public int repsRate(Habit habit,LocalDate localDate){
        int size= (int)ChronoUnit.DAYS.between(habit.getStartDate(),localDate)+1;
        //int size=localDate.getDayOfMonth()-habit.getStartDate().getDayOfMonth();
        int total=totalReps(habit);
        return total/size;
    }

    public int totalReps(Habit habit){
        int total=0;
        for(Map.Entry<LocalDate,Integer> entry:habit.getHabitData().entrySet()){
            total+= entry.getValue();
        }
        return total;
    }
}
