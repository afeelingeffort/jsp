<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	*{
		margin:0;
		padding:0;
	}
	
	body{
			font-family: Arial, sans-serif;
	}
	
	header{
		font-size:20px;
		padding:30px;
		text-align: center;
	}
	
	section{
		border:1px solid black;
		padding: 30px;
		margin : 20px;
		
	}
	
	input{
		width:400px;
	}
	
	div{
		margin:auto;
		text-align:center;
		display:inline-block;
	}
	
</style>
</head>
<body>
	<header>
		<h1>flex box form 태그 만들어보기</h1>
	</header>
	
	<section>
		<form action="주소" method = "post">
			<label for="name">Name : </label>
			<div>
				<input type="text" id="id" >
			</div><br><br>
			<label for="pw">password : </label>
			<div>
				<input type="password" id="pw">
			</div>
		</form>
	</section>
</body>
</html>