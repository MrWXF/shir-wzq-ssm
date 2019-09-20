<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <>
    <%@include file="../headel/tail.jsp"%>
</head>
<body>
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
                        <a id="addcomm" href="${pageContext.request.contextPath}/pages/page/comm.jsp">
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

<script>


    <%--$("#addcomm").click(function () {--%>
        <%--var url = "${pageContext.request.contextPath}/pages/page/add-comm.jsp";--%>
        <%--$.post(url,"wzq",function (date) {--%>
            <%--alert(date);--%>
        <%--})--%>
    <%--});--%>

    $("#addcomm").click(function(){
        $.ajax({
            //url表示我们请求的是哪一个资源,一般是一个Servlet，属性之间用“,”隔开
            url:"${pageContext.request.contextPath}/comm/ajax.do",
            //请求类型
            type:"post",
            //需要带去的值,带去的时候要先获取这个元素的值
            data:{
                name:"111"
            },
            //返回的数据类型
            dataType:"json",
            //接收返回的值，返回的值存在result中
            success:function(result){
                var flag = result.flag;
                if(flag){
                    //如果返回的正确，我们就跳转到登录成功页面
                    window.location.g=href="${pageContext.request.contextPath}/pages/page/add-comm.jsp";
                }else{
                    //如果失败，我们我要跳回登录界面，并给用户友好的提示
                    window.location.g=href="${pageContext.request.contextPath}/pages/papg/add-comm.jsp"
                }
            }
        });
    });
</script>
<%--<%@include file="../headel/tail.jsp"%>--%>
<%--<jsp:include page="${pageContext.request.contextPath}/pages/headel/tail.jsp" flush="true"></jsp:include>--%>
</body>
</html>
