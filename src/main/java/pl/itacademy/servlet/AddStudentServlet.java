package pl.itacademy.servlet;

import org.springframework.beans.factory.annotation.Autowired;
import pl.itacademy.model.Student;
import pl.itacademy.service.StudentService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/addStudent")
public class AddStudentServlet extends HttpServlet {
    private StudentService studentService;

    @Autowired
    public AddStudentServlet(StudentService studentService) {
        this.studentService = studentService;
    };
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        studentService.addStudent(new Student(name, surname, email, password));
        out.println("<html><body><p>Student had been added successfully</></br>");
        out.println("name: " + name + " surname " + surname + " index no " + email);
        out.println("</body></html>");
        out.close();
    }
}
