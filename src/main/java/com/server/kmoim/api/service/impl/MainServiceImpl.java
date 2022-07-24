package com.server.kmoim.api.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.server.kmoim.api.mappers.MainMapper;
import com.server.kmoim.api.service.MainService;

@Service
public class MainServiceImpl implements MainService {
	
	
	@Autowired
	private MainMapper mMapper;

	@Override
	public Map<String, Object> test() {
		// TODO Auto-generated method stub
		return mMapper.test();
	}
	
	
}
