package com.server.kmoim.api.service;

import java.util.List;

import com.server.kmoim.api.dto.BoardDto;

public interface BoardService {
//	public List<BoardDto> getTotalList();
	public List<BoardDto> getBoardList(int menuNo);
}
