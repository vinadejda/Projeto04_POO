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
        <title>Painel do Usuário</title>
        <%@include file="WEB-INF/jspf/head.jspf"%>
    </head>
    <body> 
        <nav class="navbar navbar-dark bg-dark">
            <%@include file="WEB-INF/jspf/header.jspf"%>
            <ul class="nav justify-content-center">
                <li class="nav-item">
                    <a href="Teste.jsp" class="nav-link" style="color: #fff;">Realizar Teste</a><br>   
                </li>
                <li class="nav-item">
                    <a href="logout.jsp" class="nav-link" style="color: #fff;">Sair</a>
                </li>
            </ul>
        </nav>
        <main class="container">
            <br>
            <h1><%="Olá, " + sessao.getAttribute(login)%><br></h1>
            <% String nomeUsu = ""+sessao.getAttribute(login);%>
            <br>
            <h2> Seu Histórico de partidas:</h2>
            <section  class="card-body">
                Quantidade de tentativas: <%= Quiz.quantidade%><br>
                Última pontuação: <%= Quiz.acertos%><br>                
            </section>   
                <!-- Tabela de pontuações do usuário logado-->
                <table  class="table table-striped">
                    <tr>
                        <th>Nome do Quiz</th>
                        <th>Pontuação</th><!--Se o luiz quizer, a hora pode ser um atributo a mais <td>Hora</td>-->
                    </tr>
                </table>
                <br>
            
                
            <section>
                <h2>Últimos testes realizados</h2>
                <table class="table table-striped">
                    <tr>
                        <th>Pontuação</th>
                        <th>Média</th>
                        <th>Qt.Perguntas</th>
                        <th>Quiz</th>
                    </tr>
                <% for (Pontuacao p: Pontuacao.getListPontuacao()){%><!--foreach-->
                    <%if(nomeUsu.equals(p.getNomeJogador())){%><!--Procurar na lista de pontuações o usuario que tenha o nome igual ao usuário logado-->
                        <tr>
                            <td><%= p.getPontuacaoJogador()%></td>
                            <td><%= p.getMediaJogador()%></td>
                            <td><%= p.getQtPerguntas()%></td>
                            <td><%= p.getNomeQuizJogado()%></td>
                        </tr>
                    <%}
                }%>
                </table><br>
            </section>
        </main>       
        <%@include file="WEB-INF/jspf/footer.jspf"%>
    </body>
</html>

