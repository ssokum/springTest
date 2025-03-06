<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctp" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>.jsp</title>
<jsp:include page="/WEB-INF/views/include/bs5.jsp" />
</head>
<body>
	<p>
		<br />
	</p>
	<div class="container">
		<h2>이곳은 test3.jsp입니다.</h2>
		<hr>
		<div>서버에서 넘어온 값? ${message}</div>
		<hr>
		<div>
			<a href="${ctp}/" class="btn btn-warning">돌아가기</a>
		</div>
	</div>
	<p>
		<br />
	</p>
</body>
</html>