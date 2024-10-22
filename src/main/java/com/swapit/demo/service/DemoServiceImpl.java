package com.swapit.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swapit.demo.entity.Students;
import com.swapit.demo.repository.DemoRepository;

@Service
public class DemoServiceImpl implements DemoServiceInterface {

	@Autowired
	DemoRepository repo;

	@Override
	public void saveStudents(Students std) {
		repo.save(std);
	}

	public List<Students> getAll() {
		return repo.findAll();
	}

	@Override
	public Optional<Students> getById(int id) {
		return repo.findById(id);
	}

	@Override
	public void updateStudent(Students std) {
		repo.save(std);
	}

	@Override
	public void deleteStudent(int id) {
		repo.deleteById(id);

	}

}
