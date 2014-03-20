package br.usp.ime.monitoria.monitoria.modelo.professor;

import javax.persistence.EntityManager;

import org.hibernate.Session;

import br.com.caelum.vraptor.ioc.Component;

@Component
public class ProfessorDao {

	private EntityManager manager;
	
	public ProfessorDao(EntityManager manager) {
		this.manager = manager;
	}
	
	public void add(Professor professor) {
		manager.persist(professor);
	}
	
}

