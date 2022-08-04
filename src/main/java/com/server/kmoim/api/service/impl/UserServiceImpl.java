package com.server.kmoim.api.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.server.kmoim.api.dto.UserDto;
import com.server.kmoim.api.mappers.UserMapper;
import com.server.kmoim.api.service.UserService;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper mapper;
	
	@Override
	public String join(UserDto dto) {
		
		String result = "";
		
		if(mapper.join(dto) > 0 ) {
			result = "succes";
		}
		else {
			result = "fail";
		}
		
		return result;
	}

	@Override
	public List<UserDto> list() {
		
		return mapper.list();
	}

	@Override
	public UserDto detail(UserDto dto) {
		return mapper.detail(dto);
	}

	@Override
	public String update(UserDto dto) {
		
		String result = "";
		
		if(mapper.update(dto) > 0 ) {
			result = "succes";
		}
		else {
			result = "fail";
		}
		
		return result;
	}

	@Override
	public String delete(UserDto dto) {
		
		String result = "";
		
		if(mapper.delete(dto) > 0 ) {
			result = "succes";
		}
		else {
			result = "fail";
		}
		
		return result;
	}

}
