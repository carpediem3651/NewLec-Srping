package kr.co.rland.web.controller.menu;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.MenuRepository;

//@WebServlet("/menu/detail")
public class DetailController2 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		long id = Long.parseLong(request.getParameter("id"));
		
		ServletContext application = request.getServletContext();
		
		SqlSessionFactory sqlSessionFactory = (SqlSessionFactory)application.getAttribute("sqlSessionFactory");
		SqlSession sqlSession = sqlSessionFactory.openSession();
		MenuRepository repository = sqlSession.getMapper(MenuRepository.class);
		Menu m = repository.findById(id);
		
		request.setAttribute("m", m);
		
		request.getRequestDispatcher("/WEB-INF/view/menu/detail.jsp").forward(request, response);
		
	}
	
}
