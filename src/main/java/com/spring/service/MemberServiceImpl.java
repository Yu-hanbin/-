package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mapper.MemberMapper;
import com.spring.model.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper mapper;
	
	@Override
	public List<MemberDTO> list_all() {
		return mapper.list_all();
	}
	
	@Override
	public void insert(MemberDTO dto) {
		mapper.insert(dto);
	}

}
