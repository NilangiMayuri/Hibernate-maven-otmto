import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeptEmpSaveClient {

    public static void main(String[] args) {
    	Configuration cfg = new Configuration();
        cfg.configure("/hibernate.cfg.xml");
        // Create department FIRST
        Dept d1 = new Dept(0, "batch2", "ban1", null);
      

        // Create employees and set dept reference
//        Emp e1 = new Emp(0, "cdc", 30000.00, "e", d1);
//        Emp e2 = new Emp(0, "bgb", 80000.00, "t", d1);
//        Emp e3 = new Emp(0, "ads", 50000.00, "e", d1);
//        Emp e4 = new Emp(0, "cgd", 4000.00, "d", d1);
        //For running this 4 lines we have the batch 1
        
        //if we run it after some time it gives error, because we are trying to insert the same data in the same batch(batch1). 
        //So, while running 2nd time or 3rd time make sure to change the batchname i.e., batch2
        
        Emp e1 = new Emp(1, "cdcgb", 3000.00, "t", d1);
        Emp e2 = new Emp(2, "bgbdf", 8000.00, "t", d1);
        Emp e3 = new Emp(3, "adses", 5000.00, "h", d1);
        Emp e4 = new Emp(4, "cgdws", 400.00, "d", d1);

        // Add employees to list
        List<Emp> empList = new ArrayList<Emp>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);

        // Set list into Dept
        d1.setEmpList(empList);

        // Hibernate save
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
                Transaction tx = session.beginTransaction();
        try {
            session.save(d1);
            tx.commit();
            System.out.println("TX Success");
        } catch (Exception e) {
            tx.rollback();
            System.out.println("TX Failed");
            e.printStackTrace();
        }
    }
}
