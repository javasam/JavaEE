<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Главная страница</title>
</head>
<body>
Вы вошли как <%=request.getSession().getAttribute("login")%>,
<a href="/index?action=logout">выйти</a>

<H1>Students DB</H1>

<%
    if ("2".equals(request.getSession().getAttribute("role"))){%>
    <script>
            document.getElementsByName('studentAdd').setAttribute("disabled", "disabled");
    </script>
    <%}
%>
    <p>
        Добавить нового студента
    </p>
    <form method="post" name= "studentAdd" action="/dashboard">
        <h4>Имя</h4>
        <input type="text" name="name">
        <h4>Фамилия</h4>
        <input type="text" name="familyName">
        <h4>Возраст</h4>
        <input type="text" name="age">
        <h4>Телефон в формате + 7 999 123 456</h4>
        <input type="text" name="contact">
        <h4>Город</h4>
        <select name="city">
            <option value="Moscow">Moscow</option>
            <option value="Rostov">Rostov</option>
            <option value="Sankt-Peterburg">Sankt-Peterburg</option>
            <option value="Samara">Samara</option>
            <option value="Sochi">Sochi</option>
        </select>
        <p><input type="submit" name="submitButton"></p>
    </form>
    <div>
            <%
                if (request.getAttribute("familyName") != null) { %>

                    <%="<p>User: '" + request.getAttribute("familyName") + " " + request.getAttribute("name") + "' added!</p>"%>
                <%}%>
        <div>
</div>
</body>
</html>
