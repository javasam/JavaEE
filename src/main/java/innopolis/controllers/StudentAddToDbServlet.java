package innopolis.controllers;

import innopolis.pojo.Student;
import innopolis.repository.dao.StudentDao;
import innopolis.repository.dao.StudentDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentAddToDbServlet extends HttpServlet {
    int id;
    String name;
    String familyName;
    int age;
    String contact;
    int city;

    private static Logger LOGGER = Logger.getLogger(StudentAddToDbServlet.class.getName());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        id = Integer.parseInt(req.getParameter("id"));
        name = req.getParameter("name");
        familyName = req.getParameter("familyName");
        age = Integer.parseInt(req.getParameter("age"));
        contact = req.getParameter("contact");
        city = Integer.parseInt(req.getParameter("city"));
        Student student = new Student(id, name, familyName,age, contact, city);
        StudentDao studentDao = new StudentDaoImpl();
        studentDao.addStudent(student);
        LOGGER.log(Level.INFO, student.getFamilyName() + " added to DB");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
