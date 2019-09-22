<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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

            <li id="admin-index"><a id="titel"><i class="fa fa-dashboard"></i> <span>首页</span></a></li>

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
                        <a href="${pageContext.request.contextPath}/pages/page/register.jsp">
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
                        <a id = "comm">
                            <i class="fa fa-circle-o"></i> 商品信息
                        </a>
                    </li>


                    <%--${pageContext.request.contextPath}/pages/page/add-comm.jsp--%>
                    <li id="form-advanced">
                        <a id="addcomm" >
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
                        <a id = "staff_info">
                            <i class="fa fa-circle-o"></i> 员工列表
                        </a>
                    </li>

                    <li id="travellog-review">
                        <a id="addstaff" >
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
                        <a id="warehouse">
                            <i class="fa fa-circle-o"></i> 仓库商品信息
                        </a>
                    </li>

                    <li id="system-setting1">
                        <a id="addwarehouse">
                            <i class="fa fa-circle-o"></i> 创库
                        </a>
                    </li>

                </ul>
            </li>


        </ul>
    </section>
    <!-- /.sidebar -->
</aside>




    <%--$("#addcomm").click(function () {--%>
        <%--var url = "${pageContext.request.contextPath}/pages/page/add-comm.jsp";--%>
        <%--$.post(url,"wzq",function (date) {--%>
            <%--alert(date);--%>
        <%--})--%>
    <%--});--%>


<%--<%@include file="../headel/tail.jsp"%>--%>
<%--<jsp:include page="${pageContext.request.contextPath}/pages/headel/tail.jsp" flush="true"></jsp:include>--%>
