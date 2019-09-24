package com.manisha.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	private StudentReport std;
	private List<StudentReport> srl;
	
	@PostMapping("/")
	public String updateMarks(@RequestBody StudentReport sr) {
		String rst ="";
		if(srl == null) {
			srl=new ArrayList<>();
		}
		
		for(StudentReport stdrpt: srl) {
			if(sr.getId() == stdrpt.getId()) {
				rst="Student cannot be added as id is present";
			}
		}
		if(!(rst.equals(""))) return rst;
		std=new StudentReport();
		std.setId(sr.getId());
		std.setName(sr.getName());
		std.setChemistry(sr.getChemistry());
		std.setMaths(sr.getMaths());
		std.setPhysics(sr.getPhysics());
		std.setAverage((std.getChemistry()+std.getMaths()+std.getPhysics())/3);
		srl.add(std);
		if(rst.equals("")) rst = "Successfully added the student with id:  "+sr.getId();
		return rst;
	}
	
	@GetMapping("/{id}")
	public StudentReport getStudentById(@PathVariable(value="id") int id) {
		StudentReport sr = null;
		for(StudentReport studobj: srl) {
			if(id==studobj.getId()) {
				sr=studobj;
			} 
		}
		return sr;
	}
	
	@GetMapping("/")
	public List<StudentReport> getAllStudent() {
		return srl;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public String deleteStudentById(@PathVariable(value="id") int id) {
		String rst="Id is not present";
		for(StudentReport sr: srl) {
			if(id==sr.getId()) {
				rst="Succesfully deleted the student  "+id;
				srl.remove(sr);
			}
		}
		return rst;
	}
}
