package com.server.kmoim.api.service;

import java.util.List;

import com.server.kmoim.api.dto.ReplyDto;

public interface ReplyService {
	public List<ReplyDto> selectList(int boardNo);
	public int createReply(ReplyDto dto);
	public int updateReply(ReplyDto dto);
	public int deleteReply(int replyNo);
}
