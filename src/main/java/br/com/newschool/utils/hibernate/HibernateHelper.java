package br.com.newschool.utils.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author guilherme.pacheco
 * @version 1.0
 * Date: 28/12/2021
 * */

public class HibernateHelper {

	private static EntityManagerFactory emf ;

	public static EntityManager getEntityManager() {
		if (emf == null) {
			emf = Persistence.createEntityManagerFactory("newschooldb");
		}
		return emf.createEntityManager();
	}
	
}
