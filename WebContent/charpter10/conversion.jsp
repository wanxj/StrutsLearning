<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	产品
	<br>
	<s:property value="products[0]" />
	<s:property value="products[1]" />
	<s:property value="products[2]" />


	数字
	<br>
	<s:property value="numbers[0]" />
	<s:property value="numbers[1]" />
	<s:property value="numbers[2]" />

	集合
	<br>
	<s:property value="collections[0]" />
	<s:property value="collections[2]" />
	<s:property value="collections[2]" />
	
	<s:property value="name"/>
</body>
</html>