<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="https://jakarta.ee/xml/ns/jakartaee/jstl/core" %>
<html>
<head><title>Listado de Mariposas</title></head>
<body>
<h2>Mariposas</h2>
<table border="1">
    <tr>
        <th>ID</th><th>Top Offset</th><th>Bottom Offset</th><th>Pause Time</th>
    </tr>
    <c:forEach var="m" items="${mariposas}">
        <tr>
            <td>${m.id}</td>
            <td>${m.topOffset}</td>
            <td>${m.bottomOffset}</td>
            <td>${m.pauseTime}</td>
        </tr>
    </c:forEach>
</table>
<a href="../index.jsp">Volver</a>
</body>
</html>
