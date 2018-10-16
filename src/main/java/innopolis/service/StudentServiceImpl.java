package innopolis.service;

import innopolis.controllers.StudentAddToDbServlet;
import innopolis.pojo.Student;
import innopolis.repository.dao.StudentDao;
import innopolis.repository.dao.StudentDaoImpl;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public StudentServiceImpl() {
        studentDao = new StudentDaoImpl();
    }

    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    public void addStudentToDb(int id, String name, String familyName, int age, String contact, String city) {
        StudentDaoImpl studentDao = null;
        int cityInt = studentDao.getCityIdByName(city);
        studentDao.addStudent(new Student(name, familyName, age, contact, cityInt));

    }
}
