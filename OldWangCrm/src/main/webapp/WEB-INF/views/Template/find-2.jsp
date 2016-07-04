<%@ page language="java" import="java.sql.ResultSet"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="">
		房东:<input name="userName" type="text" size="20" /><br> 业务员:<input
			name="userName" type="text" size="20" /><br> 店铺:<input
			name="userName" type="text" size="20" /><br> 城区:<input
			name="userName" type="text" size="20" /><br> 小区:<input
			name="userName" type="text" size="20" /><br> 地址:<input
			name="userName" type="text" size="20" /><br> 楼层:<input
			name="userName" type="text" size="20" /><br> 户型:<input
			name="userName" type="text" size="20" /><br> 面积:<input
			name="userName" type="text" size="20" /><br> 装修类型:<select
			name="un">
			<option>未选择</option>
			<option>0未装修</option>
			<option>1普通装修</option>
			<option>2精装修</option>
			<option>3豪华装修</option>
		</select> 价格:<input name="userName" type="text" size="20" /><br> 设施:<input
			name="userName" type="text" size="20" /><br> 备注:<input
			name="userName" type="text" size="20" /><br> 状态:<select
			name="un">
			<option>未选择</option>
			<option>0没人有意租</option>
			<option>1有人有意租未租</option>
			<option>2已经出租</option>
		</select> 录入时间:<input name="userName" type="text" size="20" /><br>
	</form>
</body>
</html>