package com.example.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentApplication {
	
	@Bean
    ApplicationRunner runner(DepartmentRepository repository) {
        return (args) -> {
            List<Department> dept = new ArrayList<>();
            dept.add(new Department(1,"CSE"));
            dept.add(new Department(2,"ECE"));
            dept.add(new Department(3,"IT"));
            dept.add(new Department(4,"EEE"));
            repository.saveAll(dept);
        };
    }
	
	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}

}
