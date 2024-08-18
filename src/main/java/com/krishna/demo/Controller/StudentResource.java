package com.krishna.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.krishna.demo.Model.Student;
import com.krishna.demo.Repo.StudentRepository;

@RestController
public class StudentResource 
{
	
	@Autowired
	StudentRepository repo;
	
	@GetMapping(value="/students")
	public List<Student> getStudents()
	{	
		return repo.findAll();
	}
	
	@PostMapping(value="/create")
	public String createStudent(@RequestBody Student student) {
		repo.save(student);
		return "Saved Student";
	}
	
	@PutMapping(value="/update/{id}")
	public String updateStudent(@PathVariable int id, @RequestBody Student student) {
		Student updatedStudent = repo.findById(id).get();
		updatedStudent.setStudentID(student.getStudentID());
		updatedStudent.setStudentName(student.getStudentName());
		updatedStudent.setPoints(student.getPoints());
		repo.save(updatedStudent);
		return "Updated Student";
	}
	
	@DeleteMapping(value="/delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		Student deleteStudent = repo.findById(id).get();
		repo.delete(deleteStudent);
		return "Student Deleted";
	}	
}
