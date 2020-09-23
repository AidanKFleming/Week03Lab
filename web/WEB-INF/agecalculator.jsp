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
        <title>Age Calculator</title>
    </head>
    <body>
        <h1> Age Calculator </h1>
        
        <form action="age" method="post">
            Enter your age: <input type="text" name="age" value="${age}"><br><br>
            <input type='submit' value='Age next birthday'><br><br>
        </form>
            
            <text> ${response} </text><br><br>
        
        <a href="/Week3Lab_Calculators/arithmetic">Arithmetic Calculator</a>
    </body>
</html>
