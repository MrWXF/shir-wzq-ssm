<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">


    <title>
        数据 - AdminLTE2定制版 | Log in</title>


    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.6 -->
    <!-- Font Awesome -->
    <!-- Ionicons -->
    <!-- Theme style -->
    <!-- iCheck -->
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/ionicons/css/ionicons.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/adminLTE/css/AdminLTE.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/iCheck/square/blue.css">
</head>

<body class="hold-transition register-page">
<div class="register-box">
    <div class="register-logo">





    </div>

    <div class="register-box-body">
        <p class="login-box-msg">密码修改</p>

        <%--${pageContext.request.contextPath}--%>
        <form action="#" id="form" method="get">
            <div class="form-group has-feedback">
                <input type="password" class="form-control" id="u_password" name="uppassword" placeholder="密码">
                <span class="glyphicon glyphicon-lock form-control-feedback"></span>
            </div>
            <div class="form-group has-feedback">
                <input type="password" class="form-control" id="up_password" name="repassword" placeholder="确认密码">
                <span class="glyphicon glyphicon-log-in form-control-feedback"></span>
            </div>

            <div class="row">
                <!-- /.col -->
                <div class="col-xs-12">
                    <button type="submit" id="btu_commit" class="btn btn-primary btn-block btn-flat">确认修改</button>
                </div>
                <!-- /.col -->
            </div>
        </form>

    </div>
    <!-- /.form-box -->
</div>
<!-- /.register-box -->

<!-- jQuery 2.2.3 -->
<!-- Bootstrap 3.3.6 -->
<!-- iCheck -->
<script src="${pageContext.request.contextPath}/plugins/jQuery/jquery-2.2.3.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/iCheck/icheck.min.js"></script>
<script>
    $(function() {
        $('input').iCheck({
            checkboxClass: 'icheckbox_square-blue',
            radioClass: 'iradio_square-blue',
            increaseArea: '20%' // optional
        });

        $("#up_password").mouseout(function () {
            var pwd = document.getElementById("u_password").value;
            var repwd = document.getElementById("up_password").value;
            if(pwd==repwd&&repwd!=null){
                $("#btu_commit").click(function () {
                    var form = document.getElementById("form");
                    form.action = "${pageContext.request.contextPath}/admin/upPassword.do?password="+pwd;
                });
            }
            else {
                alert("两次输入的密码不一致！");
            }
        });

        <%--$("#btu_commit").click(function () {--%>

           <%--var form = document.getElementById("form");--%>
            <%--form.action = "${pageContext.request.contextPath}/admin/upPassword.do";--%>
        <%--});--%>


    });
</script>
</body>

</html>