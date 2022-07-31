package com.server.kmoim.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.server.kmoim.api.dto.BoardDto;
import com.server.kmoim.api.service.BoardService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags = {"게시판 API"})
public class BoardController {

	@Autowired
	private BoardService service;
	
	// 전체 리스트 불러오기
//	@GetMapping("/board/total")
//	@ApiOperation(value = "total")
//	public List<BoardDto> getTotalList(){
//		return service.getTotalList();
//	}
	
	// 게시판별 리스트(목록) 불러오기
	@GetMapping("/board/menu/{menuNo}")
	@ApiOperation(value = "list")
	public List<BoardDto> selectList(@PathVariable int menuNo){
		return service.selectList(menuNo);
	}
	
	@GetMapping("/board/{boardNo}")
	@ApiOperation(value = "one")
	public BoardDto selectOne(@PathVariable int boardNo) {
		return service.selectOne(boardNo);
	}
	
	// 글 작성
	@PostMapping("/board/write")
	@ApiOperation(value = "write")
	public int createBoard(@RequestBody BoardDto dto) {
		return service.createBoard(dto);
	}
	
	// 글 수정
	@PostMapping("/board/edit")
	@ApiOperation(value = "edit")
	public int updateBoard(@RequestBody BoardDto dto) {
		return service.updateBoard(dto);
	}
	
	// 조회수 증가
	@PostMapping("/board/hit")
	@ApiOperation(value = "hit")
	public int updateHit(int boardNo) {
		return service.updateHit(boardNo);
	}
	
	// 글 삭제
	@GetMapping("/board/delete/{boardNo}")
	@ApiOperation(value = "delete")
	public int deleteBoard(@PathVariable int boardNo) {
		return service.deleteBoard(boardNo);
	}
	
}
