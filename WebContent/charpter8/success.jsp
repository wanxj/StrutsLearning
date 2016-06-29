<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<body>本站的访问次数：${applicationScope.counter} 用户名：
	${sessionScope.username}
	${ requestScope.info }
	${sessionScope.counter2}
</body>
</html>