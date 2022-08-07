package com.server.kmoim.api.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.server.kmoim.api.dto.ReplyDto;

@Mapper
public interface ReplyMapper {
	// 댓글 리스트(목록) 불러오기
	public List<ReplyDto> selectList(int boardNo);
	// 댓글 작성
	public int createReply(ReplyDto dto);
//	// 댓글 수정
	public int updateReply(ReplyDto dto);
	// 댓글 삭제
	public int deleteReply(int replyNo);
}
