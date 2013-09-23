<%-- 
    Document   : headlines
    Created on : Sep 23, 2013, 4:06:09 PM
    Author     : Himesh_2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>news list</title>
    </head>
    <body>
        
        <c:forEach var="o" items="${objects}">
             <div>
            <h3>${o.headline}</h3>
            <p>{o.text}<a href="news1.html">see more..</a></p>
        </div>

        </c:forEach>
       
	<div>
            <h3>news 2</h3>
            <p>blah blah blah...<a href="more.html">see more..</a></p>
        </div>
	<div>
            <h3>news 3</h3>
            <p>blah blah blah...<a href="more.html">see more..</a></p>
        </div>
    </body>
</html>
