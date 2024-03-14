<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<center>
<table  border="1">  
<h2 style="color:rgb(6, 123, 68)"> Your Balance </h2>
  
       <tr><th>Account Number:</th> <td>${balance.account_number}</td></tr> 
      <tr> <th>Your Total Balance is</th><td>${balance.amount}</td></tr>
      <button onclick="window.print()">Print Statement</button>

    </table>