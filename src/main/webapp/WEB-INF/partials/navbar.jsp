<nav class="navbar navbar-default">
    <div class="container-fluid bg-primary">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <a class="navbar-brand" href="/ads" style="color: white">View all ads</a>
        </div>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="/register" style="color: white">Register</a></li>
            <li><a href="/profile" style="color: white">Profile</a></li>
            <li><a href="/login" style="color: white">Login</a></li>
            <li><a href="/logout" style="color: white">Logout</a></li>
            <li>
<%--                <div class="d-flex align-items-center">--%>
                <form action="/searchResult" method="GET">
                <input style="margin-top: 1em; color: black"  name="search" type="text" placeholder="Search Ads"> <!-- Make sure to name the name so that  -->
                <button type="submit" style="margin-right: 1em; color: black">
                    Search
                </button>
                </form>
<%--                </div>--%>
          </li>
        </ul>
    </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
