<%@page import="br.com.perguntado.Pontuacao"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Perguntados</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <H1>PERGUNTADOS</H1>
        <a href="acesso.jsp">Fazer Login</a>
        <a href="cadastro.jsp">Cadastro</a>
        
        <!--Aqui vai a tabela de ranking e dos ultimos dez jogos-->
        <!--Ranking-->
        <table border ="1">
            <tr>
                <th>Posição</th>
                <th>Jogador</th>
                <th>Pontos</th>
                <th>Media</th>
                <th>Qt.Perguntas</th>
                <th>Quiz</th>
                <th>Data</th>
            </tr>
            <tr>
                
                </tr>
                
           
            
        </table>
           <table border="1">
            <tr>
                <th>Indice</th>
                <th>Jogador</th>
                <th>Pontos</th>
                <th>Media</th>
                <th>Qt.Perguntas</th>
                <th>Quiz</th>
                <th>Data</th>

           </tr>
            
          <!--Lista dos 10 ultimos jogos-->
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
        
        <!--Lista das 10 maiores pontuações-->
        
    </body>
</html>
