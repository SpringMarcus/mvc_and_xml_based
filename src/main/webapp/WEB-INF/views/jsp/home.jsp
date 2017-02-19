<%@ page import="com.marcus.chiu.web.ControllerConfig" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: marcus.chiu
  Date: 9/28/16
  Time: 8:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>This is The Home Page</h2>

<!-- redirects to a different '.jsp' file, this would redirect to 'user.jsp' -->
<!-- action="..." grabs the correct String, this would return "/user" -->
<form:form method="GET" action="<%=ControllerConfig.USER%>" >
    <input type="submit" value="USER"/>
</form:form>

<form:form method="GET" action="<%=ControllerConfig.STATIC_PAGE%>">
    <input type="submit" value="STATIC"/>
</form:form>
</body>
</html>
