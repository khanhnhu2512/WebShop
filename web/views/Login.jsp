<%-- 
    Document   : Login
    Created on : May 20, 2021, 9:51:11 PM
    Author     : HELLO
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >
<head>
    <meta charset="UTF-8">
    <title>LOGIN</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/views/icon_font/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/views/css/stylesheet.css">

</head>
<body>
<!--<img src="img/back.png" height="750" width="1536">-->
    <div id="loginbox" >
        <img src="${pageContext.request.contextPath}/views/img/logo.png" class="avatar">
        <br>
        <h1>LEO Sale Website</h1>
        <h2 id="h2">Login Here</h2>
        <form action="${pageContext.request.contextPath}/Login" method="post">
            <p style="color: red;">${errorString}</p>
            <p><i class="fa fa-user" aria-hidden="true"></i> Username</p>
            <input type="text" name="taikhoan" placeholder="Enter Username">
            <p><i class="fa fa-unlock-alt" aria-hidden="true"></i> Password</p>
            <input type="password" name="matkhau" placeholder="Enter Password">
            <input type="submit" name="" value="Login">
            <a href="#">Lost Your Password?</a>
            <a href="${pageContext.request.contextPath}/Register">Don't Have An Account?</a>
        </form>
    </div>
</body>
</html>
