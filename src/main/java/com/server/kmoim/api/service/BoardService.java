package com.server.kmoim.api.service;

import java.util.List;

import com.server.kmoim.api.dto.BoardDto;

public interface BoardService {
//	public List<BoardDto> getTotalList();
	public List<BoardDto> selectList(int menuNo);
	public BoardDto selectOne(int boardNo);
	public int createBoard(BoardDto dto);
	public int updateBoard(BoardDto dto);
	public int updateHit(int boardNo);
	public int deleteBoard(int boardNo);
}
