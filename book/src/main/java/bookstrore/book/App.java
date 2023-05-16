package bookstrore.book;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
    	Configuration config = new Configuration().configure().addAnnotatedClass(Books.class).addAnnotatedClass(User.class);
    	SessionFactory factory = config.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction tx = session.beginTransaction();
    	
    	
    	
    	for(int i=1;i<15;i++) { 
    		
    		List<Books> books = new ArrayList<Books>();
    		for (int j = 10; j<15; j++) {
    			Books b = new Books();
    			UUID uuid = UUID.randomUUID();
    			b.setId(uuid);
    			b.setAuthor("author "+j);
    			b.setBookName("Book Name" + j);
    			books.add(b);
    			session.save(b);
    		}
    		
    		User user = new User();
    		user.setId(i);
    		user.setUserName("user "+i);
    		user.setBooks(books);
    		session.save(user);
		  
		  }
    	
    	
    	
    	tx.commit();
    }
}
