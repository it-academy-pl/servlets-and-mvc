<%@ page import="pl.itacademy.model.Student" %>
<%@ page import="pl.itacademy.service.StudentService" %>
<%@ page import="java.util.List" %>

<html>
<body>
<h1>List of students</h1>
<ul>
<%
StudentService studentService = new StudentService();
List<Student> students = null;
students = studentService.getAllStudents();
for (Student student : students) {
               out.println("<li>" + student.getName() + " " + student.getSurname() + "</li>");
           }
%>
<ul>
</body>
</html>