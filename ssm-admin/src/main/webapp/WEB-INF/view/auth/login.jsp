<%--
  Created by IntelliJ IDEA.
  User: huangjun
  Time: 2017/11/23 13:46
  Motto：软件在能够复用前必须先能用。
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Date" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort() + path;
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>ssm</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <link rel="stylesheet" href="<%=basePath%>/static/css/bootstrap.min.css">
    <link rel="stylesheet" href="<%=basePath%>/static/css/font-awesome.min.css">
    <link rel="stylesheet" href="<%=basePath%>/static/css/iCheck/all.css">
    <link rel="stylesheet" href="<%=basePath%>/static/css/adminLTE/AdminLTE.min.css">
    <link rel="stylesheet" href="<%=basePath%>/static/css/adminLTE/skins/_all-skins.min.css">

    <script>
        var require = { urlArgs:'v=<%=new Date().getTime()%>', baseUrl: '<%=basePath%>/static/js/lib/'};
    </script>
    <script type="text/javascript" src="<%=basePath%>/static/js/require.js"></script>
    <script type="text/javascript" src="<%=basePath%>/static/js/lib/config.js"></script>
</head>
<body class="login-page hold-transition">
<div class="login-box">
    <div class="login-logo">
        <a href=""><b>Admin</b>LTE</a>
    </div>
    <!-- /.login-logo -->
    <div class="login-box-body">
        <p class="login-box-msg">Sign in to start your session</p>
        <c:if test="${not empty error}">
            <p class="error text-red">${error}</p>
        </c:if>
        <c:if test="${not empty msg}">
            <p class="msg text-red">${msg}</p>
        </c:if>
        <form action="<c:url value='/login'/>" method="post">
            <div class="form-group has-feedback">
                <input type="text" class="form-control" name="username" placeholder="用户名">
                <span class="glyphicon glyphicon-user form-control-feedback"></span>
            </div>
            <div class="form-group has-feedback">
                <input type="password" class="form-control" name="password" placeholder="密码">
                <span class="glyphicon glyphicon-lock form-control-feedback"></span>
            </div>
            <div class="row">
                <div class="col-xs-8">
                    <div class="checkbox icheck" style="margin-bottom: 0;margin-top: 0;">
                        <label>
                            <input type="checkbox" name="remember-me" value="1"> 记住密码
                        </label>
                    </div>
                </div>
                <!-- /.col -->
                <div class="col-xs-4">
                    <button type="submit" class="btn btn-primary btn-block btn-flat">登录</button>
                </div>
                <!-- /.col -->
            </div>
        </form>

    </div>
    <!-- /.login-box-body -->
</div>
<script>
    require(['jquery','icheck'],function ($) {
        $(function () {
            $('input').iCheck({
                checkboxClass: 'icheckbox_square-blue',
                radioClass: 'iradio_square-blue',
                increaseArea: '20%' // optional
            });
        });
    });
</script>
</body>
</html>