package kr.co.rland.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/index")
public class IndexController extends HttpServlet{
	// UI 담당 , 웹에서 사용자의 입출력 담당
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request: 입력도구, response: 출력도구
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8"); //하위버전에서도 동일하게 작동하기 위해 명시적으로 작성해줄 필요가 있음.
		PrintWriter out = response.getWriter();
		
		//사용자 입력값에 따른 출력 갯수 설정
		int size = 4;
		String size_ = request.getParameter("s");
		if(size_ != null)
			size = Integer.parseInt(size_);
		
		//주관식, 객관식 선택을 위한 변수
		int type = 1;
		String type_ = request.getParameter("t");
		if(type_ != null)
			type = Integer.parseInt(type_);
		
		out.write("<!DOCTYPE html>");
		out.write("<html>");
		out.write("<head>");
		out.write("<meta charset=\"UT-8\">");
		out.write("<title>Insert title here</title>");
		out.write("</head>");
		out.write("<body>");
		out.write("	Welcome vol.2 한글");
		if (type == 1) {
			out.write("	<hr>");
			out.write("	<h2>인삿말을 몇 번 듣고 싶으세요?</h2>");
			out.write("	<a href=\"/index?s=1\">1번</a><br>");
			out.write("	<a href=\"/index?s=5\">5번</a><br>");
			out.write("	<a href=\"/index?s=10\">10번</a><br>");
			out.write("	<a href=\"/index?s=100\">100번</a><br>");
		}
		else if (type == 2) {
			out.write("	<hr>");
			out.write("	<h2>인삿말을 몇 번 듣고 싶으세요?</h2>");
			out.write("	<form action =\"index\"> ");
			out.write("		<label>갯수입력</label> <input type=\"text\" name=\"s\">");
			out.write("		<input type=\"hidden\" name=\"t\" value=\"2\">");
			out.write("		<input type=\"submit\" value=\"요청\">");
			out.write("	</form>");
		}
		out.write("	<hr>");
		out.write(" <a href=\"index?t=1\">객관식</a> <a href=\"index?t=2\">주관식</a>");
		out.write("	<br>");
		out.write("	<hr>");
		out.write("</body>");
		out.write("</html>");

		for (int i = 0; i < size; i++) 
			out.println("안녕 servlet <br>");
		
	}
}
