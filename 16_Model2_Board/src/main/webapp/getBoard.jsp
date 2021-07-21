<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- 전달 받은 값 화면 출력 --%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 상세(getBoard.jsp)</title>
</head>
<style>
	#container { width: 700px; margin: 0 auto; }
	h1, h3, p { text-align: center; }
	table { border-collapse: collapse; }
	table, th, td {
		border : 1px solid black;
		margin : 0 auto;
	}
	th { background-color: orange; }
	.center { text-align: center; }
	.border-none, .border-none td { border: none; }
</style>
<body>

<div id="container">
	<h1> 게시글 상세(getBoard.jsp) </h1>
	<p><a href="logout.do">Log-out</a></p>
	<hr>
	
	<form action="updateBoard.do" method="post">
		<input type="hidden" name="seq" value="${board.seq }">
	<table>
		<tr>
			<th width="70"> 제목 </th>
			<td>
				<input type="text" name="title" size="30"
					value="${board.title }">
			</td>
		</tr>
		<tr>
			<th> 작성자 </th>
			<td>
				<input type="text" name="writer" size="30"
					value="${board.writer }">
			</td>
		</tr>
		<tr>
			<th> 내용 </th>
			<td>
				<textarea name="content" rows="10" cols="40"
					value="${board.content }"></textarea>
			</td>
		</tr>
		<tr>
			<th> 등록일 </th>
			<td> ${board.regdate } </td>
		</tr>
		<tr>
			<th> 조회수 </th>
			<td> ${board.cnt } </td>
		</tr>
		<tr>
			<td colspan="2" class="center">
				<input type="submit" value="글 수정">
			</td>
		</tr>
	</table>
	</form>
	<p>
		<a href="insertBoard.jsp"> 글 등록 </a>
		<a href="deleteBoard.do?seq=${board.seq }"> 글 삭제 </a>
		<a href="getBoardList.do">글 목록</a> 
	</p>
</div>

</body>
</html>