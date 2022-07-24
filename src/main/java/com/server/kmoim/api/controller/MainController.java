package com.server.kmoim.api.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.server.kmoim.api.service.MainService;

@RestController
public class MainController {

	@Autowired
	private MainService mainService;
	
	@GetMapping("/test")
	public Map<String, Object> test(){
		return mainService.test();
	}
	
}
