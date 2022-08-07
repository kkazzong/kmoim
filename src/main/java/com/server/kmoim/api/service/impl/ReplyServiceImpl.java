package com.server.kmoim.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.server.kmoim.api.dto.ReplyDto;
import com.server.kmoim.api.mappers.ReplyMapper;
import com.server.kmoim.api.service.ReplyService;

@Service
public class ReplyServiceImpl implements ReplyService {
	
	@Autowired
	private ReplyMapper mapper;

	@Override
	public List<ReplyDto> selectList(int boardNo) {
		return mapper.selectList(boardNo);
	}

	@Override
	public int createReply(ReplyDto dto) {
		return mapper.createReply(dto);
	}

	@Override
	public int updateReply(ReplyDto dto) {
		return mapper.updateReply(dto);
	}

	@Override
	public int deleteReply(int replyNo) {
		return mapper.deleteReply(replyNo);
	}

}