package app.db;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConnection {
    private SessionFactory sessionFactory =null ;
    public SessionFactory getSessionFactory(){

        if(this.sessionFactory==null){
            Configuration conf = new Configuration();
            conf.configure();
            this.sessionFactory = conf.buildSessionFactory();
        }
        return this.sessionFactory;
    }
}
