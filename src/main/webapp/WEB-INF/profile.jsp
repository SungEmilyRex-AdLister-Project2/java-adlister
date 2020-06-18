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
    <div style="margin-left: 5em" >
<%--    need to add margin--%>
        <p>Would you like to <a href="/ads/create">create an ad?</a></p>
        <a href="/showUsersAds?id=${sessionScope.user.id}">Show all of your ads</a>

    </div>

</body>
</html>
