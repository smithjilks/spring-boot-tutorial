package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student jane = new Student(
                    "Jane",
                    "jane.doe@gmail.com",
                    LocalDate.of(2005, Month.JANUARY, 5)
            );

            Student john = new Student(
                    "john",
                    "john.doe@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );

            repository.saveAll(
                    List.of(jane, john)
            );

        };
    }
}
