package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Student;
import com.example.demo.Repositories.StudentRepo;

@Service

public class StudentService {
	
	@Autowired
	StudentRepo stuRepo;
	public Student insert(Student s)
	{
		return stuRepo.save(s);
	}
	public Student updateDetails(Student s1)
	{
		return stuRepo.saveAndFlush(s1);
	}
	public void deleteDetails(int id)
	{
		stuRepo.deleteById(id);
	}

}
