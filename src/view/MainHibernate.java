package view;

import entity.Pessoa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainHibernate {
	public static void main(String[] args){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("exemplohibernate");
		EntityManager em = factory.createEntityManager();
		
		Pessoa p = new Pessoa();
		p.setNome("Guilherme");
		p.setSobrenome("Farias");
		
		em.getTransaction().begin();
		em.persist(p);		
		em.getTransaction().commit();
	}
}