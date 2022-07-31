package com.server.kmoim.api.dto;

import lombok.Data;

@Data
public class BoardDto {
	// 임시값
	private String userNick;
	private String menuName;

//	private UserDto userDto;
	
	private int boardNo;			// 게시글번호(PK)
	private int userNo;			// 사용자번호
	private int menuNo;			// 메뉴번호
	private String boardTitle;		// 제목(1000)
	private String boardContent;	// 내용
	private String createDt;		// 작성일시
	private String updateDt;		// 수정일시
	private int boardHit;			// 조회수
	private String replyYn;		// 댓글가능여부(Y/N)
	private String showYn;			// 공개여부(Y/N)
}


