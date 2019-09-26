package com.manisha.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	private StudentReport std;
	private List<StudentReport> srl;
	public String updateStudentMarks(StudentReport sr) {
		String rst ="";
		if(srl == null) {
			srl=new ArrayList<>();
		}
		if(sr==null) return "Please create student before requesting...";
		
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
		std.setAverage(Math.round((std.getChemistry()+std.getMaths()+std.getPhysics())/3));
		srl.add(std);
		if(rst.equals("")) rst = "Successfully added the student with id:  "+sr.getId();
		return rst;
	}
	
	public StudentReport getStudentbyId(int id) {
		StudentReport sr = null;
		for(StudentReport studobj: srl) {
			if(id==studobj.getId()) {
				sr=studobj;
			} 
		}
		return sr;
	}
	public List<StudentReport> getAllStudents(){
		return srl;
	}
	public String deleteStudentbyId(int id) {
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
