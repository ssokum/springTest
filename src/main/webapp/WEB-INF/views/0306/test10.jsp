<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctp" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>test10.jsp</title>
    <jsp:include page="/WEB-INF/views/include/bs5.jsp" />
</head>
<body>
    <p><br/></p>
    <div class="container">
		<h2>이곳은 test10.jsp 입니다.</h2>
		<hr>
		<div><a href="${ctp}/0306/test10Ok/i1234" class="btn btn-success btn-sm mb-2">홍길동(인사과)</a></div>
		<div><a href="${ctp}/0306/test10Ok/c2345" class="btn btn-primary btn-sm mb-2">김말숙(총무과)</a></div>
		<div><a href="${ctp}/0306/test10Ok/s3456" class="btn btn-info btn-sm mb-2">이기자(생산과)</a></div>
	</div>
	<p><br/></p>
</body>
</html>