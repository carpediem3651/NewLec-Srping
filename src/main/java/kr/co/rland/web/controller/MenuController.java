package kr.co.rland.web.controller;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.MenuRepository;
import kr.co.rland.web.service.MenuService;

@Controller
@RequestMapping("/menu")
public class MenuController {
	
	@Autowired
	private MenuService service;
	
	@RequestMapping("list")
	public String list(Model m, HttpServletRequest request) {
		
		List<Menu> list = service.getList();
		
		m.addAttribute("list", list);
		m.addAttribute("test", "test입니다.");
		
		System.out.println("test");
		return "/WEB-INF/view/menu/list.jsp";
	}
	
	@RequestMapping("detail")
	public String datail() {
		return "/WEB-INF/view/menu/detail.jsp";
	}
}
