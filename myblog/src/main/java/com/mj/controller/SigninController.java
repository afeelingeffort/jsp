package com.mj.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SigninController
 */
@WebServlet("/signinController")
public class SigninController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SigninController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String isRemember = request.getParameter("isRemember");
		String hobby = request.getParameter("hobby");
		String[] likes = request.getParameterValues("like");

		System.out.println("email : " + email);
		System.out.println("password : " + password);
		System.out.println("isRemember : " + isRemember);
		System.out.println("hobby : " + hobby);
		for (String like : likes) {
			System.out.println("like : " + like);
		}
	}

}
