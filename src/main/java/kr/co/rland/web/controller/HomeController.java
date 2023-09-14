package kr.co.rland.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //객체 생성 annotation
public class HomeController {
	
//	@ResponseBody
	@RequestMapping("/index")
	public String index(String s) {
		
		System.out.println(s);
		
		return "/WEB-INF/view/index.jsp";
	}
}
