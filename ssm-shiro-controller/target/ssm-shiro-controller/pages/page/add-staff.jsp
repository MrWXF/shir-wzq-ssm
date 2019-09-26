<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<!DOCTYPE html>
<html>
<head>
    <!-- 页面meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>数据 - AdminLTE2定制版</title>
    <%@include file="../headel/headfile.jsp"%>
    <%--<%@include file="../headel/tail.jsp"%>--%>
    <%--<jsp:include page="${pageContext.request.contextPath}/pages/headel/headfile.jsp"  >--%>
</head>
<body class="hold-transition skin-purple sidebar-mini">

    <div class="content-wrapper">
        <!-- 内容头部 -->

        <!-- 内容头部 /-->

    <!-- 内容头部 -->
        <section class="content-header">
        <h1>
            添加员工
        </h1>
        </section>

        <section class="content">

            <!--订单信息-->
            <form action="${pageContext.request.contextPath}/staff/addStaff.do" method="post">
            <div class="panel panel-default">

                <div class="row data-type">

                    <div class="col-md-2 title">职工名称</div>
                    <div class="col-md-4 data">
                        <input type="text" class="form-control" placeholder="职工名称" name="name">
                    </div>

                    <div class="col-md-2 title">职工职称</div>
                    <div class="col-md-4 data">
                        <input type="text" class="form-control" placeholder="职工职称" name="title">
                    </div>

                    <div class="col-md-2 title">电话</div>
                    <div class="col-md-4 data">
                        <input type="text" class="form-control" placeholder="电话" name="phone">
                    </div>

                    <div class="col-md-2 title">地址</div>
                    <div class="col-md-4 data">
                        <input type="text" class="form-control" placeholder="地址" name="adress">
                    </div>

                    <div class="col-md-2 title">邮箱</div>
                    <div class="col-md-4 data">
                        <input type="email" class="form-control" placeholder="邮箱" name="email">
                    </div>

                    <div class="col-md-2 title">状态</div>
                    <div class="col-md-4 data">
                        <input type="text" class="form-control" placeholder="状态" name="stateStr">
                    </div>
                </div>
            </div>
                <!--工具栏-->
                <div class="box-tools text-center">
                    <button type="submit" class="btn bg-maroon">保存</button>
                    <button type="button" class="btn bg-default" onclick="history.back(-1);">返回</button>
                </div>
                <!--工具栏/-->
            </form>
        </section>
        <!-- 正文区域 /-->
        <!-- 正文区域 /-->

    <!-- 内容头部 /-->

    </div>
    <jsp:include page="${pageContext.request.contextPath}/pages/headel/tail.jsp" flush="true"></jsp:include>
    <jsp:include page="${pageContext.request.contextPath}/pages/headel/datatail.jsp" flush="true"></jsp:include>
    <%--<%@include file="../headel/datatail.jsp"%>--%>
    <%--<%@include file="tail.jsp"%>--%>
</body>

</html>