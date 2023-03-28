package com.mj;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MyServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String adminId = getServletConfig().getInitParameter("adminId");
		String adminPw = getServletConfig().getInitParameter("adminPw");
		
		System.out.println("adminId : "+adminId);
		System.out.println("adminPw : "+adminPw);
		
		String imgDir = getServletConfig().getInitParameter("imgDir");
		String testServerIp = getServletConfig().getInitParameter("testServerIp");
		String realServerIp = getServletConfig().getInitParameter("realServerIp");
		
		System.out.println(imgDir);
		System.out.println(testServerIp);
		System.out.println(realServerIp);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
