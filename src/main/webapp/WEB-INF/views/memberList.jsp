<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">

	<tr>
		<td>회원번호</td>
		<td>이름</td>
		<td>성별</td>
		<td>등록일</td>
	</tr>
	
	<c:forEach var="memberList" items="${memberList}">
		<tr>
			<td>${memberList.member_no}</td>
			<td><a href="">${memberList.member_name}</a></td>
			<td>${memberList.member_gender}</td>
			<td>${memberList.member_regdate}</td>
		</tr>
	</c:forEach>

</table>
</body>
</html>