<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script>
var notexists = true;
	function check(loginval) {
		xmlhttp = new XMLHttpRequest();
		xmlhttp.onreadystatechange = function() {
			if (xmlhttp.readyState == 4) {
				val = xmlhttp.responseText;
				alert(val);
				if(val == "Username exists"){
					alert('true');
					notexists =  false;
				}
				else{ 
					alert('false');
					notexists = true;
				}
			}
		}
		xmlhttp.open("GET", "checklogin?loginval=" + loginval, true);
		xmlhttp.send(null);
	}
	function docheck(){
		return notexists;
	}
</script>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add new user</title>
</head>
<body>
	<form action="register" method="post" onsubmit="return docheck()">
		<table>
			<tr>
				<td>Enter name :</td>
				<td><input type="text" name="name" required></td>
			</tr>
			<tr>
				<td>Enter login :</td>
				<td><input type="text" name="login" required onblur="check(login.value)"
					></td>
			</tr>
			<tr>
				<td>Enter Password:</td>
				<td><input type="text" name="password" required></td>
			</tr>
			<tr>
				<td>Enter UserType:</td>
				<td><select name="type">
						<c:forEach var="vtype" items="${list1}">
							<option value="${vtype.type}">${vtype.type}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>