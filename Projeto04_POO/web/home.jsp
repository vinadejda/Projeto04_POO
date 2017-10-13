<%-- 
    Document   : index
    Created on : 13/10/2017, 17:32:18
    Author     : vitoria
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="WEB-INF/jspf/session.jspf"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quiz</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/header.jspf"%>
        <%@include file="WEB-INF/jspf/menu.jspf"%>
        <%="Olá, " + sessao.getAttribute(login)%>
        <%@include file="WEB-INF/jspf/footer.jspf"%>
    </body>
</html>
