package com.server.kmoim.api.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.server.kmoim.api.dto.UserDto;
import com.server.kmoim.api.service.UserService;

@RestController("User")
public class UserController {

	@Autowired
	UserService service;
	
	
	@PostMapping("/join")
	public String join(UserDto dto) {
		return service.join(dto);
	}
	
	@GetMapping("/list")
	public List<UserDto> list(){
		return service.list();
	}
	
	@GetMapping("/detail/{userNo}")
	public UserDto detail(UserDto dto) {
		return service.detail(dto);
	}
	
	@PostMapping("/update")
	public String update(UserDto dto) {
		return service.update(dto);
	}
	
	@DeleteMapping("/delete")
	public String delete(UserDto dto) {
		return service.delete(dto);
	}
}
