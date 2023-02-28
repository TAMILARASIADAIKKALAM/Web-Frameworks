package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Entity.Babydetails;
import com.example.demo.Repository.Babyrepo;


@Service
public class Bservice  {

	@Autowired
	private Babyrepo repo;
	
	public Babydetails postdetail(Babydetails obj)
	{
		return repo.save(obj);
	}
	
	public List<Babydetails> getdetail()
	{
		List<Babydetails> arr=new ArrayList<>();
		arr=repo.findAll();
		return arr;
	}
	
	public List<Babydetails> getSorted(String field) {
		return repo.findAll(Sort.by(Sort.Direction.DESC,field));
	}
	
	public List<Babydetails> getWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
		Page<Babydetails> page =repo.findAll(PageRequest.of(offset,pageSize));
		return page.getContent();
	}
}