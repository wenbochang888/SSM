<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>Hello World</h1><hr>
	<h1>增加</h1>
	<form action="addStudent" method="post">
		<table>
			<tr>
				<td>no:</td>
				<td><input type = "text" name = "sno" value = "${param.sno }"></td>
			</tr>
			<tr>
				<td>name:</td>
				<td><input type = "text" name = "sname" value = "${param.sname }"></td>
			</tr>
			<tr>
				<td>phone:</td>
				<td><input type = "text" name = "phone" value = "${param.phone }"></td>
			</tr>
			<tr>
				<td><input type = "submit" value = "Add" class="btn btn-primary"></td>
			</tr>
		</table>		
	</form>
	<hr>
	<h1>查看</h1>
	<a href = "showAllStudent">ShowAllStudent</a>
	
	<c:if test="${requestScope.students != null }">
		<br><br><br><br>
		<table border="1" cellpadding="10" cellspacing="1" >
		<tr>
			<td>no</td>
			<td>name</td>
			<td>phone</td>
			<td>delete</td>
		</tr>
		<c:forEach items="${requestScope.students }" var="s">
			<tr>
				<td>${s.sno }</td>
				<td>${s.sname }</td>
				<td>${s.phone }</td>
				<td><a href = "delete?sno=${s.sno} ">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	</c:if>
	
</body>
</html>