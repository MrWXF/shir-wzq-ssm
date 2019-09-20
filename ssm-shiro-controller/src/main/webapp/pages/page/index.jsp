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
            商品列表
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
                                <th class="text-center">物品名称</th>
                                <th class="text-center">类别</th>
                                <th class="text-center">供货商号</th>
                                <th class="text-center">进货日期</th>
                                <th class="text-center ">价格</th>
                                <th class="text-center">操作</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach var="comm" items="${infos.list}">
                            <tr>
                                <td><input name="ids" type="checkbox"></td>
                                <td>${comm.id}</td>
                                <td>${comm.tradename}
                                </td>
                                <td>${comm.cate}</td>
                                <td>${comm.supplierid}</td>
                                <td>${comm.purchtimeStr}</td>
                                <td class="text-center">${comm.price}</td>
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
                            总共${infos.pages} 页，共${infos.total}条数据。 每页
                            <select class="form-control">
                                <c:forEach var="num" begin="1" end="6" step="1">
                                <option href="" name="size">${num}</option>
                                </c:forEach>
                            </select> 条
                        </div>
                    </div>

                    <div class="box-tools pull-right">
                        <ul class="pagination">
                            <li>
                                <a href="#" id="homePage" aria-label="Previous">首页</a>
                            </li>
                            <li><a href="#">上一页</a></li>
                               <li><a href="#">${infos.pageNum}</a></li>

                            <li><a href="#">下一页</a></li>
                            <li>
                                <a href="#" id="tailPage" aria-label="Next">尾页</a>
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