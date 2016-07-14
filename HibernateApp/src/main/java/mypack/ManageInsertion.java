package mypack;




import java.util.List;
import java.util.Iterator;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManageInsertion {
	private static SessionFactory factory;

	public static void main(String[] args) {
		try {
			factory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}
		ManageInsertion ME = new ManageInsertion();

		/* Add few Users records in database */
		Integer empID1 = ME.addDataProvider("Alex", "cine","da");
		
	
		/* List down all the DataProq */
		ME.listDataProviderq();

		/* Update Users's records */
		ME.updateDataProvider(empID1, "ionel");

	
		/* List down new list of the DataProq */
		ME.listDataProviderq();
	}

	/* Method to CREATE an DataPro in the database */
	public Integer addDataProvider(String firstname, String secondname, String password) {
		Session session = factory.openSession();
		Transaction tx = null;
		Integer userid = null;
		try {
			tx = session.beginTransaction();
			DataProvider DataProvider = new DataProvider(firstname, secondname, password);
			userid = (Integer) session.save(DataProvider);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return userid;
	}

	/* Method to READ all the DataProq */
	public void listDataProviderq() {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			List DataProviderq = session.createQuery("FROM DataProvider").list();
			for (Iterator iterator = DataProviderq.iterator(); iterator.hasNext();) {
				DataProvider DataProvider = (DataProvider) iterator.next();
				System.out.print("First Name: " + DataProvider.getFirstname());
				System.out.print("  Last Name: " + DataProvider.getSecondname());
				System.out.println(" Password: " + DataProvider.getPassword());
			}
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	/* Method to UPDATE Privileges for an Users */
	public void updateDataProvider(Integer userid, String password) {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			DataProvider DataProvider = (DataProvider) session.get(DataProvider.class, userid);
			DataProvider.setUserid(userid);
			session.update(DataProvider);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	/* Method to DELETE an Users from the records */

}
