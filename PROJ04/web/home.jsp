<%@page import="br.com.perguntado.Pontuacao"%>
<%@page import="br.com.perguntado.Usuario"%>
<%@include file="WEB-INF/jspf/session.jspf"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Quiz - Perguntados</title>        
        <%@include file="WEB-INF/jspf/head.jspf" %>
    </head>
    <body>
        <nav class="navbar navbar-dark bg-dark">
            <%@include file="WEB-INF/jspf/header.jspf"%>                
            <ul class="nav justify-content-center">
                <li class="nav-item">
                    <a href="#login" class="nav-link" style="color: #fff;">Login</a>
                </li>
            </ul>
        </nav>
        <section class="login" id="login">
            <% try{
                if(request.getParameter("Entrar") != null){
                    String user = request.getParameter("user");
                    String name;
                    for(int i=0; i<4; i++){
                        name = Usuario.getListUsuarios().get(i).getNome();
                        if(name.equalsIgnoreCase(user)){

                            sessao.setAttribute(login, user);
                            %><%=sessao.getAttribute(login)%><%
                            String url = "inicial.jsp";
                            response.sendRedirect(url);
                        }
                    }
                }
                }catch(Exception ex){
                    %><div class="alert alert-danger" role="alert">Usuário não cadastrado</div>
                <%}%>
            <a href="#" id="btnfechar">X</a>
            <form class="form-group" id="formulario">
                <h2>Entrar:</h2><br>
                <label for="email">Nome:</label><br>                 
                <input id="email" type="text" class="form-control" name="user" placeholder="Digite o seu nome"><br>
                <center><input type="submit" name="Entrar" value="Entrar" class="btn btn-dark"> </center>
            </form>
        </section>
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
