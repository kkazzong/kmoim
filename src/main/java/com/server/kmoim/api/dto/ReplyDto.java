package com.server.kmoim.api.dto;

import lombok.Data;

@Data
public class ReplyDto {
	// 임시값
	private String userNick;
	
	
	private int replyNo;			// 댓글번호(PK)
	private int boardNo;			// 게시글번호
	private int userNo;			// 사용자번호
	private String replyContent;	// 내용
	private String createDt;		// 작성일자
	private String updateDt;		// 수정일자
	private String replyFileName;	// 파일명(500)
	private String replyFilePath;	// 파일경로(1000)
	private String showYn;			// 공개여부(Y/N)
}
