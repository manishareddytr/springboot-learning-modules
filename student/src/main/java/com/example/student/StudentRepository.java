package com.example.student;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentRecord, Long> {	
	
	StudentRecord findByFirstName(String firstName);
	StudentRecord findById(long id);
	List<StudentRecord> findByFirstNameAndLastName(String firstName, String lastName);
}
