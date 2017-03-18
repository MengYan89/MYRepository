<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!-- 链接Struts2标签库 -->
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'register.jsp' starting page</title>
    
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
    <s:form action="RegisterAction.action" method="post">
    <table>
    	<tr>
    		<h1>会员注册</h1>
    	</tr>
    	<tr>
    		<td>请输入用户名:<s:textfield name="adminName"></s:textfield></td>
    	</tr>
    	<tr>
    		<td>请输入密码:<s:password name="adminPwd"></s:password></td>
    	</tr>
    	<s:token></s:token>
    	<tr>
    		<td><s:submit value="注册"></s:submit></td>
    		<td><input type="button" onclick="location.href='index.jsp'" value="返回首页"></td>
    	</tr>
    </table>
    </s:form>
  </body>
</html>
