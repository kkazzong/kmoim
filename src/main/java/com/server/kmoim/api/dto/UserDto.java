package com.server.kmoim.api.dto;

import lombok.Data;

@Data
public class UserDto {

	
	private int         userNo;
	private String      userId;
	private String      userPass;
	private String      userName;
	private String      userNick;
	private String      createDt;
	private String      updateDt;
	private String      delYn;
	private int         gradeNo;
	private int         loginType;
	private String      userPhone;

}
