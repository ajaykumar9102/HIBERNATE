import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Studentinititaor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Student s=new Student();
s.setName("ajay");
s.setAge(23);
 Configuration config =new Configuration().configure().addAnnotatedClass(Student.class);
 SessionFactory sf=config.buildSessionFactory();
 Session s1=sf.openSession();
 Transaction tx=s1.beginTransaction();
 s1.save(s);
 tx.commit();
 System.out.println(s);
	}

}
