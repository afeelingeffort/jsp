<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 마지막에 /를 써야함 안 쓰면 오류 -->
<jsp:include page="/layout/header.jsp"/>

<style>
	main{
		height:300px;
		display: flex;
		justify-content: center;
		align-items: center;
	}
</style>

<main>
	여기는 index.jsp 파일입니다.
</main>

<jsp:include page="/layout/footer.jsp"/>