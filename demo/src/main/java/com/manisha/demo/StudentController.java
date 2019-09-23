package com.manisha.demo;



import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {
	private StudentReport std;
	
	@PostMapping("/student")
	public StudentReport updateMarks(@RequestBody StudentReport sr) {
		std=new StudentReport();
		std.setChemistry(sr.getChemistry());
		std.setMaths(sr.getMaths());
		std.setPhysics(sr.getPhysics());
		std.setAverage((std.getChemistry()+std.getMaths()+std.getPhysics())/3);
		return std;
	} 

}
