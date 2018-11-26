<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/26
  Time: 18:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HomePage</title>
</head>
<body>
<form action="/project01" method="post">
    This is the homepage....<br>
    username:<input type="text" name="uname" value=""/><br/>
    password:<input type="password" name="pwd" value=""/><br/>
    favorite:<br/>
    <input type="checkbox" name="favorite" value="1">Singing<br/>
    <input type="checkbox" name="favorite" value="2">Dancing<br/>
    <input type="checkbox" name="favorite" value="3">Playing<br/>
    <input type="submit" value="submit"/>
</form>
</body>
</html>
