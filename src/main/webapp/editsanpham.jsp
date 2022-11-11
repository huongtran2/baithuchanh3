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
        <h1 STYLE="color:black;top: 300px; left: 350px"  align="center" >DOLCE&GABBANA</h1>
    </tr>
    <br>
</table>
<div align="center">
    <form action="/editsanphamservlet" method="post">
        <h1>Edit Hoc Vien</h1>
        <table>
            <tr>
                <td>Nhập id san pham</td>
                <td><input  type="text" class="form-control" name="Idsanpham" value="${sanphams.getIdsanpham()}" readonly></td>

            </tr>

            <tr>
                <td>Nhập name san pham</td>
                <div class="form-group">
                    <td><input type="text" class="form-control" name="namesanpham" value="${sanphams.getNamesanpham()}"></td>
                </div>
            </tr>
            <tr>
                <td>Nhập giá sản phẩm</td>
                <td><input name="price" class="form-control" name="price" value="${sanphams.getPrice()}"></td>
            </tr>
        </table>
        <button type="submit">Submit</button>
    </form>
</div>

</body>
</html>
