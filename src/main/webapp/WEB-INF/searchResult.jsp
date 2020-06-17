<%--
  Created by IntelliJ IDEA.
  User: Sungillest
  Date: 6/17/20
  Time: 11:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Viewing All info for this ad" />
    </jsp:include>
    <title>Title</title>
</head>
<body>
    <jsp:include page="/WEB-INF/partials/navbar.jsp" />
    <h1>Here are All the Ads</h1>
    <c:forEach var="ad" items="${ads}">
        <div class="col-md-6">
            <h2>${ad.title}</h2>
            <p>${ad.description}</p>
            <a href="/individual?id=${ad.id}">Show Individual ad</a>
        </div>
    </c:forEach>
</body>
</html>
