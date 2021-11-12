package com.spring.mapper;

import java.util.List;

import com.spring.model.MemberDTO;

public interface MemberMapper {

	public List<MemberDTO> list_all();

	public void insert(MemberDTO dto);

}
