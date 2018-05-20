<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="grey">
<h1>Employee Details....</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Address</th><th>Salary</th><th>Action</th><th>Action</th></tr>  

   <c:forEach var="list" items="${list}">   
   <tr>  
   <td>${list.id}</td>   
   <td>${list.name}</td>  
   <td>${list.address}</td>  
   <td>${list.salary}</td>  
   <td><a href="editEmployee/${employee.id}">Edit</a></td> 
   <td><a href="deleteEmployee/${employee.id}">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="register">Add New Employee</a> <br>
    
    
</body>
</html>