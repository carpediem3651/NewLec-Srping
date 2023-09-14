package kr.co.rland.web.controller.menu;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.MenuRepository;

public class DetailController implements Controller {
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		long id = Long.parseLong(request.getParameter("id"));
		
		ServletContext application = request.getServletContext();
		
		SqlSessionFactory sqlSessionFactory = (SqlSessionFactory)application.getAttribute("sqlSessionFactory");
		SqlSession sqlSession = sqlSessionFactory.openSession();
		MenuRepository repository = sqlSession.getMapper(MenuRepository.class);
		Menu m = repository.findById(id);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/WEB-INF/view/menu/detail.jsp");
		mv.addObject("m", m);
		
		return mv;
	}

//	@Override
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//		long id = Long.parseLong(request.getParameter("id"));
//		
//		ServletContext application = request.getServletContext();
//		
//		SqlSessionFactory sqlSessionFactory = (SqlSessionFactory)application.getAttribute("sqlSessionFactory");
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//		MenuRepository repository = sqlSession.getMapper(MenuRepository.class);
//		Menu m = repository.findById(id);
//		
//		request.setAttribute("m", m);
//		
//		request.getRequestDispatcher("/WEB-INF/view/menu/detail.jsp").forward(request, response);
//		
//	}
	
}
