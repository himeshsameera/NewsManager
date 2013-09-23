<%-- 
    Document   : headlines
    Created on : Sep 23, 2013, 4:06:09 PM
    Author     : Himesh_2
--%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    
    <body>
        <div id="mid">
     <c:if test="${not empty objects}">       
        <c:forEach var="o" items="${objects}">
             <div>
            <h3>${o.headline}</h3>
            <p>${o.text}<a href="news1.html">see more..</a></p>
        </div>

        </c:forEach>
       
    </c:if>
</div>
    </body>
</html>
