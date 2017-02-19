<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: marcus.chiu
  Date: 9/29/16
  Time: 9:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>THIS IS THE INDEX.JSP</h1>
<form:form method="GET" action="/home">
    <table>
        <tr>
            <td>
                <input type="submit" value="Redirect Page"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
