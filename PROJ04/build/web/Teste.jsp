<%-- 
    Document   : Quiz
    Created on : 12/10/2017, 20:47:06
    Author     : Laércio
--%>

<%@page import="java.util.Date"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Collections"%>
<%@page import="br.com.perguntado.Pontuacao"%>
<%@page import="br.com.perguntado.Quiz"%>
<%@page import="br.com.perguntado.Usuario"%>
<%@include file="WEB-INF/jspf/session.jspf"%>
<%@page import="br.com.perguntado.Questao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Quiz - Perguntados</title>
        <%@include file="WEB-INF/jspf/head.jspf"%>
    </head>
    <body>
        <nav class="navbar navbar-dark bg-dark">
            <%@include file="WEB-INF/jspf/header.jspf"%>
            <ul class="nav justify-content-center">
                <li class="nav-item">
                    <a href="home.jsp" class="nav-link" style="color: #fff;">Home</a><br>   
                </li>
                <li class="nav-item">
                    <a href="logout.jsp" class="nav-link" style="color: #fff;">Sair</a>
                </li>
            </ul>
        </nav>
        <main class="container">
        <br>
        <h2>Questões</h2><br>
        <% int totalPergunta=3;%>
    <!-- Aqui o usuario já está logado com a session-->
        <%
		if(request.getParameter("finalizar")!=null){
			int pontos=0;
			for(Questao q: Quiz.montarQuiz()){
			String resposta = request.getParameter(q.getId());
			if(resposta !=null){
				if(resposta.equals(q.getRespostaCerta())){
                                   Quiz.acertos++;
                                   pontos++;
				}	
			}
		    }
                     
                     //O sistema deve cadastrar a pontuação de cada usuario em cada jogo
                     
                    String nome =""+sessao.getAttribute(login); //Nome do usuario logado
                       
                    
                    //Calculo de media porcentagem
                    double media = (pontos/ totalPergunta)/100;
                    
                    
                               
                    Pontuacao p = new Pontuacao(nome, pontos, media, totalPergunta, "Quiz - Perguntados", new Date());//Criamos um objeto do tipo cliente

                    
                    Pontuacao.getListPontuacao().add(p);//Aqui nós buscamos o arrayList na memória e enviamos o objeto e seus atributos para o armazenamento
   
            
                        
		Quiz.quantidade++;
		response.sendRedirect(request.getContextPath()+"/home.jsp");

		
		}
		
	%>

		<form style="text-align: justify;">
		<%  int i=0;//inicio um contador que irá ser excutado dez vezes
                    for(Questao q: Quiz.montarQuiz()){  
                        if(i<10){%>                                        
                            <label style="font-size: 1.2em;"><b>Q<%=(i+1)%> - <%=q.getSigla()%> </b> <%=q.getPergunta()%></label><br>
                            
                            <input type="radio" name="<%=q.getId()%>" value="<%=q.getRespostaCerta()%>"/>
                            <%=q.getRespostaCerta()%><br>
                            
                            <input type="radio" name="<%=q.getId()%>" value="<%=q.getErrada1()%>"/>
                            <%=q.getErrada1()%><br>
                            
                            <input type="radio" name="<%=q.getId()%>" value="<%=q.getErrada2()%>"/>
                            <%=q.getErrada2()%><br><br>
                            
                            <%i++;
                        }
                    }%>		
                         
                    <center><input type="submit" name="finalizar" value="Finalizar"  class="btn btn-dark"/><center>
		</form>
            <br>
        </main>
        <%@include file="WEB-INF/jspf/footer.jspf"%>
    </body>
</html>
