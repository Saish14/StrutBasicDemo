<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags" prefix="s"%>
    
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: yellow;">
 
<div style="align-items: center;">

<h2 style="background-color: red">Personal Details</h2>

NAME: <s:property value="username" /><br>
PASSWORD: <s:property value="password" /><br>
GENDER: <s:property value="gender" /><br>
AGE: <s:property value="age" /><br>
MOBILE-NO: <s:property value="mobileno" /><br>
EMAIL: <s:property value="email" /><br>
OCCUPATION: <s:property value="role" /><br>
PROFILE: <s:property value="expertise" /><br>
SKILLS: <s:property value="skills" /><br>
ABOUT YOURSELF: <s:property value="aboutyourself" /><br>

  
User Image: <s:property value="userImage" /><br/>  
Content Type:<s:property value="userImageContentType" /><br/>  
File Name:  <s:property value="userImageFileName" /><br/>  
Uploaded Image: <img src="userimages/<s:property value="userImageFileName"/>"   
                         width="150" height="150" />  



</div>


<a href="message.html">Click Here</a>

<%-- <s:if test= "hasActionMessages()">
<s:actionmessage/>
</s:if>

<h2><font color="green" style="font-family: cursive; font-weight: bolder;">

Hello 
<s:property value="username"/> --%>
</font>
</h2>
</body>
</html>