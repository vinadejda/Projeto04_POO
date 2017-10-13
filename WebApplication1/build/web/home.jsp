<%-- 
    Document   : home
    Created on : 12/10/2017, 22:16:46
    Author     : Laércio
    Desc: O usuario já se encontra logado e esse é o painel onde são exibidas as quantidades de tentativas que
    ele teve em determinado quiz, sua ultima pontuacao e a pontuação que ele obteve nos ultimos 10 jogos 
--%>

<%@page import="br.com.perguntado.Quiz"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body> 
        <h1>Hello World, Rodrigo!</h1>
        Quantidade de tentativas: <%= Quiz.quantidade%>
        Ultima pontuação: <%= Quiz.acertos%>
        
        <!-- Tabela de pontuações do usuário logado-->
        <table>
            <tr>
                <td>Nome do Quiz</td><td>Pontuação</td><!--Se o luiz quizer, a hora pode ser um atributo a mais <td>Hora</td>-->
            </tr>
        </table>
    </body>
</html>
