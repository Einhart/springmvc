<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>i.jsp</h3>
	<form action="/springmvc/upload/upload.do" method="post" enctype="multipart/form-data">
		photo:<input type="file" name="photo" /><br />
		<button>go</button>
	</form>
</body>
</html>