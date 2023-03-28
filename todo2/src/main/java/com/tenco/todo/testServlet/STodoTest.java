package com.tenco.todo.testServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tenco.todo.repository.TodoDAO;
import com.tenco.todo.utils.DBHelper;

@WebServlet("/sTodoTest")
public class STodoTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		DBHelper dbHelper = new DBHelper();
		dbHelper.getConnection();
	}

	public STodoTest() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	//form태그 -> post
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		int responseCount = 0;
		TodoDAO todoDAO = new TodoDAO();
		String action = request.getParameter("action");
		
		String title = request.getParameter("title");
		
		if (action.equals("insert")) {
			String description = request.getParameter("description");
			String priority = request.getParameter("priority");
			String categoryId = request.getParameter("categoryId");
			responseCount = todoDAO.insert(title, description, Integer.parseInt(priority), Integer.parseInt(categoryId));
			
		} else if(action.equals("update")) {
			String id = request.getParameter("id");
			responseCount = todoDAO.update(Integer.parseInt(id), title);
		}

		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		out.print("적용된 갯수 확인 : " + responseCount);
	}

}
