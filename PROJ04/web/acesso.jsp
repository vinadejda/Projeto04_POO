<%-- 
    Document   : home
    Created on : 12/10/2017, 23:04:01
    Author     : vitoria
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.perguntado.Usuario"%>
<%@include file="WEB-INF/jspf/session.jspf"%>
<!DOCTYPE html>
<html>
    <%@include file="WEB-INF/jspf/head.jspf" %>
    <body>
        <div class="py-1 bg-dark">
            <nav class="nav" style="margin-top: 2%;">
                <%@include file="WEB-INF/jspf/header.jspf"%>                
                <ul class="nav justify-content-end">
                    <li class="nav-item">
                        <a href="inicial.jsp" class="nav-link">Página Inicial</a>
                    </li>
                    <li class="nav-item">
                        <a href="cadastro.jsp" class="nav-link">Cadastrar</a>
                    </li>
                </ul>
            </nav>
        </div>
        <main class="container">
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
        %><div class="alert alert-danger" role="alert">Usuário não cadastrado</div>
        <%
        }
        %>
        <form class="form-group">
            <label for="exampleInputEmail1">Nome:</label><br>
            <input type="text" name="user" class="form-control" id="exampleInputEmail1" placeholder="Digite o seu nome"><br>
            <input type="submit" name="Entrar" value="Enviar" class="btn btn-primary"> 
        </form>
        </main>
    <%@include file="WEB-INF/jspf/footer.jspf"%>
    </body>
</html>
