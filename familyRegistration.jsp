<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Contact</title>
</head>
<body>
    <div align="center">
        <h1>New</h1>
        <form:form action="saveFamilyMember" method="post" modelAttribute="familyMember">
        <table>
       
            <tr>
                <td>Flat Owner Name:</td>
                <td><form:input path="ownerName" /></td>
            </tr>
            <tr>
                <td>Flat No:</td>
                <td><form:input path="flatNo" /></td>
            </tr>
            <tr>
                <td>Entry_Date:</td>
                <td><form:input type="datetime-local" path="entryDateTime" /></td>
            </tr>
            <tr>
                <td>Exit_Date:</td>
                <td><form:input type="datetime-local" path="exitDateTime"/></td>
            </tr>
  
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>