<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드</title>
</head>
<body>
	<!-- 파일 업로드를 하기 위해서 이걸 선언해줘야 한다. enctype="multipart/form-data" -->
	<form action="uploadProc" method="post" enctype="multipart/form-data">
		<label for="file">choose a file : </label>
		<input type="file" name="file" id="file">
		<br>
		<input type="submit" value="파일 업로드">
	</form>
</body>
</html>