package com.crud.crudapplication.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class SudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{
            Student joao = new Student(
                    "João",
                    "joaoptgaino@hotmail.com",
                    LocalDate.of(2001, Month.APRIL,23)
            );
            Student pedro = new Student(
                    "Pedro",
                    "pedro@hotmail.com",
                    LocalDate.of(2000, Month.APRIL,23)

            );
            repository.saveAll(
                    List.of(joao,pedro)
            );
        };
    }
}
