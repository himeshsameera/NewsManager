<%-- 
    Document   : headlines
    Created on : Sep 23, 2013, 4:04:47 PM
    Author     : Himesh_2
--%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<%@include file="header.jsp"%>
<html>

    <body>
         <div id="mid">
        <h1>${news.headline}</h1>
        <img src=${news.imgPath}></img>
		<p>${news.text}</p>
                
         </div>
    </body>
</html>
