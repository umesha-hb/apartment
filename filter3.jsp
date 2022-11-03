<%@page import="com.uttara.model.Sales"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Filter sales</title>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<body>
    <div align="center">
        <h1>Vistors List </h1>
<table>
  <tr>
    <th>visitor_Name</th>
    <th>flat_no</th>
    <th>entry_date_time</th>
    <th>exit_date_time</th>
        <th>visit_purpose</th>
    <th>escorted_by</th>
  </tr>
  <c:forEach items="${listVistorDetails}" var="temp">
  <tr>
    <td>${temp.visitorName}</td>
     <td>${temp.flatNo}</td>
     <td>${temp.entryDateTime}</td>
      <td>${temp.exitDateTime}</td>
       <td>${temp.visitPurpose}</td>
      <td>${temp.escortedBy}</td>
        </tr>
  </c:forEach>
</table>

  
    </div>
</body>
</html>