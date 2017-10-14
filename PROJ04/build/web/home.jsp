<%-- 
    Document   : home
    Created on : 12/10/2017, 22:16:46
    Author     : Laércio
    Desc: O usuario já se encontra logado e esse é o painel onde são exibidas as quantidades de tentativas que
    ele teve em determinado quiz, sua ultima pontuacao e a pontuação que ele obteve nos ultimos 10 jogos 
--%>

<%@page import="br.com.perguntado.Pontuacao"%>
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
        <h1><%="Olá, " + sessao.getAttribute(login)%><BR></h1>
        <% String nomeUsu = ""+sessao.getAttribute(login);%>
        <h3> Histórico de partidas do <%= sessao.getAttribute(login)%></h3>
        <table border="1">
            <tr>
                <td>Nome</td>
                <td>Pontuação</td>
                <td>Media</td>
                <td>Qt.Perguntas</td>
                <td>Quiz</td>
            </tr>
        <% for (Pontuacao p: Pontuacao.getListPontuacao()){%><!--foreach-->
                    <%if(nomeUsu.equals(p.getNomeJogador())){%><!--Procurar na lista de pontuações o usuario que tenha o nome igual ao usuário logado-->
                       <tr>
                            <td><%=p.getNomeJogador()%></td>
                            <td><%= p.getPontuacaoJogador()%></td>
                            <td><%= p.getMediaJogador()%></td>
                            <td><%= p.getQtPerguntas()%></td>
                            <td><%= p.getNomeQuizJogado()%></td>
                        </tr>
                        <%}%>
                   <%}%>
        </table><br>
        Quantidade de tentativas: <%= Quiz.quantidade%><br>
        Ultima pontuação: <%= Quiz.acertos%><br>
        <a href="Teste.jsp">Fazer Teste do Rodrigo</a><br>
        <!-- Tabela de pontuações do usuário logado-->
        <table>
            <tr>
                <td>Nome do Quiz</td><td>Pontuação</td><!--Se o luiz quizer, a hora pode ser um atributo a mais <td>Hora</td>-->
            </tr>
        </table>
        
        <%@include file="WEB-INF/jspf/footer.jspf"%>
    </body>
</html>
