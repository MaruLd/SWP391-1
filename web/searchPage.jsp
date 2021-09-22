<%-- 
    Document   : searchPage
    Created on : Sep 22, 2021, 10:02:28 AM
    Author     : henry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <title>Search Page</title>
    <!-- this is title icon -->
    <link rel="icon" href="UI/Icon/Ficon.png" type="image/icon type">
    <!-- this is bootstrap 4 -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <!-- this is external css file -->
    <link rel="stylesheet" href="UI/CSS/searchPageStyle.css">
    <!-- this is fontawsome icon -->
    <script src="https://kit.fontawesome.com/93823b4ff2.js" crossorigin="anonymous"></script>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>

<body>

    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="homePage.html">
            <img src="UI/Icon/FPTLogo.jpg" alt="FPTLogo">
            FPT Academy
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup"
            aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
            <div class="navbar-nav ml-auto">
                <!-- If user aren't login then show the login link -->
                <a class="nav-item nav-link" href="login.html">Login</a>
                <!-- If user already login then show user link which navigate to user profile page on click -->
                <a class="nav-item nav-link" href="userProfile.html">Username</a>
            </div>
        </div>
    </nav>

    <div class="upper-img">
        <img src="UI/Icon/hallwayfpt.jpg" alt="">
    </div>

    <div class="container-fluid">
        <div class="search-box col-md-5">
            <form action="search" method="POST">
                <div class="input-group mb-3">
                    <div class="input-group-prepend">
                        <select class="custom-select" id="inputGroupSelect01">
                            <option name="choice" value="all" selected>All</option>
                            <option name="choice" value="title">Title</option>
                            <option name="choice" value="category">Category</option>
                        </select>
                    </div>
                    <input type="text" placeholder="Search..." class="form-control"
                        aria-label="Search input with dropdown button">
                    <div class="input-group-append">
                        <button class="btn btn-info" type="submit">Search</button>
                    </div>
                </div>
            </form>
        </div>

    </div>

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous">
    </script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
        integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous">
    </script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
        integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous">
    </script>
</body>

</html>