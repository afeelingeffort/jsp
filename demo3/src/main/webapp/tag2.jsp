<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.TimeZone"%>
<!-- 마지막에 /를 써야함 안 쓰면 오류 -->
<jsp:include page="/layout/header.jsp"/>
<style>
	main{
		display:flex;
		padding:20px;
		/* 주축, 교차축의 개념 */
		flex-direction: column;
		align-items: center;
		justify-content: flex-start;
	}
	
	main pre{
		width:100%;
		border : 1px solid black;
		padding:20px;
	}
</style>

<main>
	<pre>
		선언문(declaration)
		<%! %> <-- 태그로 표현합니다.
		JSP 페이지에서 전역변수, 메서드, 클래스 등을 선언할 수 있습니다.
		스크립트릿과 달리, JSP 페이지에서 직접 호출할 수 없습니다.
		-------------------------------------------------------------
		선언문과 표현식 연습
		현재 시간은 한국 표기법으로 <%=getKoreanTime() %>
	</pre>
</main>

<%!
	public String getKoreanTime(){
		
		//서버의 시간대를 한국 시간대로 변경하기
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul"));
		
		//현재 시간을 가져와서 문자열로 변환
		Date now = new Date();
		System.out.println(System.currentTimeMillis());
		String timeStr = String.format("%tY년 %tm월 %td일 %tT", now, now, now, now);
		return timeStr;
	}
%>

<jsp:include page="/layout/footer.jsp"/>
