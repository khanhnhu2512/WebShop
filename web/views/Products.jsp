<%-- 
    Document   : Products
    Created on : May 21, 2021, 6:50:37 AM
    Author     : HELLO
--%>

<%@page import="java.util.List"%>
<%@page import="entity.SanPham"%>
<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>SHOP-LEO</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/views/icon_font/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/views/css/products.css">
</head>
<body>
<div class="sidenav">
    <a href="">
        <img class="img" src="${pageContext.request.contextPath}/views/img/logo2.png">
    </a>
    <div class="head">
        <a href="" >SHOP</a>
        <a href="" >RESTOCKS</a>
        <a href="#" >NEWS</a>
        <a href="" >CONTACT</a>
        <a href="#" >ABOUT</a>
    </div>
    <div class="icon">
        <a href=""><i class="fa fa-search fa-2x" aria-hidden="true" style="color: black"></i></a>
        <a href="${pageContext.request.contextPath}/Logout"><i class="fa fa-user fa-2x" aria-hidden="true" style="color: black"></i></a>
        <a href=""><i class="fa fa-shopping-basket fa-2x" aria-hidden="true" style="color: black"></i></a>
    </div>
</div>
<br>
<br>
/*Hinh mo dau*/
<div class="container">
    <img class="pic" src="${pageContext.request.contextPath}/views/img/slide-img5.jpg" alt="Snow" style="width:1100px" height="300px">
    <div class="centered">SHOP</div>
</div>

<br>


<div class="main">
    <div class="dropdown">
        <a><button class="dropbtn" onclick="filterSelection('all')"> Show All</button></a>
        <div id="myBtnContainer">

        </div>
    </div>

    <div class="dropdown">
        <a><button onclick="myFunction()" class="dropbtn">Loại <i class="fa fa-caret-down" aria-hidden="true" style="right: 100px"></i></button></a>
        <div id="myDropdown" class="dropdown-content">
            <a href="#"><button class="btncon" onclick="filterSelection('t-shirt')"> T-Shirt</button></a>
            <a href="#"><button class="btncon" onclick="filterSelection('shrt')"> Shirt</button></a>
            <a href="#"><button class="btncon" onclick="filterSelection('backpack')"> Backpack</button></a>
            <a href="#"><button class="btncon" onclick="filterSelection('shorts')"> Short</button></a>
        </div>
    </div>

    <div class="dropdown">
        <a><button onclick="myFunction1()" class="dropbtn">Colour<i class="fa fa-caret-down" aria-hidden="true" ></i></button></a>
        <div id="myDropdown1" class="dropdown-content">
            <a href="#"><button class="btncon" onclick="filterSelection('white')"> White</button></a>
            <a href="#"><button class="btncon" onclick="filterSelection('black')"> Black</button></a>
            <a href="#"><button class="btncon" onclick="filterSelection('beige')"> Beige</button></a>
            <a href="#"><button class="btncon" onclick="filterSelection('sky')">Sky</button></a>
            <a href="#"><button class="btncon" onclick="filterSelection('mint')">Mint</button></a>
            <a href="#"><button class="btncon" onclick="filterSelection('tan')">Tan</button></a>
            <a href="#"><button class="btncon" onclick="filterSelection('red')">Red</button></a>
        </div>
    </div>
    <div class="dropdown">
        <a><button onclick="myFunction2()" class="dropbtn">Price<i class="fa fa-caret-down" aria-hidden="true" style="right: 100px" ></i></button></a>
        <div id="myDropdown2" class="dropdown-content">
            <a href="#"><button class="btncon" onclick="filterSelection('200')"> 200.000đ-300.000đ </button></a>
            <a href="#"><button class="btncon" onclick="filterSelection('350')"> 350.000đ-600.000đ</button></a>
            <a href="#"><button class="btncon" onclick="filterSelection('550')"> 550.000đ-800.000đ</button></a>
            <a href="#"><button class="btncon" onclick="filterSelection('800')"> 800.000đ-1.500.000đ</button></a>
        </div>
    </div>
    <br>
    <hr style="border: 2px solid black">
    <div class="row">
        <%
            List<SanPham> list = (List) request.getAttribute("products");
//            out.print(request.getAttribute("logs"));
//            out.print(list);
        %>
        <%
            for(SanPham sp : list){
        %>
        <div class="column 350">
            <div class="content">
                <a href="#">
                    <img src="${pageContext.request.contextPath}<% out.print(sp.getAnh()); %>" alt="" style="width:100%">
                    <h4><% out.print(sp.getTenSP()); %></h4>
                    <p><% out.print(String.format("%,g", sp.getGiaSP())); %>đ</p>
                </a>
            </div>
        </div>
        <%
            }
        %>
    </div>
</div>

<div class="end">
    <hr style="border: 2px solid black">
    <div>
        <a><i class="fa fa-phone-square" aria-hidden="true" style="margin-left: -30px"></i> Hỗ Trợ/Mua Hàng: 0706166088</a>
    </div>
    <hr style="border: 2px solid black">
