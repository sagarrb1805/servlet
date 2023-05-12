package hiberdemo.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Employee em = new Employee();
    	em.setId(112);
    	em.setName("emp 1");
    	em.setCountry("India");
    	
    	Equipment equi = new Equipment();
    	equi.setEqui_id(1);
    	equi.setEqui_name("pixel 7A");
    	
    	em.setEqui(equi);
    	
    	System.out.println(em);
    	Configuration config = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Equipment.class);
    	
    	SessionFactory factory = config.buildSessionFactory();
    	
    	Session se = factory.openSession();
    	Transaction tx = se.beginTransaction();
    	
    	se.save(em);
    	se.save(equi);
    	
    	tx.commit();
    	
    	
    	
//    	System.out.println("hello world");
    	
    	
    	
    	
    }
}
