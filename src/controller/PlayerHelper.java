package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Player;


public class PlayerHelper {
EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("BowlingLeagueStevens"); 
	

	public void insertPlayer(Player tm) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(tm);
		em.getTransaction().commit();
		em.close();
}
	}