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
                            String url = "home.jsp";
                            response.sendRedirect(url);
                        }
                    }
                }
                }catch(Exception ex){
                    %><div class="alert alert-danger" role="alert">Usu�rio n�o cadastrado</div>
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
        <h2> Bem -Vindo(a) ao Quiz Perguntados!</h2><br> 
        <h3 style = "text-align: justify; font-size: 1.3em;">Aqui voc� poder� responder quest�es de concurso especialmente selecionadas para voc�  de TI 
            que quer estudar para concursos ou apenas se divertir testando seus conhecimentos.</h3>
        <br>
            <h2>Ranking</h2>
            <table class="table table-striped">
                <tr>
                    <th>#</th>
                    <th>Jogador</th>
                    <th>Pontos</th>
                    <th>M�dia</th>
                    <th>Qt.Perguntas</th>
                    <th>Quiz</th>
                    <th>Data</th>
                </tr>
                
                <%try{%>
                    <%int j = 1;%>
                        <% for (Pontuacao r: Pontuacao.getListaRanking()){%>
                        <tr>
                            <td><%=j++%></td>
                            <td><%=r.getNomeJogador()%></td>
                            <td><%=r.getPontuacaoJogador()%></td>
                            <td><%=r.getMediaJogador()%></td>
                            <td><%=r.getQtPerguntas()%></td>
                            <td><%=r.getNomeQuizJogado()%></td>
                            <td><%=r.getHoraQuizFormatado()%></td>
                
                        </tr>
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
            <br><br>
        <section>
           <table class="table table-striped">
            <tr>
                <th>#</th>
                <th>Jogador</th>
                <th>Pontos</th>
                <th>M�dia</th>
                <th>Qt.Perguntas</th>
                <th>Quiz</th>
                <th>Data</th>

           </tr>
            
          <h2>Lista dos 10 �ltimos jogos</h2>
           <%try{%>
           <%int i = 1;%>
           <% for (Pontuacao u: Pontuacao.getUltimosJogos()){%><!--foreach-->
                        
                        <tr>
                            <td><%=i++%></td>
                            <td><%=u.getNomeJogador()%></td>
                            <td><%=u.getPontuacaoJogador()%></td>
                            <td><%=u.getMediaJogador()%></td>
                            <td><%=u.getQtPerguntas()%></td>
                            <td><%=u.getNomeQuizJogado()%></td>
                            <td><%=u.getHoraQuizFormatado()%></td>
                        </tr>
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
        <!--Lista das 10 maiores pontua��es-->
        </main>
        <%@include file="WEB-INF/jspf/footer.jspf"%>
    </body>
</html>