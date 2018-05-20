<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan" text="red">
<h1>Register Information...</h1>

<form:form method="post" action="empregister" commandName="reg" >
<table border="1" align="left">
<tr>
<td><form:label path="id">Id</form:label></td>
<td><form:input path="id"/></td>
</tr>

<tr>
<td><form:label path="name">Name</form:label>
<td><form:input path="name"/></td>
</tr>

<tr>
<td><form:label path="address">Address</form:label>
<td><form:input path="address"/>
</tr>

<tr>
<td><form:label path="salary">Salary</form:label>
<td><form:input path="salary"/>
</tr>
<tr>
               <td colspan = "2" align="center">
                  <input type = "submit" value = "Save"/>
               </td>
</table>
</form:form>
</body>
</html>