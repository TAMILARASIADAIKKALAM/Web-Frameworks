package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Empdetails;
import com.example.demo.repository.Emprepo;


@Service

public class Empservice  {

	@Autowired
	private Emprepo repo;
	
	public Empdetails addEmp(Empdetails obj)
	{
		return repo.save(obj);
	}
	
	public List<Empdetails> getEmp()
	{
		List<Empdetails> arr=new ArrayList<>();
		arr=repo.findAll();
		return arr;
	}
}