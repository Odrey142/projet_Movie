package Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Model.Acteur;



public class ConnexionJpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetMovie");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		
		Acteur acteur = new Acteur();
		acteur.setIdentite("Samantha");
		acteur.setDateNaissance("24/12/2014");
		acteur.setUrl("http://projetmovie.com");
		acteur.setHeight(56);
		em.persist(acteur);
		
		
		
		
		transaction.commit();
		
		
	}

}
