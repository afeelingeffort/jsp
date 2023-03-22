package com.mj;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HiServlet
 */

// Servlet 다시 생성됐으니 재시작해야 함.
@WebServlet("/hiServlet")
public class HiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HiServlet() {
        super();
    }

    //http://localhost:8080/demo1/hiServlet
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hiServlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
