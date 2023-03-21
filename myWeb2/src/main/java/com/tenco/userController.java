package com.tenco;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class userController
 */
@WebServlet("/uc")
public class userController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public userController() {
        super();
        System.out.println("UserController 생성자 호출");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("UserController doGet 메서드 호출");
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		PrintWriter out = response.getWriter();
		// HTTP 메세지 - http 메세지 헤더에 정의가 된다.
		// ContentType -> text/html, application/json
		// contentType 이란 응답 보낼 데이터 타입의 형식
		// 웹 표준 기술인 MIME TYPE이라는 것이 정해져 있다.
//		response.setContentType("application/x-www-form-urlencoded");
	}

	// 주소 경로는 똑같지만 METHOD 선정에 따라 구분할 수 있다. --> 서버는 !
	// http://localhost:8080/myWeb2/uc -> get 방식으로 동작함
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("METHOD 방식 중 POST 요청 방식을 확인하고 응답 처리해보자.");
		
		//MIME TYPE : text/plain
		//Mike 문자열을 응답처리해주세요
		
//		request.setCharacterEncoding("UTF-8");
		
		
		//doPost 동작시키기 위해서는 Method : post 방식을 이해해야 한다.
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain; charset=utf-8;");
		
		//response.getWriter(); <-- 뽑고 난 다음에 수정해서 변경이 안됨.
		PrintWriter out = response.getWriter();
		out.print("홍길동");
		out.flush();
		out.close();
		
	}

}
