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
    		<td><s:textfield label="用户名" name="adminName"></s:textfield></td><!-- textfield自带fielderror的属性 -->
    		<!--<td><s:fielderror fieldName="adminName"></s:fielderror></td>-->
    	</tr>
    	<tr>
    		<td><s:password label="密码" name="adminPwd"></s:password></td>
    		<!--<td><s:fielderror fieldName="adminPwd"></s:fielderror></td>-->
    	</tr>
    	<tr>
    		<td><s:password label="再次输入密码" name="readminPwd"></s:password></td>
    	</tr>
    	<tr>
    		<td><s:textfield label="邀请码" name="key"></s:textfield></td>
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
