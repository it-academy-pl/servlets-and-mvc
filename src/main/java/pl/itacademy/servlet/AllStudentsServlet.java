package pl.itacademy.servlet;

import pl.itacademy.model.Student;
import pl.itacademy.service.StudentService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

@WebServlet("/allStudents")
public class AllStudentsServlet extends HttpServlet {

    StudentService studentService = new StudentService();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        List<Student> students = null;

        students = studentService.getAllStudents();

        out.println("<html><body><h1>List of students</h1><ul>");
        for (Student student : students) {
            out.println("<li>" + student.getName() + " " + student.getSurname() + "</li>");
        }
        out.println("</ul>");
        out.println("<p>The time is : " + new Date() + "</p>");
        out.println("</body></html>");
        out.close();
    }

}
