<%-- 
    Document   : Register
    Created on : May 21, 2021, 6:33:19 AM
    Author     : HELLO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vn">
<head>
    <meta charset="UTF-8">
    <title>Register Form</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/views/icon_font/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/views/css/register.css">
</head>
<body>
<img src="${pageContext.request.contextPath}/views/img/logo.png" class="avatar">
<br><br><br>
<br><br><br>
<br><br><br>
<form action="${pageContext.request.contextPath}/Register" method="post" style="max-width:500px;margin:auto">
    <h2 align="center">Đăng Kí Tài Khoản</h2>
    <p style="color: red;">${errorString}</p>
    <div class="input-container">
        <i class="fa fa-user icon"></i>
        <input class="input-field" type="text" placeholder="Ma nhan vien" name="manv">
    </div>
    <div class="input-container">
        <i class="fa fa-user icon"></i>
        <input class="input-field" type="text" placeholder="Ten nhan vien" name="tennv">
    </div>
    <div class="input-container">
        <i class="fa fa-user icon"></i>
        <input class="input-field" type="text" placeholder="So dien thoai" name="sdtnv">
    </div>
    
    <div class="input-container">
        <i class="fa fa-user icon"></i>
        <input class="input-field" type="text" placeholder="Ten tai khoan" name="taikhoan">
    </div>

    <div class="input-container">
        <i class="fa fa-envelope icon"></i>
        <input class="input-field" type="text" placeholder="Email" name="email">
    </div>

    <div class="input-container">
        <i class="fa fa-key icon"></i>
        <input class="input-field" type="password" placeholder="Mat khau" name="matkhau">
    </div>
    <button type="submit" class="btn">Register</button>
    <div class="col">
        <a href="https://www.facebook.com" class="fb btn">
            <i class="fa fa-facebook fa-fw"></i> Login with Facebook
        </a>
        <a href="https://www.google.com" class="google btn">
            <i class="fa fa-google fa-fw"></i> Login with Google+
        </a>
    </div>
</form>
<script>
    function myFunction() {
        var x = document.createElement("SCRIPT");
        var t = document.createTextNode("alert('Đăng Ký Thành Công')");
        x.appendChild(t);
        document.body.appendChild(x);
    }
</script>
</body>
</html>
