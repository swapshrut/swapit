package com.swapit.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swapit.demo.entity.Students;

@Repository
public interface DemoRepository extends JpaRepository<Students, Integer> {

}
