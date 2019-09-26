<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>超市管理系统登陆界面</title>
    <%@include file="../headel/headfile.jsp"%>
</head>

<body class="hold-transition login-page">
<div class="login-box">
    <div class="login-logo">
        <a href="all-admin-index.html"><b>超市</b>后台管理系统</a>
    </div>
    <!-- /.login-logo -->
    <div class="login-box-body">
        <p class="login-box-msg">登录系统</p>
        <div class="social-auth-links text-center ">
            <%--<a href="#" class="btn btn-block btn-social btn-google btn-flat"><i class="fa fa-weixin"></i></a>--%>
            <span class=" btn-block btn-google" ><i id="nopower">${msg}</i></span>

        </div>
        <a href="${pageContext.request.contextPath}/admin/no_power.do"></a>
        <form action="${pageContext.request.contextPath}/admin/login.do" method="get">
            <div class="form-group has-feedback">
                <input type="text" class="form-control" name="name" placeholder="用户名">
                <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
            </div>
            <div class="form-group has-feedback">
                <input type="password" class="form-control" name="password" placeholder="密码">
                <span class="glyphicon glyphicon-lock form-control-feedback"></span>
            </div>
            <div class="row">
                <div class="col-xs-8">
                    <div class="checkbox icheck">
                        <label><input type="checkbox" > 记住 下次自动登录</label>
                    </div>
                </div>
               <br>
                <div class="col-xs-12">
                    <button type="submit" class="btn btn-primary btn-block btn-flat">登录</button>
                </div>
                <!-- /.col -->
            </div>
        </form>

        <a href="#">忘记密码</a><br>
        <a href="${pageContext.request.contextPath}/pages/page/register.jsp" class="text-center">新用户注册</a>
    </div>

</div>
<!-- jQuery 2.2.3 -->
<!-- Bootstrap 3.3.6 -->
<!-- iCheck -->
<script src="${pageContext.request.contextPath}/plugins/jQuery/jquery-2.2.3.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/iCheck/icheck.min.js"></script>
<script>
    $(function() {
        //记住登录的控制函数
        $('input').iCheck({
            checkboxClass: 'icheckbox_square-blue',
            radioClass: 'iradio_square-blue',
            increaseArea: '20%' // optional
        });
        // $('nopower').

    });
</script>
</body>

</html>
