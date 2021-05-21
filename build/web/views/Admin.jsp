<%-- 
    Document   : Admin
    Created on : May 21, 2021, 6:58:55 AM
    Author     : HELLO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vn">
<head>
    <meta charset="UTF-8">
    <title>Admin-LEO</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/views/icon_font/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/views/css/Admin.css">
</head>
<body>
<div class="sidenav">
    <img class="img" src="${pageContext.request.contextPath}/views/img/logo2.png" style="z-index: 1">
    <div class="catory">
        <a href="Admin.html"><i class="fa fa-address-card fa-2x" aria-hidden="true" style="color: black"></i> Thông Tin Admin</a>
        <a href="DonHang.html"><i class="fa fa-cart-arrow-down fa-2x" aria-hidden="true" style="color: black"></i> Đơn Hàng</a>
        <a href="#product"><i class="fa fa-archive fa-2x" aria-hidden="true" style="color: black"></i> Danh Sách Sản Phẩm</a>
        <a href="#Report"><i class="fa fa-bar-chart fa-2x" aria-hidden="true" style="color: black"></i> Doanh Thu</a>
    </div>
    <div>
        <a href="${pageContext.request.contextPath}/Logout"><i class="fa fa-sign-out fa-2x" aria-hidden="true" style="color: black"></i> Đăng Xuất</a>
    </div>
</div>
<div class="avaadmin">
    <h4 class="infoadmin">Thông Tin Admin</h4>
    <hr>
    <div class="Thongtintaikhoan" >
        <a style="font-weight: bold">Thông tin tài khoản</a>
        <br><hr>
        <a>Các thông tin cơ bản tài khoản đang đăng nhập hệ thống</a>
    </div>
    <div class="infomation">
        <div class="first">
            <p>Tên Admin</p>
            <input type="text" name="adminName" value="${account.getTenNV()}" placeholder="Tên Admin">
            <p>Mật Khẩu</p>
            <input type="text" name="password" value="${account.getMatkhau()}" placeholder="Mật khẩu">
            <p>Số điện thoại</p>
            <input type="text" name="number" value="${account.getSDTNV()}" placeholder="Số điện thoại">
            <p>Ghi Chú</p>
            <input type="text" name="note" placeholder="">
        </div>
        <div class="half-past">
            <p>Email</p>
            <input type="email" name="email" value="${account.getEmail()}" placeholder="@gmail.com">
            <p>Địa Chỉ</p>
            <input type="text" name="address" value="${account.getDiaChiNV()}" placeholder="Địa chỉ">
            <p>Ngày Sinh</p>
            <input type="date" name="birthday"  placeholder="Ngày sinh">
            <p>Trạng Thái Làm Việc</p>
            <input type="text" name="txtTTL" placeholder="Đang Làm Việc">
        </div>
    </div>
    <a href=""><button class="btn" type="submit">Lưu</button></a>
</div>
</body>
</html>
