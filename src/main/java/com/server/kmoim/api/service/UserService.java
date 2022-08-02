package com.server.kmoim.api.service;

import java.util.List;

import com.server.kmoim.api.dto.UserDto;

public interface UserService {

	public String join(UserDto dto);
	
	public List<UserDto> list();
	
	public UserDto detail(UserDto dto);
	
	public String update(UserDto dto);
	
	public String delete(UserDto dto);
	
//	public List<UserDto> userSearch(String word);
}
