<%-- 
    Document   : NewloginPage
    Created on : Oct 5, 2021, 6:17:58 PM
    Author     : henry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <!-- this is bootstrap -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous">
        </script>
        <!-- this is external css -->
        <link rel="stylesheet" href="UI/CSS/NewloginPageStyle.css">
        <!-- this is fontawsome -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css" />
        <!-- this is external JS -->
        <script src="UI/script/loginPage.js"></script>
    </head>
    <body>
        <div class="container-fluid">
            <img class="wave" src="UI/Icon/wave.png" alt="">
            <div class="page-row row align-items-center">
                <div class="col-lg-6 d-none d-lg-block">
                    <img class="phone-pic" src="UI/Icon/phone-pic.png" alt="">
                </div>
                <div id="login-table" class="login-table activated col-lg-6">
                    <img class="avatar" src="UI/Icon/avatar-login.png" alt="">
                    <h1>Login</h1>
                    <form class="login-form" action="login" method="POST">
                        <div class="enter-field">
                            <input name="username" id="username" type="text" required>
                            <label class="username-label" for="username"><i class="fas fa-user"></i> Username</label>
                        </div>
                        <div class="enter-field">
                            <input name="password" id="password" type="password" required>
                            <label class="password-label" for="password"><i class="fas fa-lock"></i> Password</label>
                            <i id="close-eye" class="close-eye d-block fas fa-eye-slash" onclick="showPassword()"></i>
                            <i id="open-eye" class="open-eye d-none fas fa-eye" onclick="hidePassword()"></i>
                        </div>
                        <div class="footer-link">
                            <div class="row">
                                <div class="remember-me col-12 col-sm-6">
                                    <input id="checkbox" type="checkbox">
                                    <label for="checkbox">Remember me</label>
                                </div>
                                <div class="forgot-link col-12 col-sm-6">
                                    <a href="">forgot password ?</a>
                                </div>
                            </div>
                        </div>
                        <button class="login-btn" type="submit">Login</button><br>
                    </form>
                    <button class="goto-register" onclick="goToRegister()">Don't have an account ?</button>
                </div>
                <div id="register-table" class="register-table deactivated col-lg-6">
                    <img class="avatar" src="UI/Icon/avatar-login.png" alt="">
                    <h1>register</h1>
                    <form class="register-form" action="register" method="POST">
                        <div class="row">
                            <div class="enter-field col-md-6">
                                <input name="username" id="username-register" type="text" required>
                                <label class="username-label" for="username"><i class="fas fa-user"></i> Username</label>
                            </div>
                            <div class="enter-field col-md-6">
                                <input name="fullname" id="fullname" type="text" required>
                                <label class="fullname-label" for="fullname"><i class="fas fa-file-signature"></i>
                                    Fullname</label>
                            </div>
                            <div class="enter-field col-md-6">
                                <input name="address" id="address" type="text" required>
                                <label class="address-label" for="address"><i class="fas fa-map-marked-alt"></i>
                                    Address</label>
                            </div>
                            <div class="enter-field col-md-6">
                                <input name="birthdate" id="birthdate" type="text" onfocus="(this.type = 'date')"
                                       onblur="if (!this.value)
                                            this.type = 'text'" required>
                                <label class="birthdate-label" for="birthdate"><i class="fas fa-calendar-alt"></i>
                                    Birthdate</label>
                            </div>
                            <div class="enter-field col-md-6">
                                <input name="email" id="email" type="text" required>
                                <label class="email-label" for="email"><i class="fas fa-envelope"></i> Email</label>
                            </div>
                            <div class="enter-field col-md-6">
                                <input name="phone" id="phone" type="text" required>
                                <label class="phone-label" for="phone"><i class="fas fa-phone-alt"></i> Phone</label>
                            </div>
                            <div class="enter-field col-md-6">
                                <input name="password" id="password-register" type="password" required>
                                <label class="password-label" for="password"><i class="fas fa-lock"></i> Password</label>
                                <i id="reclose-eye" class="close-eye d-block fas fa-eye-slash"
                                   onclick="showrePassword()"></i>
                                <i id="reopen-eye" class="open-eye d-none fas fa-eye" onclick="hiderePassword()"></i>
                            </div>
                            <div class="enter-field col-md-6">
                                <input name="confirm-password" id="confirm-password" type="confirm-password" required>
                                <label class="confirm-password-label" for="confirm-password"><i class="fas fa-lock"></i>
                                    Confirm Password</label>
                                <i id="coclose-eye" class="close-eye d-block fas fa-eye-slash"
                                   onclick="showcoPassword()"></i>
                                <i id="coopen-eye" class="open-eye d-none fas fa-eye" onclick="hidecoPassword()"></i>
                            </div>
                        </div>
                        <button class="register-btn" type="submit">Register</button><br>
                    </form>
                    <button class="return-login" onclick="goToLogin()">Already have an account ?</button>
                </div>
            </div>
        </div>
    </body>
</html>
