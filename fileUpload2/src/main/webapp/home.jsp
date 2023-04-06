<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="uploadProc" method="post" enctype="multipart/form-data">
		<label for="file">
			<input type="file" id="file" name="file">
		</label>
		
		<input type="submit"> 
	</form>
</body>
</html>