</div>

<div class="info">
    <div>
        <h4>Giới Thiệu</h4>
        <a>DirtyCoins xuất hiện trên thị trường từ đầu năm 2017, DirtyCoins mang sức mạnh của một thương hiệu local brand đầy cá tính với những sản phẩm thời trang hàng đầu xu thế. DirtyCoins thực chất là một cách lồng ghép khéo léo về sự ra đời của thương hiệu. Chữ Y trên đồng tiền tượng trưng cho tiền thân của DirtyCoins, The Yars Shop. Bắt nguồn từ Yars, DirtyCoins trân trọng giá trị của đồng tiền xương máu, thành quả lao động đầy mồ hôi, bụi bẩn và nước mắt. Với sức hút của mình, Dirty Coins trở thành biểu tượng cho phong cách thời trang mạnh mẽ, táo bạo, và được ưa chuộng rộng rãi. DirtyCoins mang đến một cái góc độ độc đáo không những về phong cách sống mà còn về gout ăn mặc hiện đại. DirtyCoins nhận thức được nhu cầu đang phát triển của thị trường Streetwear Việt Nam. Những mặt hàng thời trang tại DirtyCoins được thiết kế với sự kết hợp văn hoá Châu Á và Châu Âu, tạo ra phong cách độc đáo và mới mẻ. Bên cạnh đó ,với sự phá cách từ tông màu trắng đen, tông màu chủ đạo của đa số dòng thời trang Streetwear, các mẫu thời trang tại Dirtycoins mang nhiều màu sắc phong phú. Đây là cách DirtyCoins mang đến giá trị cho cộng đồng trẻ yêu thích Streetwear, khuyến khích họ mạo hiểm trong gu ăn mặc của mình. Với tính cách mạo hiểm, không ngại rủi ro, DirtyCoins dần mở rộng thị trường trong suốt quá trình phát triển các chi nhánh trên toàn quốc, đem tới một nền văn hoá rất riêng của DirtyCoins.</a>
        <h4>Mạng Xã Hội</h4>
        <div class="mxh">
            <a href="https://www.facebook.com"><i class="fa fa-facebook fa-2x" aria-hidden="true" style="color: white;background: #0b7dda;width: 35px;height: 30px;border-radius: 30%"></i></a>
            <a href="https://www.instagram.com"><i class="fa fa-instagram fa-2x" aria-hidden="true" style="color: white;background:  #ffad1a;width: 35px;height: 30px;border-radius: 30%"></i></a>
            <a href="https://www.youtube.com"><i class="fa fa-youtube-play fa-2x" aria-hidden="true" style="color: red;border-radius: 30%"></i></a>
        </div>

    </div>
</div>


<script>
    filterSelection("all")
    function filterSelection(c) {
        var x, i;
        x = document.getElementsByClassName("column");
        if (c == "all") c = "";
        for (i = 0; i < x.length; i++) {
            RemoveClass(x[i], "show");
            if (x[i].className.indexOf(c) > -1) AddClass(x[i], "show");
        }
    }

    function AddClass(element, name) {
        var i, arr1, arr2;
        arr1 = element.className.split(" ");
        arr2 = name.split(" ");
        for (i = 0; i < arr2.length; i++) {
            if (arr1.indexOf(arr2[i]) == -1) {element.className += " " + arr2[i];}
        }
    }

    function RemoveClass(element, name) {
        var i, arr1, arr2;
        arr1 = element.className.split(" ");
        arr2 = name.split(" ");
        for (i = 0; i < arr2.length; i++) {
            while (arr1.indexOf(arr2[i]) > -1) {
                arr1.splice(arr1.indexOf(arr2[i]), 1);
            }
        }
        element.className = arr1.join(" ");
    }


    var btnContainer = document.getElementById("myBtnContainer");
    var btns = btnContainer.getElementsByClassName("btn");
    for (var i = 0; i < btns.length; i++) {
        btns[i].addEventListener("click", function(){
            var current = document.getElementsByClassName("active");
            current[0].className = current[0].className.replace(" active", "");
            this.className += " active";
        });
    }
</script>

<script>
    function myFunction() {
        document.getElementById("myDropdown").classList.toggle("show");
    }
    function myFunction1() {
        document.getElementById("myDropdown1").classList.toggle("show");
    }
    function myFunction2() {
        document.getElementById("myDropdown2").classList.toggle("show");
    }

    // Close the dropdown if the user clicks outside of it
    window.onclick = function(event) {
        if (!event.target.matches('.dropbtn')) {
            var dropdowns = document.getElementsByClassName("dropdown-content");
            var i;
            for (i = 0; i < dropdowns.length; i++) {
                var openDropdown = dropdowns[i];
                if (openDropdown.classList.contains('show')) {
                    openDropdown.classList.remove('show');
                }
            }
        }
    }
</script>

</body>
</html>