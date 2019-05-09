package edu.mum.cs.cs425.productmgmt;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Product p = new Product();
    	p.setPid(1);
    	p.setName("miki");
    	p.setUnitPrice(789);
    	p.setProductNumber(56);
    	p.setDateMfd(LocalDate.of(2018, 11, 4));
        //System.out.println( "Hello World!" );
    	EntityManagerFactory em = Persistence.createEntityManagerFactory("miki");
    	 EntityManager e = em.createEntityManager();
    	   e.persist(p);
    	  e.getTransaction().begin();
    }
}
