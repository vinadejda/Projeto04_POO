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
           <table border="1">
            <tr>
                <th>Jogador</th>
                <th>Pontos</th>
                <th>Media</th>
                <th>Quiz</th>

           </tr>
            
           <%try{%>
                <%int i=0;%>
                    <% for (Pontuacao p: Pontuacao.getListPontuacao()){%><!--foreach-->
                        <tr>
                            <td><%=i%></td>
                            <td><%=p.getNomeJogador()%></td>
                            <td><%= p.getPontuacaoJogador()%></td>
                            <td><%= p.getNomeQuizJogado()%></td>
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
        
        
    </body>
</html>