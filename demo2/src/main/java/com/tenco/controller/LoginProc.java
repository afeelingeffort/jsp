package com.tenco.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginProc
 */
@WebServlet("/loginProc")
public class LoginProc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginProc() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	// method : POST (form 태그에서)
	// POST로 하는 이유가 보안 때문에 하는 건가요 ?
	// http://localhost:8080/demo2/loginProc
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// form태그 --> 반드시 속성 name = "email" -> value = "a@naver.com"
		request.setCharacterEncoding("UTF-8");

		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String isRemember = request.getParameter("isRemember");
		String hobby = request.getParameter("hobby");
		// !!! 배열처리 다중 선택 !!!
		String[] likes = request.getParameterValues("like");

		System.out.println("email : " + email);
		System.out.println("password : " + password);
		System.out.println("isRemember : " + isRemember);
		System.out.println("hobby : " + hobby);
		if (likes != null) {
			for (String like : likes) {
				System.out.println("like : " + like);
			}
		}

	}

}
