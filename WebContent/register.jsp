<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>EasyBBS</title>

        <!-- Bootstrap CSS -->
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://cdn.bootcss.com/html5shiv/r29/html5.min.js"></script>
            <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
        
        <div class="container">
            
            <form action="<%=request.getContextPath() %>/register" method="POST" role="form" style="margin: 100px auto; width: 520px;">
                <legend>EasyBBS - 用户注册</legend>
            
                <div class="form-group">
                    <label for="">用户名</label>
                    <input type="text" class="form-control" id="" name="username" placeholder="用户名">
                </div>
                
                <div class="form-group">
                    <label for="">密码</label>
                    <input type="password" class="form-control" id="" name="password1" placeholder="密码">
                </div>

                <div class="form-group">
                    <label for="">确认密码</label>
                    <input type="password" class="form-control" id="" name="password2"placeholder="确认密码">
                </div>
            
                <button type="submit" class="btn btn-primary">立即注册</button>
                <p style="collor:red;">	${tip }</p>
            </form>
            
        </div>

        <!-- jQuery -->
        <script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>
        <!-- Bootstrap JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </body>
</html>
