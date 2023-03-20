<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<style type="text/css">
	*{
		box-sizing: border-box;
		margin:0;
		padding:0;
	}
	
	header{
		padding:50px;
		text-align: center;
	}
	
	section{
		border:1px solid black;
		width:700px;
		padding:30px;
		margin:10px;
		text-align: center;
	}
	
	.div-wrap{
		display: flex;
		padding : 20px;
	}
	
	.div-wrap label{
		flex:0.5;
	}
	
	.div-wrap input{
		flex:3.5;
	}
	
	#inputId{
		width:100px;
		height:50px;
		
	}
</style>
</head>
<body>
	<header>
		<h1>로그인</h1>
	</header>
	
	<section>
		<form>
			<div class="div-wrap">
				<!-- label의 for과 input의 id값이 같으면 연결됨 -->
				<label for="id">아이디 </label>
				<input type="text" id="id">
			</div>
			<div class="div-wrap">
				<label for="pw">비밀번호 </label>
				<input type="password" id="pw">
			</div>
			<input id="inputId" type = "submit" value="로그인">
		</form>
	</section>
</body>
</html>