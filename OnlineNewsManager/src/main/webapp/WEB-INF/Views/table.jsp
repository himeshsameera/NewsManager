<%-- 
    Document   : table
    Created on : Sep 23, 2013, 3:18:20 PM
    Author     : Himesh_2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World! ttttttttt </h1>
        
    <c:if test="${not empty objects}">
        <table>
        <c:forEach var="o" items="${objects}">
            <tr>
                <>
                <td>${o.headline}</td>
                <td>${o.text}</td> 
            </tr>
        </c:forEach>
        </table>
    </c:if>
        
        
    </body>
</html>
