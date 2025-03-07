<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
    <p><br/></p>
    <div class="container">
		<h2>XML파일 연습</h2>
		<hr>
		<div>
			<a href="${ctp }/0307/test2" class="btn btn-success">주입된 성적 보기</a>
			<a href="${ctp }/0307/test3"  class="btn btn-primary">성적 계산</a>
			<a href="${ctp }/0307/test4"  class="btn btn-secondary">JDBC 정보 보기</a>
			<a href="${ctp }/0307/test5"  class="btn btn-info">비만도 구하기</a>
		</div>
		<hr>
		<div><a href="${ctp}/"  class="btn btn-warning">돌아가기</a></div>
	</div>
	<p><br/></p>
</body>
</html>