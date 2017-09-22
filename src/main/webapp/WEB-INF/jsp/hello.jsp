<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="cp" value="${pageContext.request.servletContext.contextPath}" scope="request" />
 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Helllo ROute</title>
        
    </head>
    <body>
        <h4>Helllo ROute</h4>
        Hola: <span class="blue">${msg}</span>
        <span> ${param1}</span>
    </body>
</html>

