package pl.itacademy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.itacademy.dao.StudentInMemoryDao;
import pl.itacademy.dao.StudentJdbcDao;
import pl.itacademy.model.Student;
import pl.itacademy.service.StudentService;

import java.util.List;

@Controller
public class AllStudentsSpringMvc {

    private StudentService studentService;

    public AllStudentsSpringMvc(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(path="/allStudentsMvc", method = RequestMethod.GET)
    public ModelAndView allStudents() {
        List<Student> students = studentService.getAllStudents();
        return new ModelAndView("/allStudents.jsp", "students", students);
    }

}
