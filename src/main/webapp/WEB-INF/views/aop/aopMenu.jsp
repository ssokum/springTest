<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctp" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>aopMenu.jsp</title>
    <jsp:include page="/WEB-INF/views/include/bs5.jsp" />
    <script>
    	'use scrict';
    	
    	function calc(){
    		let su = prompt("수를 입력하세요.");
    		location.href = "${ctp}/aop/aopTest2?su="+su;
    		
    	}
    </script>
</head>
<body>
    <p><br/></p>
    <div class="container">
		<h2>AOP 연습</h2>
		<div>Aspect Oriented Programming(관점 지향 프로그래밍)</div>
		<div>어떤 로직을 기준으로 핵심적인 관점, 부가적인 관점으로 나누어서 그 기준으로 각각을 모듈화하여 분석</div>
		<hr>
		<div>
			<a href="${ctp}/aop/aopTest1" class="btn btn-success">연습1</a>
			<a href="javascript:calc()" class="btn btn-secondary">1~?합</a>
			<a href="${ctp}/aop/aopTest3" class="btn btn-info">1~100까지 짝수합</a>
			<a href="${ctp}/aop/aopTest4" class="btn btn-warning">1~100까지 짝수합(while)</a>
		</div>
		<hr>
		<div>
			<a href="${ctp}/" class="btn btn-warning">돌아가기</a>
		</div>
	</div>
	<p><br/></p>
</body>
</html>