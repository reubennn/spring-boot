package com.example.springboot.student;

import com.sun.tools.javac.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;

/**
 * Contains all resources for API.
 */
@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    @GetMapping
    public List<Student> getStudents() {
        return List.of(
            new Student(
                1L,
                "Mariam",
                "mariam.jama@gmail.com",
                LocalDate.of(2000, Month.JANUARY, 5),
                21
            )
        );
    }
}