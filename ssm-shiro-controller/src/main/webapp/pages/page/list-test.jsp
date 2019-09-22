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
    <%@include file="../headel/header-test.jsp"%>
    <%--<c:import url="header.jsp"></c:import>--%>
    <%--<%@include file="header.jsp"%>--%>
    <!-- 页面头部 /-->

    <!-- 导航侧栏 -->
    <%@include file="../headel/pagelift-test.jsp"%>
    <%--<c:import url="pagelift.jsp"></c:import>--%>
    <%--<%@include file="pagelift.jsp"%>--%>
    <!-- 导航侧栏 /-->

    <!-- 内容区域 -->
    <!-- @@master = admin-layout.html-->
    <!-- @@block = content -->
    <%----%>
    <iframe id="iframeid" src="${pageContext.request.contextPath}/pages/page/titel.jsp" width="100%" height="760px" ></iframe>
    <!-- @@close -->
    <!-- 内容区域 /-->

    <!-- 底部导航 -->

    
    <%@include file="../headel/footer-test.jsp" %>
    <%--<%@include file="footer.jsp"%>--%>
    <!-- 底部导航 /-->

</div>
<%@include file="../headel/tail.jsp"%>

<script>
    $(document).ready(function () {

        var frame = document.getElementById("iframeid");
       $("#addcomm").click(function () {
           frame.src = "${pageContext.request.contextPath}/pages/page/add-comm.jsp";

       });
        $("#comm").click(function () {
            frame.src = "${pageContext.request.contextPath}/comm/selectCommAll.do?page=1&size=4";

        });
        $("#staff_info").click(function () {
            frame.src = "${pageContext.request.contextPath}/staff/findAll.do?page=1&size=4";

        });
        $("#addstaff").click(function () {
            frame.src = "${pageContext.request.contextPath}/pages/page/add-staff.jsp";

        });
        $("#warehouse").click(function () {
            frame.src = "${pageContext.request.contextPath}/pages/page/add-comm.jsp";

        });
        $("#addwarehouse").click(function () {
            frame.src = "${pageContext.request.contextPath}/pages/page/add-comm.jsp";

        });
        $("#titel").click(function () {
            frame.src = "${pageContext.request.contextPath}/pages/page/titel.jsp";

        });
    });
</script>

<%--<%@include file="../headel/tail.jsp"%>--%>
<%--<jsp:include page="${pageContext.request.contextPath}/pages/headel/tail.jsp" flush="true" ></jsp:include>--%>
<%--<%@include file="tail.jsp"%>--%>
</body>
</html>