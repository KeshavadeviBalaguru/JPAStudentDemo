package com.java;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainApp {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu1");
	    EntityManager em=emf.createEntityManager();
	    
	  JPAStudent sob=em.find(JPAStudent.class,1);
	    System.out.println(sob);
	  
	    //insert
	    
	  JPAStudent ob=new JPAStudent();
	  ob.setSid(2);
	  ob.setSname("Anitha");
	  ob.setScourse("IT");
	  em.getTransaction().begin();
	   
	  em.persist(ob);
	  em.getTransaction().commit();
	  }
		
	      
	

		

	

}
