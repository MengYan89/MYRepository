<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!-- 连接jstl标签 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'query.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <table>
  		<tr>
  			<td>昵称</td>
  			<td>性别</td>
  			<td>年龄</td>
  			<td>邮箱</td>
  			<td>手机</td>
  			<td>地址</td>
  		</tr>
    <c:forEach var="list" items="${Ulist }">
    	<tr>
    		<td>${list.nickName }</td>
    		<td>${list.sex }</td>
    		<td>${list.age }</td>
    		<td>${list.email }</td>
    		<td>${list.phone }</td>
    		<td>${list.address }</td>
    	</tr>
    	
    </c:forEach>
    <tr>
    	<td><button onclick="location.href='index.jsp'">返回主页</button></td>
    </tr>
   </table>
   
  </body>
</html>
