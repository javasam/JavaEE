<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Главная страница</title>
</head>
<body>

<H1>Students DB</H1>

<div>
    <a href="/students">Get All Students</a><BR><BR>

    <p>
        Добавить нового студента
    </p>
    <form method="get" action="/students">
        <p><input type="text" name="id"></p>
        <p><input type="text" name="name"></p>
        <p><input type="text" name="familyName"></p>
        <p><input type="text" name="age"></p>
        <p><input type="text" name="contact"></p>
        <p><input type="text" name="city"></p>
        <input type="submit">
    </form>
</div>
</body>
</html>
