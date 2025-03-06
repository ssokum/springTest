<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctp" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>test09Ok.jsp</title>
    <jsp:include page="/WEB-INF/views/include/bs5.jsp" />
</head>
<body>
    <p><br/></p>
    <div class="container">
    	<h2>이곳은 test09Ok.jsp입니다.</h2>
		<hr>
		<div>
			성명 : ${vo.name}<br/>
			아이디 : ${vo.mid}<br/>
			나이 : ${vo.age}<br/>
			성별 : ${vo.gender}<br/>
			주소 : ${vo.address}<br/>
			직업 : ${vo.job}<br/>
		</div>
		<hr>
		<div><a href="${ctp}/" class="btn btn-warning">돌아가기</a></div>
	</div>
	<p><br/></p>
</body>
</html>