<%-- 
    Document   : logout
    Created on : 13/10/2017, 18:54:40
    Author     : vitoria
--%>

<%@include file="WEB-INF/jspf/session.jspf"%>
<%sessao.invalidate();
    String url = "index.jsp";
    response.sendRedirect(url);
%>
