package com.abhimanyu.springboottestapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CourseController {

    private final CurrencyServiceConfiguration currencyServiceConfiguration;

    @Autowired
    public CourseController(CurrencyServiceConfiguration currencyServiceConfiguration) {
        this.currencyServiceConfiguration = currencyServiceConfiguration;
    }

    @GetMapping("/courses")
    public List<Course> getCourses(){
        return List.of(
                Course.builder().name("Course 1").id("01").author("Raj").build(),
                Course.builder().name("Course 2").id("02").author("Ram").build()

        );
    }

    @GetMapping("/currency-configuration")
    public CurrencyServiceConfiguration getConfig(){
        return currencyServiceConfiguration;
    }
}
