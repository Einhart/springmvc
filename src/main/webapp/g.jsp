<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="JS/jquery-1.10.2.js"></script>
<script type="text/javascript">
	$(function() {
		$("#btn1").click(function(){
			alert(1);
			$.ajax({
				type:"post",
				url:"user/f5.do",
				data:"{\"uid\":12, \"uname\":\"kkkk\",\"birthday\":\"2012/12/21\"}",
				headers: {
					Accept:"string/s"
				},
				contentType:"string/s"
			});
		});
	});
</script>
</head>
<body>
	<h3>g.jsp</h3>
	<button type="button" id="btn1">ajax g1</button>
</body>
</html>