package com.example.demo.Controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Empdetails;
import com.example.demo.service.Empservice;


@RestController
public class Controllers {
	@Autowired
	private Empservice Sserve;
	@PostMapping("/add")
	public Empdetails postStudent(@RequestBody Empdetails emp)
	{
		return Sserve.addEmp(emp);
	}
	
	@GetMapping("/show")
	public List<Empdetails> showEmp()
	{
		List<Empdetails> a = new ArrayList<>();
		a = Sserve.getEmp();
		return a;
	}
	
}

