package besthouserental.hibernate;



import java.io.File;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AccessHibernate {
    Session session;
    private SessionFactory sessionFactory;
    public AccessHibernate(){}
    public Session openSession(){
        sessionFactory=new Configuration().configure(new File("/home/esther/NetBeansProjects/BestHouseRental/src/besthouserental/hibernate/hibernate.cfg.xml")).buildSessionFactory();
        session=sessionFactory.openSession();
        return session;
    }
    public void closeConnection(Session sessionn){
        sessionn.beginTransaction().commit();
        sessionn.close();
    }
}
