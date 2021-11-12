package com.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.model.MemberDTO;
import com.spring.service.MemberService;

@Controller
public class HomeController {
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/")
	public String home() {
	
		return "home";
	}
	
	@GetMapping("/memberList")
		public String memberList(Model model) {
		
		List<MemberDTO> memberList = memberService.list_all();
		model.addAttribute("memberList", memberList);
		
		return "memberList";
		
	}
	
	@GetMapping("/insertMember")
		public String insertForm() {
			return "insertForm";
	}
	
	@PostMapping("/insertMember")
	public String insertMember(MemberDTO dto) {
		memberService.insert(dto);
		
		return "redirect:/";
		
	}
	
}
