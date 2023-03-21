package com.tenco.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/usercontroller")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserController() {
		super();
	}

	// 화면에 나타남. (form태그를 이용하여 아이디, 회원가입 기능을 만들 때)
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 문제 2
		// JSON형식으로 name = 홍길동, age = 10이라는 값을 리턴시키세요. (응답)
		// CHARSET은 Writer 전에
		response.setContentType("application/json; charset=utf-8;");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		out.print("{\"name\":\"홍길동\"\"age\":10}");
	}

	// 데이터베이스의 데이터를 갖고 와서
	// 사용자가 아이디, 회원가입을 완료했을 때 완료했다고 나타나게 해줄 수 있음.
	// Method : post
	// action : http://localhost:8080/blog/usercontroller
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// form 태그에서 넘어오는 값들을 받아보고 ?? 연산을 해서 응답 처리
//		System.out.println("확인");

		// 요청시 파라미터로 넘겨온 키값을 확인해서 값을 추출하는 기술을 알아보자.
		// request에 달려 옴
		// 키 값은 body내용과 똑같아야 함
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String password = request.getParameter("password");

		System.out.println("name : " + name);
		System.out.println("password : " + password);

		// 응답 처리
		// MIME TYPE text/html 방식 -> 이름과 비번을 확인하였습니다.
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8;");

		PrintWriter out = response.getWriter();
		out.print("이름과 비번을 확인하였습니다.");

	}

}
