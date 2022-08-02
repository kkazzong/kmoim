package com.server.kmoim.api.mappers;

import java.util.List;

import com.server.kmoim.api.dto.UserDto;

public interface UserMapper {
	
	public int join(UserDto dto);
	
	public List<UserDto> list();
	
	public UserDto detail(UserDto dto);
	
	public int update(UserDto dto);
	
	public int delete(UserDto dto);
	
//	public List<UserDto> userSearch(String word);

}
