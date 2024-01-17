<%--
  Created by IntelliJ IDEA.
  User: saura
  Date: 17-01-2024
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Student</title>
</head>
<body>


<form action="login" method="get">
    <%
        String msg = (String) request.getAttribute("msg");
        if (msg != null) {
    %>
    <h1><%=msg%>
    </h1>
    <%
            session.removeAttribute("msg");
        }
    %>
    <table>
        <tr>
            <td>Email:</td>
            <td><input type="text" name="email"></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type="text" name="password"></td>
        </tr>
        <tr>

            <td><input type="submit" value="Log in"></td>
        </tr>
    </table>
</form>
</body>
</html>
