<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctp" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>test08.jsp</title>
    <jsp:include page="/WEB-INF/views/include/bs5.jsp" />
</head>
<body>
    <p><br/></p>
    <div class="container">
    	<h2>이곳은 test08.jsp입니다.</h2>
		<hr>
		<div>
			<%-- <a href="${ctp}/0306/test08Ok?name=홍길동&age=25" class="btn btn-success">회원가입</a> --%>
			<%-- <a href="${ctp}/0306/test08Ok/홍길동/25" class="btn btn-success">회원가입</a> --%>
			<%-- <a href="${ctp}/0306/test08Ok/홍길동@@@@@@@@@@@@25" class="btn btn-success">회원가입</a> --%>
			<%-- <a href="${ctp}/0306/test08Ok/홍길동seoul25" class="btn btn-success">회원가입</a> --%>
			<a href="${ctp}/0306/홍길동/test08Ok/25" class="btn btn-success">회원가입</a>
		</div>
		<hr>
		<div><a href="${ctp}/" class="btn btn-warning">돌아가기</a></div>
	</div>
	<p><br/></p>
</body>
</html>