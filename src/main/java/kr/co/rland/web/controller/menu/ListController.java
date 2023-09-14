package kr.co.rland.web.controller.menu;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.MenuRepository;

public class ListController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ServletContext application = request.getServletContext();
		//하나의 서블릿 안에서 사용가능한 저장소
		//둘 사이에서만 공유할 수 있는 저장소 = request
		
		SqlSessionFactory sqlSessionFactory = (SqlSessionFactory)application.getAttribute("sqlSessionFactory");
		SqlSession sqlSession = sqlSessionFactory.openSession();
		MenuRepository repository = sqlSession.getMapper(MenuRepository.class);
		List<Menu> list = repository.findAll();
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/WEB-INF/view/menu/list.jsp");
		mv.addObject("list", list);
		
		// forwarding
		return mv;
	}
	
	

//	@Override
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		ServletContext application = request.getServletContext();
//		//하나의 서블릿 안에서 사용가능한 저장소
//		//둘 사이에서만 공유할 수 있는 저장소 = request
//		
//		SqlSessionFactory sqlSessionFactory = (SqlSessionFactory)application.getAttribute("sqlSessionFactory");
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//		MenuRepository repository = sqlSession.getMapper(MenuRepository.class);
//		List<Menu> list = repository.findAll();
//		request.setAttribute("list", list);
//		
//		request.getRequestDispatcher("/WEB-INF/view/menu/list.jsp").forward(request, response);
//		
//	}
	
}
