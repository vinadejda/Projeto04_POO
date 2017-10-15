<%@page import="br.com.perguntado.Pontuacao"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <%@include file="WEB-INF/jspf/head.jspf" %>
    <body>
        <div class="py-1 bg-dark">
            <nav class="nav" style="margin-top: 2%;">
                <%@include file="WEB-INF/jspf/header.jspf"%>                
                <ul class="nav justify-content-end">
                    <li class="nav-item">
                        <a href="acesso.jsp" class="nav-link">Login</a>
                    </li>
                    <li class="nav-item">
                        <a href="cadastro.jsp" class="nav-link">Cadastrar</a>
                    </li>
                </ul>
            </nav>
        </div>
        <main class="container">
        <br>
        <section>
        <!--Aqui vai a tabela de ranking e dos ultimos dez jogos-->
            <h2>Ranking</h2>
            <table class="table table-striped">
                <tr>
                    <th>#</th>
                    <th>Jogador</th>
                    <th>Pontos</th>
                    <th>Média</th>
                    <th>Qt.Perguntas</th>
                    <th>Quiz</th>
                    <th>Data</th>
                </tr>
                <tr>
                    <th>#</th>
                    <th>Jogador</th>
                    <th>Pontos</th>
                    <th>Média</th>
                    <th>Qt.Perguntas</th>
                    <th>Quiz</th>
                    <th>Data</th>
                </tr> 
                <tr>
                    <th>#</th>
                    <th>Jogador</th>
                    <th>Pontos</th>
                    <th>Média</th>
                    <th>Qt.Perguntas</th>
                    <th>Quiz</th>
                    <th>Data</th>
                </tr>
            </table>
        </section>
        <br>
        <section>
           <table class="table table-striped">
            <tr>
                <th>#</th>
                <th>Jogador</th>
                <th>Pontos</th>
                <th>Média</th>
                <th>Qt.Perguntas</th>
                <th>Quiz</th>
                <th>Data</th>

           </tr>
            
          <h2>Lista dos 10 últimos jogos</h2>
           <%try{%>
                <%int i=0;%>
                    <% for (Pontuacao p: Pontuacao.getListPontuacao()){%><!--foreach-->
                        <% if(i<=10){%><!--If para criar tabelas com os 10 ultimos jogos apenas-->
                        <tr>
                            <td><%=i++%></td>
                            <td><%=p.getNomeJogador()%></td>
                            <td><%= p.getPontuacaoJogador()%></td>
                            <td><%= p.getMediaJogador()%></td>
                            <td><%= p.getQtPerguntas()%></td>
                            <td><%= p.getNomeQuizJogado()%></td>
                            <td><%= p.getHoraQuizFormatado()%></td>
                            
                        </tr>
                        <%}%>
                   <%}%>
           <%}catch(Exception ex){%>
                <tr>
                    <td colspan="5">
                        Erro ao carregar a lista: <%=ex.getMessage()%>
                    </td>
                </tr>
           <%}%>    
        </table>
        </section>
        <!--Lista das 10 maiores pontuações-->
        </main>
        <%@include file="WEB-INF/jspf/footer.jspf"%>
    </body>
</html>
