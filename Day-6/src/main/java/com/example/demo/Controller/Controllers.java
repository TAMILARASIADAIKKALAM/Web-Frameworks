package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Babydetails;
import com.example.demo.Service.Bservice;


@RestController
public class Controllers {
	@Autowired
	private Bservice S;
	@PostMapping("/add")
	public Babydetails adddetail(@RequestBody Babydetails obj)
	{
		return S.postdetail(obj);
	}
	@GetMapping("/show")
	public List<Babydetails> showdetail()
	{
		List<Babydetails> a = new ArrayList<>();
		a = S.getdetail();
		return a;
	}
	@GetMapping("/sort/{field}")
	public List<Babydetails> getWithSort(@PathVariable String field) {
		return S.getSorted(field);
	}
	@GetMapping("/page/{offset}/{pageSize}")
	public List<Babydetails> productsWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
		return S.getWithPagination(offset, pageSize);
	}
}
