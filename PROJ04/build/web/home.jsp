<%-- 
    Document   : home
    Created on : 12/10/2017, 22:16:46
    Author     : Laércio
    Desc: O usuario já se encontra logado e esse é o painel onde são exibidas as quantidades de tentativas que
    ele teve em determinado quiz, sua ultima pontuacao e a pontuação que ele obteve nos ultimos 10 jogos 
--%>

<%@page import="br.com.perguntado.Quiz"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="WEB-INF/jspf/session.jspf"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Painel do Usuario</title>
    </head>
    <body> 
        
    </head>
    <body>
        <%@include file="WEB-INF/jspf/header.jspf"%>
        <%@include file="WEB-INF/jspf/menu.jspf"%>
        <%="Olá, " + sessao.getAttribute(login)%>
        <h1>Hello World, Rodrigo!</h1>
        Quantidade de tentativas: <%= Quiz.quantidade%>
        Ultima pontuação: <%= Quiz.acertos%>
        <a href="Teste.jsp">Fazer Teste do Rodrigo</a>
        <!-- Tabela de pontuações do usuário logado-->
        <table>
            <tr>
                <td>Nome do Quiz</td><td>Pontuação</td><!--Se o luiz quizer, a hora pode ser um atributo a mais <td>Hora</td>-->
            </tr>
        </table>
        
        <%@include file="WEB-INF/jspf/footer.jspf"%>
    </body>
</html>
