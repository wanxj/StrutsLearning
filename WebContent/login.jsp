<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
	function regist() {
		
		targetForm = document.form[0];
		targetForm.action = "login!register";
		targetForm.submit();
	}

</script>
</head>
<body>
	<s:form >
		<s:textfield label="用户" name="username"/>
		<s:textfield label="密码" name="password"/>
		<s:submit value="登录"/>
		<!--<s:submit value="注册" action="login!register.action"></s:submit>-->
	</s:form>
		<a href="login!register">注册</a>
</body>
</html>