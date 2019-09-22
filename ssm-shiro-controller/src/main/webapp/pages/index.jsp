<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>WZQ</title>
</head>
<body>
<h1>数据信息</h1>

<>
<form action="#" method="get">
    <table border="1">
    <c:forEach var="comm" items="${comms}">
        <tr>
        <td>${comm.id}</td>
        <td>${comm.purchtimeStr}</td>
        <td>${comm.tradename}</td>
        <td>${comm.cate}</td>
        <td>${comm.supplierid}</td>
        <td>${comm.price}</td>
    </tr>
    </c:forEach>
    </table>
</form>
</body>
</html>
