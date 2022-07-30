package com.server.kmoim.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.server.kmoim.api.dto.BoardDto;
import com.server.kmoim.api.mappers.BoardMapper;
import com.server.kmoim.api.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardMapper mapper;

//	@Override
//	public List<BoardDto> getTotalList() {
//		return mapper.getTotalList();
//	}

	@Override
	public List<BoardDto> getBoardList(int menuNo) {
		return mapper.getBoardList(menuNo);
	}
}