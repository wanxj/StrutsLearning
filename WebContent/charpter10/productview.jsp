<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	产品一
	<s:property value="product1.name"/>
	<s:property value="product1.price"/>
	<s:property value="product1.count"/>
	产品二
	<s:property value="product2.name"/>
	<s:property value="product2.price"/>
	<s:property value="product2.count"/>
</body>
</html>