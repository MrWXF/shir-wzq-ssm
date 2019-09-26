<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <%--<%@include file="headfile.jsp"%>--%>
        <meta name="description" content="AdminLTE2定制版">
        <meta name="keywords" content="AdminLTE2定制版">

        <!-- Tell the browser to be responsive to screen width -->
        <meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" name="viewport">
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>

        <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/font-awesome/css/font-awesome.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/ionicons/css/ionicons.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/iCheck/square/blue.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/morris/morris.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/datepicker/datepicker3.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/datatables/dataTables.bootstrap.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.theme.default.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/select2/select2.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/colorpicker/bootstrap-colorpicker.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/bootstrap-markdown/css/bootstrap-markdown.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/adminLTE/css/AdminLTE.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/adminLTE/css/skins/_all-skins.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.skinNice.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/bootstrap-slider/slider.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.css">

</head>
<body>

    <header class="main-header">


        <!-- Logo -->
        <a href="all-admin-index.html" class="logo">
            <!-- mini logo for sidebar mini 50x50 pixels -->
            <span class="logo-mini"><b>数据</b></span>
            <!-- logo for regular state and mobile devices -->
            <span class="logo-lg"><b>数据</b>后台管理</span>
        </a>


        <!-- Header Navbar: style can be found in header.less -->
        <nav class="navbar navbar-static-top">
            <!-- Sidebar toggle button-->
            <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
                <span class="sr-only">Toggle navigation</span>
            </a>

            <div class="navbar-custom-menu">
                <ul class="nav navbar-nav">
                    <!-- User Account: style can be found in dropdown.less -->
                    <li class="dropdown user user-menu">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <img src="${pageContext.request.contextPath}/img/user2-160x160.jpg" class="user-image" alt="User Image">
                            <span class="hidden-xs"><shiro:principal/></span>
                        </a>
                        <ul class="dropdown-menu">
                            <!-- User image -->
                            <li class="user-header">
                                <img src="${pageContext.request.contextPath}/img/user2-160x160.jpg" class="img-circle" alt="User Image">

                                <p>
                                    <shiro:principal/>- 数据管理员
                                    <small>最后登录 11:20AM</small>
                                </p>
                            </li>

                            <li class="user-footer">
                                <div class="pull-left">
                                    <a href="#" class="btn btn-default btn-flat">修改密码</a>
                                </div>
                                <div class="pull-right">
                                    <a href="${pageContext.request.contextPath}/admin/logout.do" class="btn btn-default btn-flat">注销</a>
                                </div>
                            </li>
                        </ul>
                    </li>

                </ul>
            </div>
        </nav>
    </header>
    <aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">
            <!-- Sidebar user panel -->
            <div class="user-panel">
                <div class="pull-left image">
                    <img src="${pageContext.request.contextPath}/img/user2-160x160.jpg" class="img-circle" alt="User Image">
                </div>
                <div class="pull-left info">
                    <p><shiro:principal/></p>
                    <a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
                </div>
            </div>

            <!-- /.search form -->


            <!-- sidebar menu: : style can be found in sidebar.less -->
            <ul class="sidebar-menu">
                <li class="header">菜单</li>

                <li id="admin-index"><a href="#"><i class="fa fa-dashboard"></i> <span>首页</span></a></li>

                <!-- 菜单 -->



                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-folder"></i> <span>个人页面</span>
                        <span class="pull-right-container">
                            <i class="fa fa-angle-left pull-right"></i>
                        </span>
                    </a>
                    <ul class="treeview-menu">

                        <li id="admin-login">
                            <a href="${pageContext.request.contextPath}/pages/page/login.jsp">
                                <i class="fa fa-circle-o"></i> 登录
                            </a>
                        </li>

                        <li id="admin-register">
                            <a href="#">
                                <i class="fa fa-circle-o"></i> 注册
                            </a>
                        </li>


                        <li id="admin-datalist">
                            <a href="#">
                                <i class="fa fa-circle-o"></i> 数据列表页
                            </a>
                        </li>



                        <li id="admin-profile">
                            <a href="#">
                                <i class="fa fa-circle-o"></i> 个人中心
                            </a>
                        </li>





                    </ul>
                </li>


                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-edit"></i> <span>商品</span>
                        <span class="pull-right-container">
                            <i class="fa fa-angle-left pull-right"></i>
                        </span>
                    </a>
                    <ul class="treeview-menu">

                        <li id="form-general">
                            <a href="${pageContext.request.contextPath}/pages/lj/comm_select.jsp">
                                <i class="fa fa-circle-o"></i> 商品信息
                            </a>
                        </li>



                        <li id="form-advanced">
                            <a id="addcomm" href="${pageContext.request.contextPath}/pages/lj/comm.jsp">
                                <i class="fa fa-circle-o"></i> 添加商品
                            </a>
                        </li>
                    </ul>
                </li>


                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-book"></i> <span>员工管理</span>
                        <span class="pull-right-container">
                            <i class="fa fa-angle-left pull-right"></i>
                        </span>
                    </a>
                    <ul class="treeview-menu">

                        <li id="travellog-manage">
                            <a href="${pageContext.request.contextPath}/pages/lj/staff_select.jsp">
                                <i class="fa fa-circle-o"></i> 员工列表
                            </a>
                        </li>

                        <li id="travellog-review">
                            <a href="#">
                                <i class="fa fa-circle-o"></i> 添加员工
                            </a>
                        </li>



                    </ul>
                </li>


                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-cogs"></i> <span>仓库管理</span>
                        <span class="pull-right-container">
                            <i class="fa fa-angle-left pull-right"></i>
                        </span>
                    </a>
                    <ul class="treeview-menu">

                        <li id="system-setting">
                            <a href="all-system-setting-edit.html">
                                <i class="fa fa-circle-o"></i> 仓库商品信息
                            </a>
                        </li>

                        <li id="system-setting1">
                            <a href="all-system-setting-edit.html">
                                <i class="fa fa-circle-o"></i> 创库
                            </a>
                        </li>

                    </ul>
                </li>


            </ul>
        </section>
        <!-- /.sidebar -->
    </aside>


</body>
</html>

