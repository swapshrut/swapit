package com.swapit.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.swapit.demo.entity.Students;
import com.swapit.demo.service.DemoServiceImpl;

@RestController
public class DemoController {

	@Autowired
	DemoServiceImpl service;

	@PostMapping("/students/save")
	private ResponseEntity<String> saveStudent(@RequestBody Students std) {
		service.saveStudents(std);
		return new ResponseEntity<>("Student Saved", HttpStatus.OK);
	}

	@GetMapping("/students/getAll")
	public List<Students> getAll() {
		return service.getAll();
	}

	@GetMapping("/students/get/{id}")
	public Optional<Students> getById(@PathVariable int id) {
		return service.getById(id);
	}

	@PutMapping("/students/update")
	public void updateStudent(@RequestBody Students std) {
		service.updateStudent(std);
	}

	@DeleteMapping("/students/delete/{id}")
	public void deleteStudent(@PathVariable int id) {
		service.deleteStudent(id);
	}

}
