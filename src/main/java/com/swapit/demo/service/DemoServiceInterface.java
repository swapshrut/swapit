package com.swapit.demo.service;

import java.util.List;
import java.util.Optional;

import com.swapit.demo.entity.Students;

public interface DemoServiceInterface {

	public void saveStudents(Students std);
	public List<Students> getAll();
	public Optional<Students> getById(int id);
	public void updateStudent(Students std);
	public void deleteStudent(int id);
	
}


