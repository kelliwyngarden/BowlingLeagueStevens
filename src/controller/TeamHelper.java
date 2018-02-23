package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Team;

public class TeamHelper {
EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("BowlingLeagueStevens");
	
	public void insertBowling(Team tm) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(tm);
		em.getTransaction().commit();
		em.close();
	}

}
