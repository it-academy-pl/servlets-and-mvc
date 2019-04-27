<%@ page import="pl.itacademy.model.Student" %>
<%@ page import="java.util.List" %>

<html>
<body>
<h1>List of students</h1>
<ul>

<% List<Student> students= (List)request.getAttribute("students");
 for (Student student : students) {
         out.println("<li>" + student.getName() + " " + student.getSurname() + "</li>");
     }
%>

<ul>
</body>
</html>