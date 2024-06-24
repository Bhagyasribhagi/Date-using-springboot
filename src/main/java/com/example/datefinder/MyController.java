package com.example.datefinder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@RestController
public class MyController {
    @GetMapping("/")
    public String hello(){
        LocalDate today=LocalDate.now();
         LocalDate futureday=today.plusDays(100);
        DateTimeFormatter form=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return futureday.format(form);
    }
    
}
