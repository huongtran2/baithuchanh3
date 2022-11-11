<%--
  Created by IntelliJ IDEA.
  User: Tran Thi Thu Hang
  Date: 02/11/2022
  Time: 5:31 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td WIDTH="1300px">
            <section class="h-100 h-custom" style="background-color: #8fc4b7;">
                <div class="container py-5 h-100">
                    <div class="row d-flex justify-content-center align-items-center h-100">
                        <div class="col-lg-8 col-xl-6">
                            <div class="card rounded-3" align="center">

                                <img src="https://image.bnews.vn/MediaUpload/Org/2021/12/25/1-1-img-1040-780-20211225121419.jpg"
                                     class="w-100" style="border-top-left-radius: .3rem; border-top-right-radius: .3rem;"
                                     alt="Sample photo" width=" 800px" height="400px" align="center">
                                <div class="card-body p-4 p-md-5" align="center">
                                    <h1 class="mb-4 pb-2 pb-md-0 mb-md-5 px-md-2"><i>DOLCE&GABBANA</i></h1>

                                </div>
                            </div>

                            <form class="px-md-2" action="/registerservlet" method="post">

                                <div class="form-outline mb-4">
                                    <input type="text" id="form3Example1q" class="form-control" name="id"/>
                                    <label class="form-label" for="form3Example1q">Nhập id :</label>
                                </div>


                                <div class="form-outline datepicker">
                                    <input type="text" class="form-control" id="username" name="username"/>
                                    <label for="username" class="form-label">Nhập username :</label>
                                </div>
                                <div class="form-outline datepicker">
                                    <input type="text" class="form-control" id="Password" name="password"/>
                                    <label for="Password" class="form-label">Password :</label>
                                </div>

                                <div class="form-outline datepicker">
                                    <input type="text" class="form-control" id="id_role" name="id_role"/>
                                    <label for="id_role" class="form-label">id_role :</label>
                                </div>
                                <button type="submit" class="btn btn-success btn-lg mb-1">Submit</button>


                            </form>
                            <form action="login.jsp">
                                <%--                        <a type="button" class="btn btn-success" href="/login.jsp">Login</a>--%>
                                <button type="submit">Login</button>
                            </form>
                        </div>

                    </div>
                </div>
                </div>
                </div>
            </section>
        </td>
    </tr>
</table>
<table>
    <tr>


    </tr>
</table>

<table>
    <tr>
        <td width="600px">
            <h3 align="center">THE DOLCE&GABBANA AESTHETIC MEETS THE CHALLENGES AND DREAMS OF THE WORLD OF GAMING</h3>
        </td>
    </tr>
</table>
</body>
</html>
