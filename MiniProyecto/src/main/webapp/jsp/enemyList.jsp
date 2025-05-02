<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="https://jakarta.ee/xml/ns/jakartaee/jstl/core" %>
<html>
<head><title>Listado de Enemigos</title></head>
<body>
<h2>Enemigos</h2>
<table border="1">
    <tr>
        <th>ID</th><th>Vida</th><th>Velocidad</th>
        <th>¿Muerto?</th><th>Tipo</th>
    </tr>
    <c:forEach var="e" items="${enemies}">
        <tr>
            <td>${e.id}</td>
            <td>${e.health}</td>
            <td>${e.moveSpeed}</td>
            <td><c:out value="${e.dead}"/></td>
            <td>${e.enemyType}</td>
        </tr>
    </c:forEach>
</table>
<a href="../index.jsp">Volver</a>
</body>
</html>
