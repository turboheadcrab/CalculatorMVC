<%--
  Created by IntelliJ IDEA.
  User: turbo
  Date: 25.3.17
  Time: 1:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>

<form method="post">

    <input type="text" name="a" value="${a}"/>
    +
    <input type="text" name="b" value="${b}/">
    = ${result}
    <input type="submit">
</form>
</body>
</html>
