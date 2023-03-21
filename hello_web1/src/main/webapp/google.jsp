<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Google</title>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
}

a {
	text-align: right;
}

.title {
	padding: 30px;
	text-align: center;
}

.search {
	position: relative;
	width: 500px;
}

.text {
	width: 100%;
	border: 1px solid #bbb;
	border-radius: 10px;
	padding: 10px 12px;
	font-size: 14px;
}

img{
	position:absolute;
	width:20px;
	margin:0;
}

.button{
	display:flex;
}

.btn1{
	flex:1;
}

.btn2{
	flex:1;
}

.btn3{
	flex:1;
}
</style>
</head>
<body>
	<div class="menu">
		<h4>
			<a href="login.jsp">Gmail</a>
		</h4>
		<h4>
			<a href="">이미지</a>
		</h4>
		<h4>
			<a href="">메뉴</a>
		</h4>
	</div>
	<section>
		<div class="title">
			<h1>Google</h1>
		</div>

		<div class="search">
			<input class="text" type="text" placeholder="검색어 입력"> 
			<img src="https://s3.ap-northeast-2.amazonaws.com/cdn.wecode.co.kr/icon/search.png">
		</div>

		<div class="button">
			<button class="btn1" type="button"></button>
			<button class="btn2" type="button"></button>
			<button class="btn3" type="button"></button>
		</div>
	</section>
</body>
</html>