<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: marcus.chiu
  Date: 9/29/16
  Time: 9:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Form Handling</title>
</head>
<body>
<h2>User Information</h2>
<form:form method="POST" action="/user/addUser">
    <table>
        <tr>
            <td><form:label path="name">Name</form:label></td>
            <td><form:input path="name"></form:input></td>
        </tr>
        <tr>
            <td><form:label path="age">Age</form:label></td>
            <td><form:input path="age"></form:input></td>
        </tr>
        <tr>
            <td><form:label path="id">ID</form:label></td>
            <td><form:input path="id"></form:input></td>
        </tr>

        <tr>
            <td colspan="2">
                <input type="submit" value="Submit" />
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
