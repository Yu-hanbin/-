package com.spring.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class MemberDTO {
	
	private Long member_no;
	private String member_name;
	private String member_phone;
	private String member_address;
	private int member_age; /*���߿� �����ϸ� ���糯¥���� ����⵵ ���� ���� �� �ְ� �ϱ�*/
	private String member_gender; /*������ư */ 
	private Timestamp member_regdate;
}
