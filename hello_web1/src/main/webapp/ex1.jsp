<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>For Loop Example</title>
</head>
<body>
  <h1>For Loop Example</h1>
  <ul>
    <% for (int i = 1; i <= 5; i++) { %>
      <li>Item <%= i %></li>
    <% } %>
  </ul>
</body>
</html>