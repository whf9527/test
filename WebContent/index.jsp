<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="service.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

<body style="padding-top: 70px;">

    <nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="container">
            <a class="navbar-brand" href="/index.html">欢迎来到EasyBBS</a>
            <ul class="nav navbar-nav navbar-right">
                <li>
                    <a href="<%=request.getContextPath() %>/login.jsp">登录</a>
                </li>
                <li>
                    <a href="<%=request.getContextPath() %>/register.jsp">注册</a>
                </li>
            </ul>

        </div>
    </nav>


    <div class="container">

        <div>
            <em class="glyphicon glyphicon-stats"></em>
            欢迎新会员 : <span><%
            String userName = (String) session.getAttribute("username");
            %>
            <%=userName %>
            </span>
            </div>
     </div>
     
        <c:forEach items="${stus }" var="stu">
            <div class="col-md-3">
                <div class="row">
                    <div class="col-md-2">
                        <h4 class="glyphicon glyphicon-send"></h4>
                    </div>
                    <div class="col-md-10">
                        <h4>
                      
	                        	<a href="<%=request.getContextPath() %>/class161board?boardId=${stu.boardId}">
	                      
	                        	${stu.boardName }
	                     	   </a>
                     	  
                        </h4>
                        <p>
                          发贴 : <span>${stu.topicCount }</span>
                          回复 : <span>${stu.replyCount }</span>
                        </p>
                        <p>
                            最后发表 :<span>${stu.lastPostTime }</span>
                        </p>
                    </div>
                </div>
            </div>
       </c:forEach>
       
    <!-- jQuery -->
    <script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>
    <!-- Bootstrap JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>

</html>