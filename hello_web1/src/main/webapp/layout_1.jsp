<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	*{
		box-sizing: border-box;
		margin:0;
		padding:0;
	}
	
	body{
		margin:0;
		justify-content: center;
	}
	
	h1, h2, h3, h4, h5, h6{
		margin:0;
	}
	
	section{
		width:1300px;
		margin:40px 20px;
		padding:20px;
		background-color: #fff;

		display: flex;
	}
	
	
	article.main{
		flex:3;
		order:2;
 		justify-content: center; 
		
		display:flex;
		flex-direction: column;
	}

	article.main img{
		flex:1;
	}
	
	article.side1{
		flex:1;
		order:1;
		text-align:left;
	}
	
	article.side2{
		flex:1;
		order:3;
		text-align: right;
	}
	
	
</style>
</head>
<body>
	<section>
		<article class="main">
			<img alt="메인 이미지" src="images/main_img.jpg">
			<h2>main Content</h2>
			<p>It is a long established fact that a reader will be distracted by the
			readable content of a page when looking at its layout. The point of
			using Lorem Ipsum is that it has a more-or-less normal distribution
			of letters, as opposed to using 'Content here, content here', making
			it look like readable English. Many desktop publishing packages and
			web page editors now use Lorem Ipsum as their default model text, and
			a search for 'lorem ipsum' will uncover many web sites still in their
			infancy. Various versions have evolved over the years, sometimes by
			accident, sometimes on purpose (injected humour and the like).
			</p>
		</article>

		<article class="side1">
			<h2>Side Content1</h2>
			It is a long established fact that a reader will be distracted by the
			readable content of a page when looking at its layout. The point of
			using Lorem Ipsum is that it has a more-or-less normal distribution
			of letters, as opposed to using 'Content here, content here', making
			it look like readable English. Many desktop publishing packages and
			web page editors now use Lorem Ipsum as their default model text, and
			a search for 'lorem ipsum' will uncover many web sites still in their
			infancy. Various versions have evolved over the years, sometimes by
			accident, sometimes on purpose (injected humour and the like).
		</article>

		<article class="side2">
			<h2>Side Content2</h2>
			It is a long established fact that a reader will be distracted by the
			readable content of a page when looking at its layout. The point of
			using Lorem Ipsum is that it has a more-or-less normal distribution
			of letters, as opposed to using 'Content here, content here', making
			it look like readable English. Many desktop publishing packages and
			web page editors now use Lorem Ipsum as their default model text, and
			a search for 'lorem ipsum' will uncover many web sites still in their
			infancy. Various versions have evolved over the years, sometimes by
			accident, sometimes on purpose (injected humour and the like).
		</article>
	</section>
</body>
</html>