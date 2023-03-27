<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 마지막에 /를 써야함 안 쓰면 오류 -->
<jsp:include page="/layout/header.jsp" />

<style>
main {
	display: flex;
	padding: 20px;
	flex-direction: column;
	align-items: center;
	justify-content: flex-start;
}

main pre {
	width: 100%;
	border: 1px solid black;
	padding: 20px;
}

table{
	width:400px;
	font-size: 14px;
	margin:20px;
	text-align: center;
	border-collapse: collapse;
}

td{
	background-color: #f2f2f2;
	border : 1px solid #ccc;
}
</style>

<main>
	<h1>구구단 예제</h1>
	<table>
			<tr><% for(int i=2; i<10; i++) { %>
			<td><%=i %>단</td>
			</tr>
			<tr><% for(int j=1; j<10; j++) { %>
				<td><%=i %>X<%=j %>=<%=i*j %></td>
			</tr>
			<% } %>
		<% } %>
	</table>
	
	<br>
	<pre>
		스크립트릿과 표현식을 잘 구분해보자.
	</pre>
</main>

<jsp:include page="/layout/footer.jsp" />
