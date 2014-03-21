package br.usp.ime.monitoria.monitoria.dao;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import br.usp.ime.monitoria.monitoria.modelo.Professor;

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

