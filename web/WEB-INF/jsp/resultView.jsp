<%-- 
    Document   : resultView
    Created on : 01-Jun-2017, 14:22:35
    Author     : jasper
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Newsletters!</title>
    </head>
    <body>
        <p>Receive Newsletter : ${user.receiveNewsletter}</p>
        <p>Favourite Web Frameworks :</p>
        <c:forEach items="${user.favFrameworks}" var="item">
            <p>${item}</p>
        </c:forEach>
    </body>
</html>
