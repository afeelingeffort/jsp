<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<style>
	*{
		margin:0;
		padding:0;
		box-sizing: border-box;
	}
	
	header{
		text-align: center;
		padding:100px;
	}
	
	section{
		border : 1px solid gray;
	}
	
	input{
		outline:none;
		background-color:olive;
		border-radius:10px;
	}
</style>
</head>
<body>
	<header>
		<h1>로그인</h1>
	</header>
	
	<section>
		<form action="주소" method="post">
			<div class="text">
				<input type="text" placeholder = "아이디">
			</div>
			<div class="password">
				<input type="password" placeholder = "비밀번호">
			</div> 
		</form>
		
		<input type="submit" value="로그인">
		<input type="reset" value="초기화">
		<input type="button" value="회원가입">
	</section>
</body>
</html>