package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.Repository.Bookrepo;
import com.example.demo.entity.Book;

@Service
public class ApiService {

	@Autowired 
	private Bookrepo r;
	
	public List<Book> getdet() {
		List<Book> a=new ArrayList<>();
		a=r.findAll();
		return a;
	}
	
	public Optional<Book> getdetbyId(int id) {
		Optional<Book> b=r.findById(id);
		return b;
	}
	public Book saveDetails(Book bk) {
		return r.save(bk);
	}
	
	public Book updateBook(int id,Book obj) {
		return r.saveAndFlush(obj);
	}
	
	public void delByid(int id) {
		r.deleteById(id);
	}
	
	
	
}
