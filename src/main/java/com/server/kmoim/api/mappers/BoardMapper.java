package com.server.kmoim.api.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.server.kmoim.api.dto.BoardDto;

@Mapper
public interface BoardMapper {
	// 전체 리스트 불러오기
//	public List<BoardDto> getTotalList();
	// 게시판별 리스트 불러오기
	public List<BoardDto> selectList(int menuNo);
	// 글 상세보기
	public BoardDto selectOne(int boardNo);
	// 글 작성
	public int createBoard(BoardDto dto);
	// 글 수정
	public int updateBoard(BoardDto dto);
	// 조회수 증가
	public int updateHit(int boardNo);
	// 글 삭제
	public int deleteBoard(int boardNo);
}
