<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>l.jsp</h3>

	<form action="${pageContext.request.contextPath }/user/save.do" method="post">
		uid:<input type="text" name="uid" value="${param.uid }" />${uidError } <br />
		uname:<input type="text" name="uname" value="${param.uname }" />${unameError } <br />
		birthday:<input type="text" name="birthday" value="${param.birthday }" />${birthdayError } <br />
		money: <input type="text" name="money" />${moneyError } <br />
		cellphone: <input type="text" name="cellphone" value="${param.cellphone }" />${cellphoneError } <br />
		<button type="submit">GO</button>
	</form>
</body>
</html>