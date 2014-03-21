package br.usp.ime.monitoria.monitoria.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.usp.ime.monitoria.monitoria.modelo.professor.Professor;
import br.usp.ime.monitoria.monitoria.modelo.professor.ProfessorDao;

@Resource
public class HomeController {
	
	private final Result result;
	private ProfessorDao professorDao;
	private Validator validator;

	public HomeController(Result result, ProfessorDao professorDao, Validator validator) {
		this.result = result;
		this.professorDao = professorDao;
		this.validator = validator;
	}
	
	@Get("/")
	public void home() {
		System.out.println("hello world");
	}

	@Post("/cadastraProfessor")
	public void cadastraProfessor(Professor professor) {
		validator.validate(professor);
		validator.onErrorForwardTo(this).home();
		professorDao.add(professor);
		result.include("professor", professor);
	}
}