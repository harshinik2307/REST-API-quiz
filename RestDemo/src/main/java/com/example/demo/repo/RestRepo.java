package com.example.demo.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.GetResponse;
import com.example.demo.dto.PostRequest;
import com.example.demo.dto.PostResponse;

@Component
public class RestRepo {
	
	@Autowired
	RestTemplate template;
	
	
	public GetResponse getData() {
		return template.getForEntity("https://u75wqjpcti.execute-api.us-west-1.amazonaws.com/dev/items", GetResponse.class).getBody();
	}
	
	public PostResponse postData() {
		return template.postForEntity("https://u75wqjpcti.execute-api.us-west-1.amazonaws.com/dev/items",new PostRequest(), PostResponse.class).getBody();
		
	}

}
