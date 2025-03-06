<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctp" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>test09.jsp</title>
    <jsp:include page="/WEB-INF/views/include/bs5.jsp" />
</head>
<body>
    <p><br/></p>
    <div class="container">
    	<h2>이곳은 test09.jsp입니다.</h2>
		<hr>
		<div>
			<form method="post">
				<div>성명 : <input type="text" name="name" value="홍길동" class="form-control mb-2" placeholder="성명을 입력하세요." autofocus required></div>
				<div>나이 : <input type="number" name="age" value="20" class="form-control mb-2" placeholder="나이를 입력하세요." min="1" required></div>
				<div class="mb-2">성별 : 
					<input type="radio" name="gender" value="여자" checked> 여자 &nbsp;
					<input type="radio" name="gender" value="남자" > 남자
				</div>
				<div>주소 : <input type="text" name="address" value="청주" class="form-control mb-2" placeholder="주소를 입력하세요." required></div>
				<div><button type="submit" class="btn btn-success form-control">전송</button></div>
			</form>
		</div>
		<hr>
		<div><a href="${ctp}/" class="btn btn-warning">돌아가기</a></div>
	</div>
	<p><br/></p>
</body>
</html>