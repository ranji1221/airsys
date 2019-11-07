<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<link rel="stylesheet" href="/airsys/assets/css/main.css">
<title>列出账号</title>
</head>
<body>
	<h3 align="center">账号信息</h3>
	<hr color="red">
	<center>
		<table border="1">
			<tr>
				<th>ID</th>
				<th>姓名</th>
				<th>余额</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${acts}" var="act">
				<tr>
					<td>${act.id}</td>
					<td>${act.name}</td>
					<td>${act.balance}</td>
					<td>
						<a href="user/${act.id}">查看</a>
						<a href="#" onclick="updateUser(${act.id})">修改</a>
						<a href="#" onclick="deleteUser(${act.id})">删除</a>
					</td>
				</tr>
			</c:forEach>
		</table>	
	</center>
	<script type="text/javascript" src="/airsys/assets/js/user.js"></script>
</body>
</html>

<!-- 
	报错：404 找不到user.js
	     404 找不到main.css
	为什么？
	    Spring MVC不是("好东西")，它的原因造成这样结局。 
	    DispacherServlet拦截   "/"
	        让Spring MVC中的核心的Servlet不要拦截形如.js .css .jpg...
	怎么做呢？
                修改配置AppConfig类  	
    Git : 如何利用Git开发项目，管理项目
    	 Linux：[centos ubuntu/赛门铁克 solaries redhat 麒麟Linux]
    	 类Unix  
                  花2周写这么个软件  版本控制软件，不过监控文本文件（word image video二进制文件）
                 源代码 xxx.java  xxx.html  xxx.css xx.xml  xxx.php  xxx.py  xxx.c  xxx.cc
              xxx.js  
        Git : 世界上最大的同性网站（全是男人）--- GitHub (项目源码 JQuery Spring Vue BootStrap)
        
     例如：airsys (4~5人)
         .gitignore : 告诉Git用于配置你要忽略的文件或文件夹
         .git
         .classpath 
         .setting
         target                       	
    	 src
    	 pom.xml
    	 ReadMe.md : 介绍这个项目
-->