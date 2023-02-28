package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.Babydetails;
public interface Babyrepo extends JpaRepository<Babydetails,Integer> {

}
