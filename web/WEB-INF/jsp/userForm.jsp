<%-- 
    Document   : userForm
    Created on : 01-Jun-2017, 14:22:26
    Author     : jasper
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Newsletters!</title>
    </head>
    <body>
        <form:form action="user.htm" method="post" modelAttribute="user"> 
            <p>Subscribe to newsletters?: <form:checkbox path="receiveNewsletter" /> </p>
            <p>Favourite Web Frameworks:
                <c:forEach items="${favFrameworks}" var="item">
                    <form:checkbox path="favFrameworks" value="${item}"/>${item}
                </c:forEach>
            </p>
            <input type="submit"/>
        </form:form>
    </body>
</html>
