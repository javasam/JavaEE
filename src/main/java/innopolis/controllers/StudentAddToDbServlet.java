package innopolis.controllers;

import innopolis.pojo.Student;
import innopolis.repository.dao.StudentDao;
import innopolis.repository.dao.StudentDaoImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StudentAddToDbServlet extends HttpServlet {
    private int id;
    private String name;
    private String familyName;
    private int age;
    private String contact;
    String city;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/index.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        name = req.getParameter("name");
        familyName = req.getParameter("familyName");
        age = Integer.parseInt(req.getParameter("age"));
        contact = req.getParameter("contact");
        city = req.getParameter("city");

        StudentDao studentDao = new StudentDaoImpl();
        studentDao.addStudent(new Student(name, familyName, age, contact, studentDao.getCityIdByName(city)));
        req.setAttribute("familyName", familyName);
        req.setAttribute("name", name);
        doGet(req, resp);
    }
}
