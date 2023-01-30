<%-- 
    Document   : arithmeticCalculator
    Created on : 29-Jan-2023, 9:52:53 PM
    Author     : samhu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
       <form method="post" action="arithmetic">
            First: <input type="text" name="firstnum" value="${firstnum}"><br>
            Second: <input type="text" name="secondnum" value="${secondnum}"><br>
            <input type="submit" name="operand" value="+">
            <input type="submit" name="operand" value="-">
            <input type="submit" name="operand" value="*">
            <input type="submit" name="operand" value="%">
            
        </form>
            <p>Result:${message}</p>
            
            <a href="/Week3Lab_Calculators/age">Age Calculator</a>  
    </body>
</html>
