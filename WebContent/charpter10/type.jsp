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

	<s:form action="typeconversion">
		<s:textfield label="产品一 " name="products" />
		<s:textfield label="产品二" name="products" />
		<s:textfield label="产品三" name="products" />

		<s:textfield label="数字一" name="numbers" />
		<s:textfield label="数字二" name="numbers" />
		<s:textfield label="数字三" name="numbers" />

		<s:textfield label="集合一" name="collections" />
		<s:textfield label="集合二" name="collections" />
		<s:textfield label="集合三" name="collections" />
		<s:textfield label="name" name="name"/>
		<s:submit>提交</s:submit>
	</s:form>
</body>
</html>