<html>
<body>
<h2>Welcome Login Page</h2>
<%
String message = request.getParameter("message");
if (message != null){
    out.println(message);
}
%>
<form action="LoginServlet">
Email:<input type="text" name="email" required/>
</br>
Password:<input type="text" name="password" required/>
</br>
<button type="submit">Submit</button>
</form>
</body>
</html>
