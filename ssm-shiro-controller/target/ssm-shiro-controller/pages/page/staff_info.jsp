<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<!DOCTYPE html>
<html>
<head>
    <!-- 页面meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title></title>
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
            职工信息
        </h1>
        </section>
    <!-- 内容头部 /-->
        <!-- 正文区域 -->
        <section class="content">

            <!-- .box-body -->
            <div class="box box-primary">

                <div class="box-body">

                    <!-- 数据表格 -->
                    <div class="table-box">

                        <!--工具栏-->
                        <div class="pull-left">
                            <div class="form-group form-inline">
                                <div class="btn-group">
                                    <button type="button" class="btn btn-default" title="新建">
                                        <i class="fa fa-file-o"></i> <a href="${pageContext.request.contextPath}/pages/page/add-comm.jsp">新建</a></button>
                                    <button type="button" class="btn btn-default" title="删除">
                                        <i class="fa fa-trash-o"></i> <a href="${pageContext.request.contextPath}/comm/deleteComm.do">删除</button>
                                    <button type="button" class="btn btn-default" title="刷新">
                                        <i class="fa fa-refresh"></i> <a href="${pageContext.request.contextPath}/comm/updateComm.do">刷新</a></button>
                                </div>
                            </div>
                        </div>
                        <div class="box-tools pull-right">
                            <div class="has-feedback">
                                <input type="text" class="form-control input-sm" placeholder="搜索">
                                <span class="glyphicon glyphicon-search form-control-feedback"></span>
                            </div>
                        </div>
                        <!--工具栏/-->

                        <!--数据列表-->
                        <table id="dataList" class="table table-bordered table-striped table-hover dataTable">
                            <thead>
                            <tr>
                                <th class="" style="padding-right:0px;">
                                    <input id="selall" type="checkbox" class="icheckbox_square-blue">
                                </th>
                                <th class="sorting_asc">ID</th>
                                <th class="text-center">职工名称</th>
                                <th class="text-center">职工职称</th>
                                <th class="text-center">电话</th>
                                <th class="text-center">地址</th>
                                <th class="text-center ">邮箱</th>
                                <th class="text-center ">状态</th>
                                <th class="text-center">操作</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach var="staff" items="${staffs}">
                            <tr>
                                <td><input name="ids" type="checkbox"></td>
                                <td>${staff.id}</td>
                                <td>${staff.name}
                                </td>
                                <td>${staff.title}</td>
                                <td>${staff.phone}</td>
                                <td>${staff.adress}</td>
                                <td>${staff.email}</td>
                                <td class="text-center">${staff.stateStr}</td>
                                <td class="text-center">
                                    <button type="button" class="btn bg-olive btn-xs">详情</button>
                                    <button type="button" class="btn bg-olive btn-xs">编辑</button>
                                </td>
                            </tr>
                            </c:forEach>
                            </tbody>

                        </table>
                        <!--数据列表/-->
                    </div>
                    <!-- 数据表格 /-->


                </div>
                <!-- /.box-body -->

                <!-- .box-footer-->
                <div class="box-footer">
                    <div class="pull-left">
                        <div class="form-group form-inline">
                            总共2 页，共14 条数据。 每页
                            <select class="form-control">
                                <option>1</option>
                                <option>2</option>
                                <option>3</option>
                                <option>4</option>
                                <option>5</option>
                            </select> 条
                        </div>
                    </div>

                    <div class="box-tools pull-right">
                        <ul class="pagination">
                            <li>
                                <a href="#" aria-label="Previous">首页</a>
                            </li>
                            <li><a href="#">上一页</a></li>
                            <li><a href="#">1</a></li>
                            <li><a href="#">2</a></li>
                            <li><a href="#">3</a></li>
                            <li><a href="#">4</a></li>
                            <li><a href="#">5</a></li>
                            <li><a href="#">下一页</a></li>
                            <li>
                                <a href="#" aria-label="Next">尾页</a>
                            </li>
                        </ul>
                    </div>

                </div>
                <!-- /.box-footer-->



            </div>

        </section>
        <!-- 正文区域 /-->
    </div>
<%--<jsp:include page="tail.jsp" flush="true">--%>
<%--<%@include file="tail.jsp"%>--%>
</body>

</html>