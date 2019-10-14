package com.example.student;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/students")
public class StudentController {
	
	
	private StudentService studservice;
	
	public StudentController( StudentService studservice) {
		
		this.studservice=studservice;
	}
	
	@GetMapping("/all")
	public List<StudentRecord> getAllStudents(){
		return studservice.getAll();
	}
	
	@PostMapping("/save")
	public ResponseEntity<StudentRecord> saveStudent(@RequestBody StudentRecord studrec) {
		return studservice.saveStudent(studrec);
	}
	
	@GetMapping("/byfirstname")
	public StudentRecord getStudentByFirstName(@RequestParam(value="firstname") String firstname) {
		return studservice.getStudentByFirstName(firstname);
	}
	
	@GetMapping("/byfirstnameandlastname")
	public List<StudentRecord> getStudentByFirstNameAndLastName(@RequestParam(value="firstname") String firstname,
			@RequestParam(value="lastname") String lastname){
		return studservice.getStudentByFirstNameAndLastName(firstname, lastname);
	}	
	
	@PutMapping("/update")
	public ResponseEntity<StudentRecord> updateStudent(@RequestBody StudentRecord studrec) {
		return studservice.updateStudentRecord(studrec);
	}
	
	@GetMapping("/alldept")
	public List<Department> getAllNamesofDept(){
		return studservice.getAllDept();
	}
	
	@GetMapping("/deptname")
	public Department getDeptName(@RequestParam(value="id") long id) {
		return studservice.getDeptNameofStud(id);
	}
	@RequestMapping(method = RequestMethod.DELETE, value="/delstud")
	public String deleteStudent(@RequestParam(value="id") Long id) {
		return studservice.deleteStudent(id);
	}
	
}
