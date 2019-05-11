package pl.itacademy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.itacademy.dao.StudentDao;
import pl.itacademy.dao.StudentJdbcDao;
import pl.itacademy.model.Student;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.LongStream;

@Component
public class StudentService {

    @Autowired
    private StudentDao studentDao;


    public void addStudent(Student student) {
        try {
            studentDao.addStudent(student);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Student getByEmail(String email) {
        try {
            return studentDao.getStudentByEmail(email);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Student> getAllStudents() {
        try {
            return studentDao.getAllStudents();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
