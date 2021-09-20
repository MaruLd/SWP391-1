<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>

<head>
    <title>Register</title>
    <link rel="icon" href="UI/Icon/Ficon.png" type="image/icon type">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="UI/CSS/registerPageStyle.css">
</head>

<body>
      <c:set var="error" value="${requestScope.ERROR}"/>
      
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
                <a class="nav-item nav-link" href="homePage.html">Home</a>
                <a class="nav-item nav-link" href="aboutUs.html">About us</a>
            </div>
        </div>
    </nav>

    <div class="bckimg">
        <img src="UI/Icon/selfmademan.jpg" alt="">
    </div>

    <div class="login_table">
        <form class="loginform" name="login" action="createAccount" method="POST">
            <h1>Register</h1>
            <div class="enter-field">
                <input type="text" id="username" placeholder="Username">
                <c:if test="${not empty error.userNameLengthError}">

                <font color="red">
                ${error.userNameLengthError}<br/>
                </font>
            </c:if>
            </div>
            <div class="enter-field">
                <input type="text" id="fullname" placeholder="Fullname">
                 <c:if test="${not empty error.fullNameLengthError}">

                <font color="red">
                ${error.fullNameLengthError}<br/>
                </font>
            </c:if>
            </div>
            <div class="enter-field">
                <input type="text" id="address" placeholder="Address">
            </div>
            <div class="enter-field">
                <input type="date" id="birthdate">
            </div>
            <div class="enter-field">
                <input type="password" id="password" placeholder="Password">
                
                  <c:if test="${not empty error.passwordLengthError}">

                <font color="red">
                ${error.passwordLengthError}<br/>
                </font>
            </c:if>
                
            </div>
            <div class="enter-field">
                <input type="password" id="confirm_password" placeholder="Confirm password">
                
                  <c:if test="${not empty error.confirmNotMatched}">

                <font color="red">
                ${error.confirmNotMatched}<br/>
                </font>
            </c:if>
                
            </div>
            <div class="button">
                <button type="submit" class="btn btn-outline-info">Register</button>
            </div>
            <h6><a href="login.html">Already have an account ?</a></h6>
        </form>
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