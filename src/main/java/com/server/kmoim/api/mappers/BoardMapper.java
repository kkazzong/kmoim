package com.server.kmoim.api.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.server.kmoim.api.dto.BoardDto;

@Mapper
public interface BoardMapper {
	// 전체 리스트 불러오기
//	public List<BoardDto> getTotalList();
	// 게시판별 리스트 불러오기
	public List<BoardDto> getBoardList(int menuNo);
}
