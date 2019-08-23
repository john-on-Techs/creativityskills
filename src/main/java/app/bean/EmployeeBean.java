package app.bean;

import app.db.FactoryConnection;
import app.models.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class EmployeeBean {
    public List<Employee> getAllEmployees(){
        ;
        FactoryConnection factoryConnection = new FactoryConnection();
        Session session =factoryConnection.getSessionFactory().openSession();
        String str = "from Employee emp";
        Query  query = session.createQuery(str);
        return query.list();
    }
}
