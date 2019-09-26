package com.manisha.demo;

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
	
	
	private StudentService studService;
	
	public StudentController(StudentService studService) {
		this.studService= studService;
	}
	
	@PostMapping("/")
	public String updateMarks(@RequestBody StudentReport sr) {
		return studService.updateStudentMarks(sr);
	}
	
	@GetMapping("/{id}")
	public StudentReport getStudentById(@PathVariable(value="id") int id) {
		return studService.getStudentbyId(id);
	}
	
	@GetMapping("/")
	public List<StudentReport> getAllStudent() {
		return studService.getAllStudents();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public String deleteStudentById(@PathVariable(value="id") int id) {
		return studService.deleteStudentbyId(id);
	}
	
}
