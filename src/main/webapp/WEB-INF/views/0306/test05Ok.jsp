<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctp" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>test05Ok.jsp</title>
    <jsp:include page="/WEB-INF/views/include/bs5.jsp" />
</head>
<body>
    <p><br/></p>
    <div class="container">
    	<h2>이곳은 test05Ok.jsp입니다.</h2>
		<hr>
		<div>
			성명 : ${name}<br/>
			나이 : ${age}<br/>
			성별 : ${gender}<br/>
			주소 : ${address}<br/>
		</div>
		<hr>
		<div><a href="${ctp}/" class="btn btn-warning">돌아가기</a></div>
	</div>
	<p><br/></p>
</body>
</html>