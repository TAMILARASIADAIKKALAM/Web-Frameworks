package com.example.demo.Contorller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ApiService;
import com.example.demo.entity.Book;

@RestController
public class ApiController {

	@Autowired
	private ApiService s;
	
	@GetMapping("/s")
	public List<Book> ShowDetails(){
		List<Book> a=new ArrayList<>();
		a=s.getdet();
		return a;
	}
	@GetMapping("/s/{id}")
	public Optional<Book> showDetailsId(@PathVariable int id){
		return s.getdetbyId(id);
		
	}
	
	@PostMapping("/")
	public Book postBook(@RequestBody Book bk) {
		return s.saveDetails(bk);
	}
	
	@PutMapping("/upd/{id}")
	public void updateBook(@PathVariable int id,@RequestBody Book obj)
	{
		s.updateBook(id,obj);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteBook(@PathVariable int id) {
		s.delByid(id);
	}
	
	
	
	
}
