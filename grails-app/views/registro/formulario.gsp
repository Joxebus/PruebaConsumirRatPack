<%--
  Created by IntelliJ IDEA.
  User: joxebus
  Date: 15/10/12
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
  <head><title>Simple GSP page</title></head>
  <body>

    <g:form>

        Usuario: <g:textField name="usuario"/><br/>
        Contrasenia: <g:textField name="contrasenia"/><br/>
        <g:actionSubmit value="Aceptar" action="login"/>


    </g:form>

  </body>
</html>