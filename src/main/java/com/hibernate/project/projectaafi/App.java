package com.hibernate.project.projectaafi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mysql.cj.Query;

import aafrin.Student;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try
		{
			emf = Persistence.createEntityManagerFactory("jpa-todo");
			entityManager = emf.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			
			Student student = new Student();
			student.setStudentId(2);
			student.setFirstname("Riza");
			student.setLastname("Nadaf");
			student.setContactno("12345");
			
			entityManager.persist(student);
			transaction.commit();
			Query q = (Query) entityManager.createQuery("select s from Student s");
			List<Student> resultList = ((javax.persistence.Query) q).getResultList();
			System.out.println("num of sudents:" + resultList.size());
			for (Student next : resultList) {
				System.out.println("next student: " + next);
			}
		}
		catch(Exception e)
	    {
			
			System.out.println(e);
			transaction.rollback();
		//	System.out.println("Error while uploading"+e);
			//transaction.rollback();
		
	    }
		finally
		{
			entityManager.close();
			emf.close();
			
		}
}
}