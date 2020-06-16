<%--
  Created by IntelliJ IDEA.
  User: rexsutton
  Date: 6/16/20
  Time: 9:12 AM
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
<div>

        <div class="col-md-6">
            <h1>${ad.title}</h1>
            <h3>Description</h3>
            <p>${ad.description}</p>
            <h3>Created by</h3>
            <p>${adOwner.username}</p>
            <h3>Contact Info</h3>
            <p>${adOwner.email}</p>
        </div>

</div>

</body>
</html>
