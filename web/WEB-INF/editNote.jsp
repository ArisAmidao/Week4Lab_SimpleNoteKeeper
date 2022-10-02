<%-- 
    Document   : editNote
    Created on : Oct 2, 2022, 9:56:13 AM
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
        <h2> Edit Note</h2>
        <form method="post" action="note">
            Title: <input type="text" name="title" value="${note.title}"><br>
            Contents: <input name="contents" cols="20" rows="5" value="${note.contents}"><br>
            
            <input type="submit" value="Save">
        </form>        
    </body>
</html>
