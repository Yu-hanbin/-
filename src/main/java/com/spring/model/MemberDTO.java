package com.spring.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class MemberDTO {
	
	private Long member_no;
	private String member_name;
	private String member_phone;
	private String member_address;
	private int member_age; /*나중에 가능하면 현재날짜에서 출생년도 빼서 구할 수 있게 하기*/
	private String member_gender; /*라디오버튼 */ 
	private Timestamp member_regdate;
}
