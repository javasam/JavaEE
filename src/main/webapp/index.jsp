<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="header">
    <p>
        Введите логин и пароль для входа на сайт
    </p>
</div>
<%
    if ("wrongUser".equals(request.getParameter("action"))) {
%>
<div style="color:#AA0000">Неверное имя пользователя/пароль</div>
<%}%>
<%
    if ("noAuth".equals(request.getParameter("action"))) {
%>
<div style="color:#AA0000">Попытка получить доступ к закрытой части сайта. Сначала надо войти в систему</div>
<%}%>
<form action="/index" method="post">
    Логин:<BR>
    <input type="text" name="login"><BR>
    Пароль:<BR>
    <input type="password" name="password"><BR>
    <input type="submit">
</form>
</body>
</html>
