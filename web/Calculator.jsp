<%@ page import="logic.Calc" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 10.03.2020
  Time: 13:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Card</title>
</head>
<body>
<%
    Calc calc = (Calc) session.getAttribute("calc");
    if (Calc.getAction().equals("plus")) {
        out.println("Sum " + Calc.sum(Calc.getA(), Calc.getB()));
    }
    if (Calc.getAction().equals("minus")) {
        out.println("Minus " + Calc.minus(Calc.getA(), Calc.getB()));
    }
    if (Calc.getAction().equals("mozh")) {
        out.println("Mnozh " + Calc.mnozh(Calc.getA(), Calc.getB()));
    }
    if (Calc.getAction().equals("dil")) {
        if (Calc.getB() == 0) {
            out.println("delenie na 0");
        } else {
            out.println("Del " + Calc.dil(Calc.getA(), Calc.getB()));
        }
    }
%>
</body>
</html>
