<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>

<style type="text/css">
@import
	url('https://fonts.googleapis.com/css?family=Noto+Sans+KR:300,400&display=swap')
	;

@import
	url("https://fonts.googleapis.com/css?family=Poppins:200,300,400,500,600,700,800,900&display=swap")
	;

* {
	margin: 0;
	padding: 0;
}

body {
	font-family: 'Noto Sans KR', sans-serif;
	background-color: Lightyellow;
	color: dimGray;
	height: 100vh;
	padding: 10px;
	display: flex;
	justify-content: center;
	align-items: center;
	flex-direction: column;
}

h1 {
	display: inline;
	align-items: center;
	justify-content: center;
	margin-bottom: 50px;
}

form {
	border: 1px solid #808080;
	width: 500px;
	height: 430px;
	padding: 30px;
	border-radius: 10px;
}

.form1 {
	margin-left: 10px;
}

.form-group {
	margin-top: 10px;
	margin: 20px;
}

h3 {
	margin-top: 10px;
}

.pwdClass, .emailClass {
	height: 20px;
	width: 450px;
	margin-top: 10px;
	border-radius: 10px;
	border: 1px solid silver;
	padding: 10px;
}

.w-btn {
	color: dimGray;
	border: none;
	display: inline-block;
	padding: 15px 30px;
	border-radius: 15px;
	font-family: "paybooc-Light", sans-serif;
	box-shadow: 0 15px 35px rgba(0, 0, 0, 0.2);
	text-decoration: none;
	font-weight: 600;
	transition: 0.25s;
	position: relative;
}

.w-btn-outline {
	position: relative;
	border-radius: 15px;
	font-family: "paybooc-Light", sans-serif;
	box-shadow: 0 15px 35px rgba(0, 0, 0, 0.2);
	text-decoration: none;
	font-weight: 600;
	transition: 0.25s;
}

.w-btn w-btn-indigo {
	border: none;
	border-radius: 10px;
	text-decoration: none;
}

a:link {
	color: orange;
	text-decoration: none;
}

a:visited {
	color: orange;
	text-decoration: none;
}

a:hover {
	color: orange;
	text-decoration: underline;
}

button {
	margin-top: 5px;
	margin-left: 10px;
}
</style>
</head>
<body>
	<!-- 
		signin.html 요청을 하면 화면을 그리는 담당
		1. 요청 URL
		form태그 중 method 속성과 action 속성에 대해 알아보고
		name값과 password 값을 보낼 수 있는 화면을 구성하시오.
		
		2. 버튼을 누르면 연산처리를 할 sublet객체를 만들어주세요.
			method 방식 : post
			서버 콘솔창에 넘겨 받은 데이터를 출력하시오.
	 -->

	<h1>Sign in to your account</h1>

	<form action="signinController" method="post">

		<div class="form1">
			<h3>
				<label class="labelMargin">UserEmail*</label>
			</h3>
			<input type="text" class="emailClass" id="email" name="email"
				placeholder="Enter your email">
		</div>

		<div class="form1">
			<h3>
				<label class="labelMargin">Password*</label>
			</h3>
			<input type="password" class="pwdClass" id="password" name="password"
				placeholder="Enter your password">
		</div>

		<div class="form1">
			<h5>
				Forgot your password? <a href="#">Reset password</a>
			</h5>
		</div>

		<div class="form-group">
			<h4>
				<label for="isRemember">- Remember me</label> <input type="checkbox"
					id="isRemember" name="isRemember">
			</h4>
		</div>

		<div class="form-group">
			<h4>
				<label for="hobby">- hobby</label> <select name="hobby">
					<option value="코딩">코딩</option>
					<option value="공부">공부</option>
					<option value="프로젝트" selected="selected">프로젝트</option>
					<option value="운동">운동</option>
					<option value="술마시기">술마시기</option>
				</select>
			</h4>
		</div>

		<div class="form-group">
			<h4>- liked Animal</h4>
			<h4>
				<input type="checkbox" name="like" value="cat" id="cat"> <label
					for="cat">Cat</label> <input type="checkbox" name="like"
					value="dog" id="dog"> <label for="dog">Dog</label> <input
					type="checkbox" name="like" value="lion" id="lion"> <label
					for="lion">Lion</label>
			</h4>
		</div>

		<button class="w-btn w-btn-indigo" type="submit">Submit</button>
	</form>
</body>
</html>