<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
<style type="text/css">
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

body {
	display: flex;
	justify-content: center;
	display: flex;
}

/*
flex-grow 값은 flex item이 늘어날 수 있는 비율을 지정하며, 기본값은 0이다.
flex-grow 속성을 사용하여 확장하는 크기 비율을 조절할 수 있다.
*/
.page-container {
	flex: 1 0 0;

	display: flex;
	justify-content: center;
	flex-direction: column;
	
	max-width: 500px;
	background-color: blanchedalmond;
}

.header {
	height: 80px;
	flex: 0 0 80px;
	border-bottom: 1px solid gray;
	
	display: flex;
	justify-content: flex-end;
	align-items: center;
	padding: 0 20px;
}

.main-container {
	flex: 1;
	padding:0 16px;
}

.section-title-heading{
	margin:20px 0;
	font-size: 1.5rem;
}

.section-home-menu{
	display: flex;
	justify-content: flex-start;
}

.menu-icon{
	display: flex;
	flex-direction: column;
	border: 1px solid gray;
	
	padding:10px;
	border-radius:20px;
	align-items:center;
	justify-content:center;
	
	flex:0 0 20px;
	margin-right: 10px;
}

.article{
	display: flex;
	flex-direction: column;
	
}

.article-img{
	flex:2 0 30px;
	margin-bottom: 20px;
}

.article-img-description{
	flex:1;
}
</style>
</head>
<body>
	<div class="page-container">

		<div class="header">
		<span class="material-symbols-outlined">search</span>
		<span class="material-symbols-outlined" style="color:red">favorite</span>
		</div>
		
		<div class="main-container">
			<div class="section section-title">
				<h2 class="section-title-heading">Recipes</h2>
			</div>

			<div class="section section-home">

				<!-- 우리가 만든 아이콘 -->
				<div class="section-home-menu">
					<div class="menu-icon">
						<span class="material-symbols-outlined">home</span>
						<span>ALL</span>
					</div>
					<div class="menu-icon">
						<span class="material-symbols-outlined">home</span>
						<span>ALL</span>
					</div>
					<div class="menu-icon">
						<span class="material-symbols-outlined">home</span>
						<span>ALL</span>
					</div>
					<div class="menu-icon">
						<span class="material-symbols-outlined">home</span>
						<span>ALL</span>
					</div>
				</div>
				<br>
				<div class="article">
					<img alt="" class="article-img" src="images/burger.jpeg">
					<span class="article-img-description">버거를 직접 만들기 보단 사먹기</span>
				</div>
				<div class="article">
					<img alt="" class="article-img" src="images/coffee.jpeg">
					<span class="article-img-description">ㅋㅋ</span>
				</div>
				<div class="article">
					<img alt="" class="article-img" src="images/images.jpg">
					<span class="article-img-description">ㅎㅎ</span>
				</div>
			</div>
		</div>

	</div>
</body>
</html>