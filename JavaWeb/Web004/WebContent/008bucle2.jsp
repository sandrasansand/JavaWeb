<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String [] lista=new String[] {"hola","que","tal","estas"};
pageContext.setAttribute("listaDeStrings", lista);
%>

<!-- recorremos con jslt un array de strings añadida al contexto de la página en jsp-->
<c:forEach var="cadena" items="${listaDeStrings}">

<c:out value="${cadena}"/>
</c:forEach>

</body>
</html>