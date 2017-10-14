<%-- 
    Document   : Quiz
    Created on : 12/10/2017, 20:47:06
    Author     : Laércio
--%>

<%@page import="br.com.perguntado.Pontuacao"%>
<%@page import="br.com.perguntado.Quiz"%>
<%@page import="br.com.perguntado.Usuario"%>
<%@include file="WEB-INF/jspf/session.jspf"%>
<%@page import="br.com.perguntado.Questao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
	<h1>webquiz</h1>
	<h2>Quiz</h2>
	<h2>Questoes</h2>
        <% int totalPergunta=0;%>
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
                               
                    Pontuacao p = new Pontuacao(nome, pontos, media, totalPergunta, "Quiz do Rodrigo");//Criamos um objeto do tipo cliente

                    
                    Pontuacao.getListPontuacao().add(p);//Aqui nós buscamos o arrayList na memória e enviamos o objeto e seus atributos para o armazenamento
   
            
                        
		Quiz.quantidade++;
		response.sendRedirect(request.getContextPath()+"/home.jsp");

		
		}
		
	%>

		<form>
			<% for(Questao q: Quiz.montarQuiz()){%>
                        
                        <%totalPergunta++;%> 
                        <!-- Contador de perguntas-->
                        
                         <fieldset>
			<H1><%=q.getPergunta()%></h1>  
                        <input type="radio" name="<%=q.getId()%>" value="<%=q.getRespostaCerta()%>"/>
			<%=q.getRespostaCerta()%>
			<input type="radio" name="<%=q.getId()%>" value="<%=q.getErrada1()%>"/>
			<%=q.getErrada1()%>
			<input type="radio" name="<%=q.getId()%>" value="<%=q.getErrada2()%>"/>
			<%=q.getErrada2()%>
                        </fieldset>
			<%}%>		
                         
			<input type="submit" name="finalizar" value="finalizar"/>
		</form>
</body>
</html>
