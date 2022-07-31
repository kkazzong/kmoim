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
	public List<BoardDto> selectList(int menuNo) {
		return mapper.selectList(menuNo);
	}

	@Override
	public BoardDto selectOne(int boardNo) {
		return mapper.selectOne(boardNo);
	}
	
	@Override
	public int createBoard(BoardDto dto) {
		return mapper.createBoard(dto);
	}

	@Override
	public int updateBoard(BoardDto dto) {
		return mapper.updateBoard(dto);
	}

	@Override
	public int updateHit(int boardNo) {
		return mapper.updateHit(boardNo);
	}

	@Override
	public int deleteBoard(int boardNo) {
		return mapper.deleteBoard(boardNo);
	}

}