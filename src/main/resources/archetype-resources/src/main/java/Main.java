package ${groupId};

import ${groupId}.model.User;
import ${groupId}.utils.HibConfig;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class Main {
    public static void main(String[] args) {
        Session session = HibConfig.getSession();
        Transaction tx = session.beginTransaction();
        User user = new User();
        user.setEmail("test@com.com");
        user.setPassword("qwerty123");
        session.save(user);
        tx.commit();
        session.close();
    }
}
