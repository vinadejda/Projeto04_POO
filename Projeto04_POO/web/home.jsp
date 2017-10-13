<%-- 
    Document   : home
    Created on : 12/10/2017, 23:04:01
    Author     : vitoria
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javax.servlet.http.HttpSession"%>
<%@page import="br.com.fatecpg.quiz.Usuario"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quiz- Home</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/header.jspf"%>
        <% try{
            if(request.getParameter("Entrar") != null){
                String user = request.getParameter("user");
                String name;
                for(int i=0; i<4; i++){
                    name = Usuario.getList().get(i).getUsuario();
                    if(name.equalsIgnoreCase(user)){
                        HttpSession sessao = request.getSession();
                        sessao.setAttribute(user, user);
                        %><%="Olá, " + sessao.getAttribute(user)%><%
                        String url = "index.jsp";
                        response.sendRedirect(url);
                    }
                }
            }
        }catch(Exception ex){
        %><div>Usuário não cadastrado</div>
        <%
        }
        %>
        <form>
            <label>Nome:</label>
            <input type="text" name="user">
            <input type="submit" name="Entrar" value="Enviar"> 
        </form>

    <%@include file="WEB-INF/jspf/footer.jspf"%>
    </body>
</html>
