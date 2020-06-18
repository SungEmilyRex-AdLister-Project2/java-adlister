<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <a class="navbar-brand" href="/ads">Adlister</a>
        </div>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="/register">Register</a></li>
            <li><a href="/profile">Profile</a></li>
            <li><a href="/login">Login</a></li>
            <li><a href="/logout">Logout</a></li>
            <li>
                <%--                <div class="d-flex align-items-center">--%>
                <form action="/searchResult" method="GET">
                    <input style="margin-top: 1em"  name="search" type="text" placeholder="Search"> <!-- Make sure to name the name so that  -->
                    <button type="submit">
                        Search
                    </button>
                </form>
                <%--                </div>--%>
            </li>
        </ul>
    </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>