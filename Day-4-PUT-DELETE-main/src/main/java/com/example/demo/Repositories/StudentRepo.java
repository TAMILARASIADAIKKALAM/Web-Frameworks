package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
