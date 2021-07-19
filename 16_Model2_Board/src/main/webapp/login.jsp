<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<style>
	#container { width: 700px; margin: 0 auto; }
	h1 { text-align: center; }
	table { border-collapse: collapse; }
	table, th, td {
		border: 1px solid black;
		margin: 0 auto;
	}
	th { background-color: orange; }
	.center { text-align: center; }
</style>
</head>
<body>

<div id="container">
	<h1> 로그인 </h1>
	<form action="login.do" method="post">
	<table>
		<tr>
			<th> 아이디 </th>
			<td><input type="text" name="id"></td> <!-- VO 변수와 name 값 일치 -->
		</tr>
		<tr>
			<th> 패스워드 </th>
			<td><input type="text" name="password"></td>
		</tr>
		<tr>
			<td colspan="2" class="center">
			<input type="submit" value="로그인">
		</tr>
	</table>
	</form>
</div>
</body>
</html>