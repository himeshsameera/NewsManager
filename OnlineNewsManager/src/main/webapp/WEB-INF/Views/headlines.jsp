<%-- 
    Document   : headlines
    Created on : Sep 23, 2013, 4:06:09 PM
    Author     : Himesh_2
--%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>news list</title>
    </head>
    <body>
     <c:if test="${not empty objects}">       
        <c:forEach var="o" items="${objects}">
             <div>
            <h3>${o.headline}</h3>
            <p>${o.text}<a href="news1.html">see more..</a></p>
        </div>

        </c:forEach>
       
    </c:if>

    </body>
</html>
