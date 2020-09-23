<%-- 
    Document   : agecalculator.jsp
    Created on : Sep 23, 2020, 10:08:51 AM
    Author     : 819466
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1> Arithmetic Calculator </h1>
        
        <form action="arithmetic" method="post">
            First: <input type="text" name="x" value="${x}"><br>
            Second: <input type="text" name="y" value="${y}"><br><br>
            <input type='submit' value='+' name="operation">
            <input type='submit' value='-' name="operation">
            <input type='submit' value='*' name="operation">
            <input type='submit' value='%' name="operation"><br><br>
        </form>
            
            <text> Result: ${response} </text><br><br>
        
        <a href="/Week3Lab_Calculators/age">Age Calculator</a>
    </body>
</html>
