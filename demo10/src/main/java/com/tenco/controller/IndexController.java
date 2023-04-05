package com.tenco.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/inc")
public class IndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public IndexController() {
		super();
	}

	// GET 방식에 대한 복습
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// http://localhost:8080/demo10/inc?name=홍길동&pw=1234
		// 1. 요청 : 콘솔에 한글 안 깨짐.
//		String username = request.getParameter("name");
//		String pw = request.getParameter("pw");
//
//		response.setContentType("text/html; charset=UTF-8");
//		System.out.println("username" + username);
//		System.out.println("pw" + pw);

		// 2. 응답 : 한글 깨짐. 해결방법 - setContentType 설정하기
//		PrintWriter out = response.getWriter();
//		out.print("username : " + username);
//		out.print("<br>");
//		out.print("pw : " + pw);

		// index.jsp
		// path : URI 개념 (또는 URL)
		// docBase : 폴더 경로로 지정 --> 루트 경로 : webapp --> WEB-INF => index.jsp

		// WEB-INF에 넣어두면 보안상으로 바로 접근할 수 없어서 forward 방식으로 처리를 한다.
		// http://localhost:8080/demo10/inc
		request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// post 방식
		// 1. 요청으로 들어온 값 콘솔창 한글 깨짐. 해결방법 - setCharachterEncoding:UTF-8
//		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("name");
		String pw = request.getParameter("pw");

		System.out.println("username" + username);
		System.out.println("pw" + pw);

		// 2. 응답처리
		// 2. 응답시 한글 깨짐. 해결방법 - setContentType 설정
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("사용자 이름 : " + username);
		out.print("<br>");
		out.print("사용자 비번 : " + pw);
	}

}
