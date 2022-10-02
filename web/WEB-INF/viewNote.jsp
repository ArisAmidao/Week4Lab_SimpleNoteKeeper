<%-- 
    Document   : viewNote
    Created on : Oct 2, 2022, 9:55:55 AM
    Author     : amida
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
            <p><b>Title:</b> ${n.title}</p>
            <p><b>Contents:</b>
            
            <a href="note?edit">Edit</a>
    </body>
</html>
