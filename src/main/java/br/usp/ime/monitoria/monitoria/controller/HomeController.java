package br.usp.ime.monitoria.monitoria.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.usp.ime.monitoria.monitoria.modelo.professor.Professor;

@Resource
public class HomeController {
	
	private final Result result;

	public HomeController(Result result) {
		this.result = result;
	}
	
	@Get("/")
	public void home() {
		System.out.println("hello world");
	}

	@Get("/cadastraProfessor")
	public void cadastraProfessor(Professor professor) {
		//valida o professor
		//salva no banco
		result.include("professor", professor);
	}
}