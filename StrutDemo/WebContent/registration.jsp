<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags" prefix="s"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
       
<!DOCTYPE html>
<html>

<head>
<link href=”bootstrap/css/bootstrap.min.css” rel=”stylesheet” type=”text/css” />
<script type=”text/javascript” src=”bootstrap/js/bootstrap.min.js”></script>
</head>

<sx:head/>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<body>

<div>
<button type="button" class="btn btn-info">Info</button>
</div>

<s:form action="go" method="post" enctype="multipart/form-data">

<font color="red" style="font-style: italic; font-weight: bold;"><s:actionerror/></font>


<s:textfield name="username" label="Username" required="true"></s:textfield>


<s:password name="password" label="Password" required="true"></s:password>

<s:password name="confirmpassword" label="Confirm Password" required="true"></s:password>

<s:radio label = "Gender" name = "gender" list="{'male','female'}" required="true" />


 <s:checkboxlist label = "Hobbies" name = "hobbies"
  list = "{'swimming','dancing','cooking','reading','others'}" required="true" />


<s:textfield name="age" label="Age" required="true"></s:textfield> 


 <sx:datetimepicker name="dob" label="Date of Birth" 
displayFormat="dd-MM-yyyy " required="true" />

<s:textfield name="mobileno" label="MobileNo" required="true"></s:textfield>

<s:textfield name="email" label="Email" required="true"></s:textfield>

<s:textfield name="percentage" label="Percentage" required="true"></s:textfield>

<s:doubleselect list="{'Developer','Manager','Tester'}" name="role" label="Occupation"
doubleList="top == 'Developer' ? {'Java','PHP'} : (top == 'Manager' ? {'HR Manager', 'Finance Manager'} : {'UI Testing', 'Functional Testing'})" 
doubleName="expertise" required="true"></s:doubleselect>         
           

<s:select list="{'Java','PHP','Python','.Net'}" name="skills" multiple="true" label="Skills" required="true"></s:select>

<s:textarea name="aboutyourself" label="About Yourself" required="true"></s:textarea>

 <s:file name="userImage" label="Image" />  

<s:file name="fileUpload" label="Select a File to upload" size="30" />

<s:submit value="Login"></s:submit>

</s:form>

</body>
</html>