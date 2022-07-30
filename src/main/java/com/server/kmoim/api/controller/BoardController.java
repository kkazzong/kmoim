package com.server.kmoim.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	// 게시판별 리스트 불러오기
	@GetMapping("/board/{menuNo}")
	@ApiOperation(value = "list")
	public List<BoardDto> getBoardList(@PathVariable int menuNo){
		return service.getBoardList(menuNo);
	}
	
}
