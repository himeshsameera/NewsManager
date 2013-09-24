<%-- 
    Document   : headlines
    Created on : Sep 23, 2013, 4:04:47 PM
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
        <h3>${news.headline}</h3>    
                <img src=${news.imgPath}></img>
		<p>${news.text}</p>
        </div>
    </body>
</html>
