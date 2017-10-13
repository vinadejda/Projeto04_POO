<%-- 
    Document   : acesso
    Created on : 13/10/2017, 10:59:11
    Author     : Laércio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Acesso</title>
    </head>
    <body>
        <h1>Perguntados</h1>
        <h1>Acesso</h1>
         <%
		if(request.getParameter("entrar")!=null){
		/*Aqui alguem vai precisar fazer a verificacao e abrir a sessão*/
               String login = request.getParameter("login");
               if(login.equals("Rodrigo")){
		response.sendRedirect(request.getContextPath()+"/teste.jsp");
               }else{
                 response.sendRedirect(request.getContextPath()+"/acesso.jsp");
               }
		
	}
		
	%>
        <form>
            <label for="login">Login: </label>
            <input type="text" name="login" placeholder="Digite o seu login"/> 
            <input type="submit" name="entrar"  value="ENTRAR"/>
        </form>
    </body>
</html>
