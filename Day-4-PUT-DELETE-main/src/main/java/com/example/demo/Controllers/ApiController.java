package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Student;
import com.example.demo.Service.StudentService;

@RestController

public class ApiController {
	@Autowired
	StudentService stuService;
	@PostMapping("/addDetails")
	public Student addInfo(@RequestBody Student s)
	{
		return stuService.insert(s);
	}
	@PutMapping("/updateDetails")
	public Student updateInfo(@RequestBody Student s1)
	{
		return stuService.updateDetails(s1);
	}
	@DeleteMapping("/delete/{id}")
	public  String deleteInfo(@PathVariable("id") int id)
	{
		stuService.deleteDetails(id);
		return "Deleted Details";
	}

}
