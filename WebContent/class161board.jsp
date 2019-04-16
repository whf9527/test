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
            <a class="navbar-brand" href="/index.html">班级</a>
            <ul class="nav navbar-nav navbar-right">
                <li>
                    <a href="<%=request.getContextPath() %>/isstopic.jsp">发帖</a>
                </li>
          
            </ul>
        </div>
    </nav>


     
     
     
     
     <!-- 帖子 -->
     
           <c:forEach items="${tclass }" var="stu">
           		<c:if test = "${stu.boardId ==1 }">
           			<br>
           			<h4>
           			<a href="<%=request.getContextPath() %>/reply?topicId=${stu.topicId }">
	                        	${stu.title }
	                </a>
	                
           			</h4>
           			<p>
           			作者 : <span>${stu.userName }</span>
                          时间 : <span>${stu.postTime }</span>
                    </p>
                   
           			<br>
           			</c:if>
           	</c:forEach>
                          
           		
        

    <!-- jQuery -->
    <script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>
    <!-- Bootstrap JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>

</html>