package com.example.student;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	private StudentRepository studrepo; 
	private DepartmentRepository deptrepo;
	
	public StudentService(StudentRepository studrepo, DepartmentRepository deptrepo) {
		this.studrepo=studrepo;
		this.deptrepo=deptrepo;
	}
	
	public List<StudentRecord> getAll(){
		return studrepo.findAll();
	}
	public List<Department> getAllDept(){
		return deptrepo.findAll();
	}
	
	public ResponseEntity<StudentRecord> saveStudent(StudentRecord studrec){
		studrepo.save(studrec);
		return new ResponseEntity<StudentRecord> (studrec,HttpStatus.OK);	
	}
	
	public StudentRecord getStudentByFirstName(String firstName) {
		return studrepo.findByFirstName(firstName);
	}
	public List<StudentRecord> getStudentByFirstNameAndLastName(String firstName, String lastName) {
		return studrepo.findByFirstNameAndLastName(firstName, lastName);
	}
	
	public ResponseEntity<StudentRecord> updateStudentRecord(StudentRecord studrec) { 
		studrepo.save(studrec);
		return new ResponseEntity<StudentRecord> (studrec,HttpStatus.OK);	
	}
	
	public Department getDeptNameofStud(long id) {
		StudentRecord studrec = studrepo.findById(id);
		System.out.println(studrec.getDeptId());
		return deptrepo.findByDeptId(studrec.getDeptId());
	}
	public String deleteStudent(Long id) {
		studrepo.deleteById(id); 
		return "Deleted the student Succesfully whose id is:" + id;
	}
}
