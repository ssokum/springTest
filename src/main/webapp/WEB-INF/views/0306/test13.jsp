<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctp" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>test13.jsp</title>
	<jsp:include page="/WEB-INF/views/include/bs5.jsp" />
	<script>
		'use strict';
		
		if(${!empty message}) alert("${message}")
	</script>
</head>
<body>
	<p>
		<br />
	</p>
	<div class="container">
		<h2>이곳은 test13.jsp 입니다.</h2>
		<div>정회원은 사원의 첫글자가 'i/c/s'로 시작해야만 한다.</div>
		<hr>
		<form method="post">
			<div class="input-group mb-3">
				<div class="input-group-text">사번</div>
				<input type="text" name="sabun" class="form-control" required />
			</div>
			<div class="input-group mb-3">
				<div class="input-group-text">성명</div>
				<input type="text" name="name" class="form-control" required />
			</div>
			<div>
				<input type="submit" value="회원가입하기" class="btn btn-success form-control mb-2" />
				<input type="submit" value="돌아가기" onclick="location.href='${ctp}/';" class="btn btn-warning form-control " />
			</div>
		</form>
		<hr>
		<div>
			<c:if test="${!empty vo}">
				<div>부서명 : ${vo.busea }</div>
				<div>사 번 : ${vo.sabun }</div>
				<div>성 명 : ${vo.name }</div>
			</c:if>
		</div>
	</div>
	<p>
		<br />
	</p>
</body>
</html>