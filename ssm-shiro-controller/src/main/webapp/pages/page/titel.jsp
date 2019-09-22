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
<body>
<div class="content-wrapper">

    <!-- 内容头部 -->
    <!-- 内容头部 /-->

    <!-- 正文区域 -->
    <section class="content">






        <div id="myCarousel" class="carousel slide">
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1"></li>
                <li data-target="#myCarousel" data-slide-to="2"></li>
            </ol>
            <!-- Carousel items -->
            <div class="carousel-inner">
                <div class="active item"><img src="${pageContext.request.contextPath}/img/comm1.jpg" alt="">
                    <div class="carousel-caption">
                        <h4>First Thumbnail label</h4>
                        <p></p>
                    </div></div>
                <div class="item"><div class="active item"><img src="${pageContext.request.contextPath}/img/comm2.jpg" alt="">
                    <div class="carousel-caption">
                        <h4>First Thumbnail label</h4>
                        <p></p>
                    </div></div></div>
                <div class="item"><div class="active item"><img src="${pageContext.request.contextPath}/img/comm3.jpg" alt="">
                    <div class="carousel-caption">
                        <h4>First Thumbnail label</h4>
                        <p></p>
                    </div></div></div>
            </div>
            <!-- Carousel nav -->
            <a class="carousel-control left" href="#myCarousel" data-slide="prev">&lsaquo;</a>
            <a class="carousel-control right" href="#myCarousel" data-slide="next">&rsaquo;</a>
        </div>
    </section>
    <!-- 正文区域 /-->

</div>
<script>
    $('.carousel').carousel()

</script>
</body>
</html>
