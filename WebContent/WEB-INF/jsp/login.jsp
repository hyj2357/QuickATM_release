﻿<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>登录</title>
  <!-- <meta name="viewport" content="width=device-width, initial-scale=1.0"> -->
  <link href="pages/css/top_style.css" rel="stylesheet">
  <link href="pages/css/bootstrap.min.css" rel="stylesheet">
  <link href="pages/css/login_style.css" rel="stylesheet">  
  <script src="pages/js/jquery-2.1.4.min.js"></script>
</head>

<body>
  <script type="text/javascript">
     function changeButtonStatusMouseOver(){
         $(".topButton").css("color","#FFFFFF");
         $(".topButton").css("background-color","#FF9900");
	 }
     function changeButtonStatusMouseOut(){
		 $(".topButton").css("color","#FF9900");
         $(".topButton").css("background-color","");
	 }
    function submit_changeButtonStatusMouseOver(){
         $(".submitButton").css("color","#FFFFFF");
         $(".submitButton").css("background-color","#FF9900");
	 }
     function submit_changeButtonStatusMouseOut(){
		 $(".submitButton").css("color","#FF9900");
         $(".submitButton").css("background-color","");
	 }

  </script>
  <div class="floatInfo">
  </div>
  <div class="top" style="background:url('pages/image/20151214.jpg') center no-repeat;background-size:100% 100%;">
   <div class="blackPurdah" style="height:15%;position:fixed;">
   </div>
   <%
       String e = (String)session.getAttribute("errMsg");
       if(e!=null){
    	   out.print(   
    	    "<div class=\"blackPurdah\" style=\"height:10%;position:fixed;top:16%;\">"
    	   +"<span style=\"font-family:微软雅黑;font-size:36px;color:#FF9900;padding-left:40%\">"
    	   +"<strong>"+e+"</strong>"
    	   +"<span>"
           +"</div>");
    	   session.removeAttribute("errMsg");
       }
    %>
   <div style="z-index:4;position:fixed;top:3.5%;width:100%;">
      <a href="http://139.129.24.81:8082/QuickATM/pfs?pagePath=top.jsp">
         <img style="cursor:pointer;position:relative;top:5%;" src="pages/image/prev.png"/>
	  </a>
	  <a href="http://139.129.24.81:8082/QuickATM/pfs?pagePath=top.jsp">
	     <label style="cursor:pointer;color:rgba(255,255,255,0.6);font-family:微软雅黑;font-size:28px;margin-top:5px">返回主页</label>
	  </a>
	  <div style="cursor:pointer;top: 5px;position: fixed;right: 10%;">
	     <label style="color: #FF9900;font-family: 微软雅黑;font-size: 36px;margin-left: 1000px;margin-top: 15px;">
	        <strong>Q&A</strong>
	     </label>
	  </div>
   </div>
   <div class="name" style="top: 20%;left: 48%;">
	   <strong>Login</strong>
   </div>
	
  <div style="left: 50%;position: absolute;top: 50%;top:40%;">
    <form action="http://139.129.24.81:8082/QuickATM/Login" method="post">
	  <div class="inputGroup">
	     <label>	  
	        <span class="inputLabel">
	           <strong>卡号</strong>	  
	        </span>
	     </label>&nbsp;&nbsp;&nbsp;
         <input name="account" class="inputTxt" style="border:none" type="text" placeholder="请输入卡号"/><br/><br/><br/>
	  </div>
	  <div class="inputGroup">
	     <label>	  
	        <span class="inputLabel">
	           <strong>密码</strong>	  
	        </span>
	     </label>&nbsp;&nbsp;&nbsp;
         <input name="password" class="inputTxt" style="border:none" type="password" placeholder="请输入密码"/><br/><br/><br/>
	  </div>
	  <div style="margin-left: -10%;">
	     <input class="submitButton" type="submit" value="确定" onmouseout="submit_changeButtonStatusMouseOut()" onmousemove="submit_changeButtonStatusMouseOver()">
	  </div>
	</form>
  </div>
  <br/><br/>
  </div>
  <!--
  <div class="intro3">
     <label class="introText">
	   <strong>���֧������</strong>
	 </label>
  </div>
  <div class="intro1">
     <label class="introText" style="left:10%;">
	    <strong>��ȫ֧������</strong>
	 </label>
  </div>
  <div class="intro2">
     <label class="introText">
	    <strong>����֧������</strong>
	 </label>
  </div>
  -->
    <div class="pageInfo">
     <div class="introText" style="position:relative;left:50%;top:30%">
	  	<a href="http://www.baidu.com">
		    <strong>联系我们</strong>
		</a>
	 </div>
     <div class="introText" style="position: relative;
left:42%;">
	  	<strong>备案信息:XXXXXXXXXXXXX</strong>  
	 </div>
  </div>
</body>

</html>
