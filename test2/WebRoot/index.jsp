<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
    <center>
    <h1>Struts2文件上传</h1>
    <form action="upload.action" method="post" enctype="multipart/form-data">
    	<table>
    		<tr>
    			<td>用户名</td>
    			<td><input type="text" name="username"></td>
    		</tr>
    		<tr>
    			<td>上传文件:</td>
    			<td><input type="file" name="myUpload"></td>
    		</tr>
    		<tr>
    			<td><input type="submit" value="上传"></td>
    			<td><input type="reset" value="重置"></td>
    		</tr>
   	 	</table>
    </form>
    </center>
  </body>
</html>
