
<%--
Document : header
Created on : Dec 17, 2012, 9:53:29 PM
Author : Palaa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link rev="stylesheet" type="text/css" href="RevGhost.css"/>
<style type="text/css">

body
{
background-color:#d0e4fe;
}
    
#Left{
position: absolute;
top : 160px;
right: 1%;
width: 12%;
border-radius: 10px;
background-color: buttonface;
border-color: black;
border-width: 1px;
padding-left: 5px;
padding-top: 5px;
}

#Right{
position: absolute;
top : 160px;
left : 1%;
width : 12%;
padding-left: 5px;
padding-top: 5px;
border-radius: 10px;
border-color: black;
border-width: 10px;
background-color: buttonface;
outline-width: 1px;
outline-color: black;

}

.header{
top : 0px;
left : 0px;
height : 15%;
text-align: center;
background-color: buttonface;
border-color: black;
border-width: 1px;
background-position: center;
padding-top: 2px;
padding-bottom: 1px;
border-radius: 20px;

}


#BlahBlah{
background-color: buttonface;
border-color: black;
border-width: 1px;
background-position: center;
padding-top: 2px;
padding-bottom: 1px;
padding-left: 20px;
padding-right: 20px;
border-radius: 20px;
position:absolute;
top : 120px;
left : 14%;
width : 69%;
}

#mid{
    
background-color: buttonface;
border-color: black;
border-width: 1px;
background-position: center;
padding-top: 20px;
padding-left: 20px;
padding-right: 20px;
padding-bottom: 1px;
border-radius: 20px;    
    
position: absolute;
top : 210px;
left : 14%;
width : 69%;
}

a:active{
color: saddlebrown;
}

a:before{
color: blue;
}
a:after{
color: purple;
}

.logo{
    height: 100px;
    
    float: left;
}
    .question{
        width:100%;
padding: 10px;
border-radius: 10px;
background-color: burlywood;
border-color: black;
border-width: 1px;
   
    }
    .questionset{
        width: 100%;
        
    }
    </style>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Home</title>
</head>

<body>
    <div class="header" id="Title">
        <img src="images/ghost.png" class ="logo">
        <h1>Revision Ghost - The no 1 Questions Database for Engineering Students</h1>
    </div>
    <div id="BlahBlah">
        <p>Home &gt; Select Category<br/>
        Quote of the day</p>
    </div>
    <div id ="Right">
        <p><a href="index.jsp" id="home" title="Go Back to Home Page">Home</a></p>
        <p><a href="about.jsp" id="about" title="About This Site">About</a></p>
        <p><a href="select.jsp" id="select" title="Select Question Categories">Select Categories</a></p>
        <p><a href="select.jsp" id="mcq" title="Go to MCQ Question Sheets">MCQ</a></p>
        <p><a href="SelectArticle.jsp" id="aticles" title="Go to Articles">Articles / Tutorials</a></p>
        <p><a href="search.jsp" id="search" title="Search Articles or Questions">Search</a></p>
        <p>Authors</p>
    </div>
<%String myname = (String)session.getAttribute("username");
    if(myname==null){%>
    <div id="Left">
        <form id="form1" name="form1" method="post" action="login">
            User Name <br />
            <input type="text" name="user" id="user" /><br />
            Password <br />
            <input type="password" name="pass" id="pass" /><br />
            <input type="hidden" name="login" value="1" />
            <input name="submit" type="submit" value="Log In" />
        </form>
                    Don't have an account?<br/><a href="SignUp.jsp">Sign Up</a>
    </div>
<%}else{%>
    <div id="Left">
<%out.println("<p>Logged in as "+myname+" </p>");%>
        <p>My Profile</p>
        <p><a href="addPaper.jsp" title="Add a Paper">Add Paper</a></p>
        <p><a href="addArticle.jsp">Add Articles/Tutorials</a></p>
        <p>My Papers</p>
        <p>Messages</p>
        <p><a href="login?login=0">logout</a></p>
    </div>
<%}%>

</body>
</html>