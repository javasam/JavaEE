<%@ page import="innopolis.pojo.Student" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Список студентов:</title>
</head>
<body>
<%
    List<Student> list = (List<Student>) request.getAttribute("list");
    for (Student student : list) {
        %>
        <%=student.getFamilyName()%> <%=student.getName()%> <%=student.getCity()%><BR>
        <%
    }
%>
<BR><BR>
<a href="/dashboard">&lt;&lt;Назад</a>
</body>
</html>
