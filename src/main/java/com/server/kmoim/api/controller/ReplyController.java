package com.server.kmoim.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.server.kmoim.api.dto.ReplyDto;
import com.server.kmoim.api.service.ReplyService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags = {"댓글 API"})
public class ReplyController {

	@Autowired
	private ReplyService service;
	
	// 댓글 리스트(목록) 불러오기
	@GetMapping("/reply/{boardNo}")
	@ApiOperation(value = "list")
	public List<ReplyDto> selectList(@PathVariable int boardNo){
		return service.selectList(boardNo);
	}
	
	// 댓글 작성
	@PostMapping("/reply/write")
	@ApiOperation(value = "write")
	public int createReply(@RequestBody ReplyDto dto) {
		return service.createReply(dto);
	}
	
	// 댓글 수정
	@PostMapping("/reply/edit")
	@ApiOperation(value = "edit")
	public int updateReply(@RequestBody ReplyDto dto) {
		return service.updateReply(dto);
	}

	// 댓글 삭제
	@GetMapping("/reply/delete/{replyNo}")
	@ApiOperation(value = "delete")
	public int deleteReply(@PathVariable int replyNo) {
		return service.deleteReply(replyNo);
	}
	
}
