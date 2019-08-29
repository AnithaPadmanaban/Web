<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

</head>
<body>
<h2>Welcome to Registration Page</h2>
<%
String message = request.getParameter("message");
if (message != null){
    out.println(message);
}
%>
<form action="RegisterServlet">
Name: <input type="text" name="name" required /> <br/>
Email:<input type="text" name="email" required/>
</br>
Password:<input type="text" name="password" required/>
</br>
<button type="submit">Submit</button>
</form>
</body>
</html>