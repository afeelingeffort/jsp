package com.mj.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/logincontroller")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 요청
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String password = request.getParameter("password");

		System.out.println("name : " + name);
		System.out.println("password : " + password);

		// 응답
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/x-www-form-urlencoded; charset=utf-8;");

		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("이름 : " + name + "비밀번호 : " + password);
		out.print("</html></body>");
	}

}
