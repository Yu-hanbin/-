<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Form</title>
</head>
<body>
	
	<form action="/insertMember" method="post">
		
		이름 : <input type="text" name="member_name"><br>
		연락처 : <input type="tel" name="member_phone"><br>
		주소 : <input type="text" name="member_address"><br>
		나이 : <input type="text" name="member_age"><br>
		성별 : 남자 <input type="radio" value = "남자" name="member_gender">
			  여자 <input type="radio" value = "여자" name="member_gender"><br>
	
		<input type="submit" value="등록하기">
	</form>
	
	
</body>
</html>