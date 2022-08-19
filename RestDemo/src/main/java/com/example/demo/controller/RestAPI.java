package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.GetResponse;
import com.example.demo.dto.PostResponse;
import com.example.demo.repo.RestRepo;

@RestController

public class RestAPI {
	
	@Autowired
	RestRepo repo;
	
	@GetMapping("/items")
	public GetResponse get() {
		return repo.getData();
	}
	
	@PostMapping("/items")
	public PostResponse post() {
		return repo.postData();
	}

}
