package com.krishna.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishna.demo.Model.Student;


public interface StudentRepository extends JpaRepository<Student, Integer>{

}
