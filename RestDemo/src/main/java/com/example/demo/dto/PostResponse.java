package com.example.demo.dto;

import java.util.HashMap;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostResponse {
	
	private Integer id;
	private String status;
	private HashMap<String, String> config;

}
