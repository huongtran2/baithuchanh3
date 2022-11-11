<%--
  Created by IntelliJ IDEA.
  User: Tran Thi Thu Hang
  Date: 03/11/2022
  Time: 4:37 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table style=" background-color:blue" align="center">
    <tr >

        <br>
        <h1 STYLE="color:black;top: 300px; left: 350px"  align="center" >QUAN LÝ SẢN PHẨM</h1>
    </tr>
    <br>
</table>
<div align="center">
    <form action="/createsanphamservlet">
        <h1>Create san pham</h1>
        <table>
            <tr>
                <td>Nhập id san phẩm</td>
                <td><input name="Idsanpham" placeholder="nhập Idsanpham"></td>
                <h6 style="color: red">${thongbaoIdsanpham}</h6>
            </tr>

            <tr>
                <td>Nhập name sản phẩm</td>
                <td><input name="namesanpham" placeholder="nhập namesanpham"></td>
            </tr>
            <tr>
                <td>Nhập giá sản phẩm</td>
                <td><input name="price" placeholder="nhập price"></td>
            </tr>

        </table>
        <br>
        <button type="submit">Submit</button>
    </form>
</div>

</body>
</html>
