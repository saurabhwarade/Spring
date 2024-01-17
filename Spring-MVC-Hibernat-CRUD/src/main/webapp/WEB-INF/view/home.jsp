<%@ page import="org.example.Model.Student" %><%--
  Created by IntelliJ IDEA.
  User: saura
  Date: 17-01-2024
  Time: 14:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>

<h1>hello</h1>
<%Student student = (Student)request.getAttribute("student");%>
<a href="profile.jsp">profile</a>



</body>
</html>
