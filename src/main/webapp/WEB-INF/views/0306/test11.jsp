<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctp" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test11.jsp</title>
<jsp:include page="/WEB-INF/views/include/bs5.jsp" />
</head>
<body>
	<p>
		<br />
	</p>
	<div class="container">
		<h2>이곳은 test11.jsp 입니다.</h2>
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
				<input type="submit" value="회원가입하기"
					class="btn btn-success form-control" />
			</div>
		</form>
	</div>
	<p>
		<br />
	</p>
</body>
</html>