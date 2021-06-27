package com.example.springboot.student;

import com.sun.tools.javac.util.List;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;

/**
 * The Service layer is for Business Logic.
 */
@Service
public class StudentService {

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
