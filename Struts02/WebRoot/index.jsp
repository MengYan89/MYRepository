<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
    
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
  <h1>欢迎来到SSH 
  	<c:if test="${uname!=null }">
  		<p><c:out value="${uname }"></c:out></p>
  	</c:if>
  	<c:if test="${uname==null }">
  		<p>请登录</p>
  	</c:if>
  
  </h1><br>
  	<table>
  		<tr>
  			<c:if test="${uname==null }">
  			<td><button onclick="location.href='login.jsp'">登陆</button></td>
  			<td><button onclick="location.href='register.jsp'">注册</button></td>
  			</c:if>
  			<c:if test="${uname!=null }">
  			<td><button onclick="location.href='LogoutAction_.action'">注销</button></td>
  			</c:if>
  			<td><button onclick="location.href='EditAction.action'">修改</button></td>
  		</tr>
  	</table>
  </body>
</html>
