<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Loop Example</title>
<%
int tmp = 0;
for (int i = 0; i < 10; i++) {
	System.out.println(tmp++);
}
%>
</head>
<body>
	변수 선언 1 2 3 4 5 6 7 ... 10 반복문 사용해서
	<c:set var="count" value="0" />
	<c:forEach var="category" items=${list}>
		<c:set var="count" value="${count+1}" />
		<c:out value="${count}" />
	</c:forEach>

	<p>Number ${count}</p>
</body>
</html>