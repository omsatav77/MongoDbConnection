package com.mongoDb.connectionTrial.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongoDb.connectionTrial.models.Student;
import com.mongoDb.connectionTrial.repo.StudentRepository;

@RestController
@RequestMapping("/student")
public class MyController {

	@Autowired
	StudentRepository studentRepository;

	@PostMapping("/add")
	public ResponseEntity<?> addstudent(@RequestBody Student student) {
		Student save = studentRepository.save(student);
		return ResponseEntity.ok(save);
	}

	@GetMapping("/all")
	public ResponseEntity<?> getstudent(@RequestBody Student student) {
		return ResponseEntity.ok(this.studentRepository.findAll());
	}

	// find By ID
	@GetMapping("/Byid/{id}")
	public ResponseEntity<?> getstudentByid(@PathVariable int id) {
		return ResponseEntity.ok(this.studentRepository.findById(id));

	}

	// delete by id

	@DeleteMapping("/deleteByid/{id}")
	public ResponseEntity<Optional<Student>> deleteStudentByid(@PathVariable int id) {
		ResponseEntity<Optional<Student>> student = ResponseEntity.ok(this.studentRepository.findById(id));
		this.studentRepository.deleteById(id);
		return student;
	}

	@GetMapping("/hi")
	public String hi(@RequestBody Student student) {
		return "hiii";
	}

}
