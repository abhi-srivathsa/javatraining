<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display Page</title>
</head>
<body>

<c:choose>
	<c:when test = "${list.size()>0}">
		<h1>List of Users</h1>
		<table border = "2" bgcolor = "cyan">
			<tr>
				<th>Name</th><th>Login</th><th>User Type</th>
			</tr>
			<c:forEach var = "vuser" items ="${list}">
			<tr><td>${vuser.name }</td><td>${vuser.login}</td><td>${vuser.type}</td></tr>
			</c:forEach>
		
		</table>
	</c:when>
	<c:otherwise>
		<font color = "red" size = "5">No Data was Found</font>
	</c:otherwise>
</c:choose>


<%-- 
<% List lst = (List)request.getAttribute("list");
	if(lst == null){
%>
<%=lst %>
No Data was found
<%
	}
	else{
%>
	<h1>List of users</h1>
	<br>
	${list}
<%} %> 
--%>
</body>
</html>