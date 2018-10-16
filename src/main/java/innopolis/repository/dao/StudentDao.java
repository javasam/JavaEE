package innopolis.repository.dao;


import innopolis.pojo.Student;

import java.util.List;

public interface StudentDao {
    public boolean addStudent(Student student);

    public Student getStudentById(int id);

    public boolean update(Student student);

    public boolean deleteStudentById(int id);

    public boolean deleteStudentByName(Student student);

    public int getCityIdByName(String name);

    List<Student> getAllStudents();
}
