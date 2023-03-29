package com.tenco.todo.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tenco.todo.dto.CategoryDTO;
import com.tenco.todo.dto.TodoDTO;
import com.tenco.todo.repository.TodoDAO;

@WebServlet("/sTodoTest")
public class STodoTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public STodoTest() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		TodoDAO dao = new TodoDAO();
		request.setCharacterEncoding("UTF-8");
		
		String action = request.getParameter("action");
		if("delete".equals(action)) {
			String cid = request.getParameter("cid");
			dao.delete(Integer.parseInt(cid));
			response.sendRedirect("/test/sTodoTest");
		} else if("select".equals(action)){
			ArrayList<TodoDTO> todoList = dao.select();
			System.out.println(todoList.toString());
			
			request.setAttribute("todoList", todoList);
			RequestDispatcher dispatcher = request.getRequestDispatcher("todoTest/todoList.jsp");
			dispatcher.forward(request, response);
		} else {
			String cid = request.getParameter("categoryId");
			String id = request.getParameter("id");
			String name = request.getParameter("name");
			ArrayList<CategoryDTO> cList = dao.selectCategoryIdAndTodoId(Integer.parseInt(cid),Integer.parseInt(id), name);
			System.out.println(cList.toString());
			
			request.setAttribute("cList", cList);
			RequestDispatcher dispatcher = request.getRequestDispatcher("test/categoryList.jsp");
			dispatcher.forward(request, response);
		}
		
	}

	// form태그 -> post
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		int responseCount = 0;
		TodoDAO todoDAO = new TodoDAO();
		TodoDTO dto = new TodoDTO();
		String action = request.getParameter("action");
		
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		String priority = request.getParameter("priority");
		String categoryId = request.getParameter("categoryId");
		
		//dto, dao 둘 다 선언 dto.setTitle() = request.getParameter("title");
		if (action.equals("insert")) {

			dto = new TodoDTO(title, description, Integer.parseInt(priority), Integer.parseInt(categoryId));
			
			responseCount = todoDAO.insert(dto);
		} else if(action.equals("update")) {
			String id = request.getParameter("id");
			dto = new TodoDTO(Integer.parseInt(id), title, description, Integer.parseInt(priority),Integer.parseInt(categoryId));
			
			responseCount = todoDAO.update(dto.getId(), dto);
		}

		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		out.print("적용된 갯수 확인 : " + responseCount);
	}

}
