<%-- 
    Document   : home
    Created on : 12/10/2017, 22:16:46
    Author     : LaÃ©rcio
    Desc: O usuario jÃ¡ se encontra logado e esse Ã© o painel onde sÃ£o exibidas as quantidades de tentativas que
    ele teve em determinado quiz, sua ultima pontuacao e a pontuaÃ§Ã£o que ele obteve nos ultimos 10 jogos 
--%>

<%@page import="java.text.DecimalFormat"%>
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
            <h1><%="Olá, " + sessao.getAttribute(login)%>!<br></h1>
            <% String nomeUsu = ""+sessao.getAttribute(login);%>
            <br>
            <h2> Seu Histórico de partidas:</h2>
            <section  class="card-body">
                <% if(Quiz.quantidade == 0){%>
                    Sua média: 0.0<br>
                    Quantidade de tentativas: 0.0<br>
                <% }else{%>
                 <% double acertos=0; double media=0; int totpergunta=0; int tentativa=0;%>
                 <% for (Pontuacao q: Pontuacao.getListPontuacao()){%><!--foreach-->
                    <%if(nomeUsu.equals(q.getNomeJogador())){%><!--Procurar na lista de pontuaÃ§Ãµes o usuario que tenha o nome igual ao usuÃ¡rio logado-->
                        <%acertos = acertos + q.getPontuacaoJogador();%><!-- Acumular as pontuações obtidas pelo usuario-->
                        <% totpergunta = totpergunta + 10;%><!-- toda vez que o usuário responder um quiz aumenta 10 perguntas para o tot/al--> 
                        <% tentativa++; %><!-- Contador de quizzes que o usuário responde-->
                        <%}%><!--Fim do if-->
                 <%}%><!-- Fim do for-->
                    <% media = (acertos/totpergunta)* 100;%><!--Media= a todos os acertos de todos os quizzes dividido por todos as perguntas de todos os quizzes-->
                    Sua média de acertos: <%= media %>%<br>                     
                    <!--Quantidade de tentativas: Quiz.quantidade%><br>-->
                    Quantidade de tentativas: <%= tentativa %><br><!-- Quantidade de tentativas do usuário-->
                <%}%><!--Fim do else-->
                               
            </section>     
            <section>
                <br>
                <h2>Últimos testes realizados:</h2>
                <br>
                <table class="table table-striped">
                    <tr>
                        <th>Pontuação</th>
                        <th>Média</th>
                        <th>Quiz</th>
                        <th>Data</th>
                    </tr>
                <% for (Pontuacao p: Pontuacao.getListPontuacao()){%><!--foreach-->
                    <%if(nomeUsu.equals(p.getNomeJogador())){%><!--Procurar na lista de pontuaÃ§Ãµes o usuario que tenha o nome igual ao usuÃ¡rio logado-->
                        <tr>
                            <td><%= p.getPontuacaoJogador()%></td>
                            <td><%=p.getMediaJogador()%>%</td>
                            <td><%= p.getNomeQuizJogado()%></td>
                            <td><%= p.getHoraQuizFormatado()%></td>
                        </tr>
                    <%}
                }%>
                </table><br>
            </section>
        </main>       
        <%@include file="WEB-INF/jspf/footer.jspf"%>
    </body>
</html>

