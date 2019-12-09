<%--
  Created by IntelliJ IDEA.
  User: name
  Date: 2019/9/5
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<html>
<head>
    <base href="<%=basePath%>">
    <title>jsp test</title>
</head>
<body>
    <h1>测试 jsp页面</h1>
    <<a href="/hellop">abc</a>
</body>
</html>