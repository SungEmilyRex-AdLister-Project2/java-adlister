<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="/WEB-INF/partials/navbar.jsp" />

    <div class="container">
        <h1>Welcome, ${sessionScope.user.username}!</h1>
    </div>
    <br>
<%--    need to add margin--%>
<%--        should this href be the jsp page not this localhost url?
    what if we have different local host #s?--%>
        <p>Would you like to <a href="http://localhost:8080/ads/create">create an ad?</a></p>
    </div>

</body>
</html>
