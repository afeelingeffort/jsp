package com.tenco;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/ms")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MyServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		System.out.println("contentType : " + request.getContentType());

		// 이렇게 하면 번거로우니 jsp파일이 만들어진 거임
		// 클라이언트(웹 브라우저)에 응답
		response.setContentType("text/html; charset=utf-8;");
		PrintWriter out = response.getWriter();
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("</head>");
		out.print("<body>");
		out.print("<section>");
		out.print("<p style=\"color:red\">");
		out.print("배고파");
		out.print("</p>");
		out.print("</section>");
		out.print("</body>");
		out.print("</html>");

		// 응답 response 객체를 사용하면 된다.
		// 문자열을 보낼 수 있음.
//		response.setCharacterEncoding("UTF-8");
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(response.getOutputStream()));
//		bw.write("가나다라마바사");
//		bw.newLine();
//		bw.flush();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// doGet(request, response);
	}

}
