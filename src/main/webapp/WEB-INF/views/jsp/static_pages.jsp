<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: marcus.chiu
  Date: 9/29/16
  Time: 10:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Static Pages</title>
</head>
<body>
<h2>Static Pages</h2>
<p>Click the button below to get a simple HTML page</p>
<form:form method="GET" action="/static_page/staticPage">
    <table>
        <tr>
            <td>
                <input type="submit" value="Get HTML Page"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
