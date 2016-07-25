package ${groupId}.utils;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibConfig {

    private static SessionFactory sessionFactory;

    public static void init() {
        sessionFactory = new Configuration()
                .configure() // configures settings from hibernate.cfg.xml
                .buildSessionFactory();
    }

    public static Session getSession() {
        if(sessionFactory == null) {
            init();
        }
        return sessionFactory.openSession();
    }
}
