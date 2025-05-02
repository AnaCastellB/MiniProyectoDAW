<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="https://jakarta.ee/xml/ns/jakartaee/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Castlevania • Perfil de ${user.username}</title>
    <link href="https://fonts.googleapis.com/css2?family=Cinzel:wght@400;700&display=swap" rel="stylesheet">
    <style>
        body {
            margin:0; padding:0;
            font-family: 'Cinzel', serif;
            color:#eee;
            background:
                    linear-gradient(rgba(0,0,0,0.7),rgba(0,0,0,0.7)),
                    url('${pageContext.request.contextPath}/images/castle_bg.jpg') no-repeat center center fixed;
            background-size:cover;
        }
        .card {
            max-width:380px;
            margin:5% auto;
            padding:2rem;
            background:rgba(0,0,0,0.6);
            border:2px solid #663399;
            border-radius:8px;
            box-shadow:0 0 20px rgba(0,0,0,0.8);
            text-align:center;
        }
        .card h1 {
            color:#ffdd57;
            text-shadow:2px 2px 4px #000;
            margin-bottom:1rem;
        }
        .card p { margin:.5rem 0; font-size:1.1rem; }
        .btn-group a {
            display:inline-block;
            margin:.5rem;
            padding:.5rem 1rem;
            background:#663399;
            color:#fff;
            text-decoration:none;
            border-radius:4px;
            transition:background .3s;
        }
        .btn-group a:hover { background:#8844aa; }
    </style>
</head>
<body>
<div class="card">
    <h1>Perfil: <c:out value="${user.username}"/></h1>
    <p><strong>Usuario:</strong> <c:out value="${user.username}"/></p>
    <p><strong>Contraseña:</strong> ••••••••</p>
    <div class="btn-group">
        <a href="<c:url value='/editProfile'/>">Editar Perfil</a>
        <a href="<c:url value='/logout'/>">Cerrar Sesión</a>
    </div>
</div>
</body>
</html>
