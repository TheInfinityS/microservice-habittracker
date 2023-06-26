package com.intership.microservisehabittracker.habit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HabitController {
    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
