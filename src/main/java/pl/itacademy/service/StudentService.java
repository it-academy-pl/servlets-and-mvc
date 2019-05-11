package pl.itacademy.service;

import pl.itacademy.dao.StudentDao;
import pl.itacademy.dao.StudentJdbcDao;
import pl.itacademy.model.Student;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.LongStream;

public class StudentService {

    private StudentDao studentDao;

    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

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
