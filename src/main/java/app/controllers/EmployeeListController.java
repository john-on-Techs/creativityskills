package app.controllers;

import app.bean.EmployeeBean;
import app.models.Employee;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class EmployeeListController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("**************************************************");
        System.out.println("Welcome to servlet ");
        EmployeeBean employeeBean = new EmployeeBean();
        List<Employee> employees = employeeBean.getAllEmployees();
        request.setAttribute("employees",employees);

        //obtain request dispatcher and send the same the same request
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/employee-list.jps");
        requestDispatcher.forward(request, response);
    }
}
