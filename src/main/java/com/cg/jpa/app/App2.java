package com.cg.jpa.app;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class App2 {
		

		public static void main(String[] args) {
			System.out.println("Start");
			try {
				Configuration config = new Configuration();
				
				SessionFactory factory = config.configure().buildSessionFactory();
				Session session = factory.openSession();
				  
				Transaction transaction = session.beginTransaction();
				Department2 dept = new Department2("HR", "Hyderabad");
				session.save(dept); // insert
				transaction.commit();
				Department2 d1;
				
				d1 = session.get(Department2.class, 13); // select
				System.out.println(d1.toString()); 
				session.evict(d1);
				
//				d1.setName("Sales");
//				session.update(d1); // update
//				d1 = session.get(Department.class, 10);
//				System.out.println(d1.toString());
//				session.delete(d1); // delete
//				d1 = session.get(Department.class, 10);
//				System.out.println(d1.toString());
				session.close();
				factory.close();
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
			System.out.println("End");
		}
	}


