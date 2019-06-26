<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>一朝进此门，万古如添付</h3>

	<form action="users" method="post">
		<button>post</button>
	</form>
	
	<form action="users" method="get">
		<button>get</button>
	</form>
	
	<form action="users/1" method="get">
		<button>get one</button>
	</form>
	
	<form action="users" method="post">
		<input type="hidden" name="_method" value="put" />
		<button>put</button>
	</form>
	
	<form action="users" method="post">
		<input type="hidden" name="_method" value="delete" />
		<button>delete</button>
	</form>
</body>
</html>