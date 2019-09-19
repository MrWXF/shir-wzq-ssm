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

<div class="wrapper">

    <!-- 页面头部 -->
    <jsp:include page="${pageContext.request.contextPath}/pages/headel/header.jsp" flush="true" ></jsp:include>
    <%--<c:import url="header.jsp"></c:import>--%>
    <%--<%@include file="header.jsp"%>--%>
    <!-- 页面头部 /-->

    <!-- 导航侧栏 -->
    <jsp:include page="${pageContext.request.contextPath}/pages/headel/pagelift.jsp" flush="true"></jsp:include>
    <%--<c:import url="pagelift.jsp"></c:import>--%>
    <%--<%@include file="pagelift.jsp"%>--%>
    <!-- 导航侧栏 /-->

    <!-- 内容区域 -->
    <!-- @@master = admin-layout.html-->
    <!-- @@block = content -->
    <iframe src="${pageContext.request.contextPath}/staff/findAll.do" width="100%" height="760px" ></iframe>
    <!-- @@close -->
    <!-- 内容区域 /-->

    <!-- 底部导航 -->


    <jsp:include page="${pageContext.request.contextPath}/pages/headel/footer.jsp" flush="true"></jsp:include>
    <%--<%@include file="footer.jsp"%>--%>
    <!-- 底部导航 /-->

</div>

<%--<%@include file="../headel/tail.jsp"%>--%>
<%--<jsp:include page="${pageContext.request.contextPath}/pages/headel/tail.jsp" flush="true" ></jsp:include>--%>
<%--<%@include file="tail.jsp"%>--%>
</body>
</html>