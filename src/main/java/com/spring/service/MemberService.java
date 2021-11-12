package com.spring.service;

import java.util.List;

import com.spring.model.MemberDTO;

public interface MemberService {

	List<MemberDTO> list_all();

	void insert(MemberDTO dto);

}
