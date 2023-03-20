<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

@import url('https://fonts.googleapis.com/css?family=Noto+Sans+KR:300,400&display=swap');

	*{
		box-sizing:border-box;
		margin:0;
		padding:0;
	}
	
	body{
		font-family: 'Noto Sans KR', sans-serif;
		background-color: #eee; 
	}

	header{
		color:black;
		padding:30px;
		text-align: center;
	}	
	
	form{
		border:1px solid black;
		padding:10px;
		margin:20px;
	}
	
	.form-row{
		display: flex;
		padding:15px;
	}
	
	.form-row label{
		flex:0.5;
	}
	
	.form-row input{
		flex:3.5;
	}
	
	@media (max-width: 768px) {
	.form-row{
		display:flex;
		flex-direction: column;
	}
}
</style>
</head>
<body>
	<header>
		<h1>flex box form 태그 만들어보기</h1>
	</header>
	<section>
		<form action="주소" method="post">
			<div class="form-row">
				<label>Name : </label> 
				<input type="text" id = "username" name = "name">
			</div>
			<div class="form-row">
				<label>password : </label> 
				<input type="password" id ="userpw" name = "pw">
			</div>
		</form>
	</section>
</body>
</html>