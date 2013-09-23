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
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${news.headline}</title>
    </head>
    <body>
        <img src=${news.imgPath}></img>
		<p>${news.text}</p>
                
        <input type="text">
        <input type="submit">
    </body>
</html>