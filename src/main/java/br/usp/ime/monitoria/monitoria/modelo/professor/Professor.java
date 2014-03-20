package br.usp.ime.monitoria.monitoria.modelo.professor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Professor {

	@Id
	@GeneratedValue
	private Long id;
	
	@NotEmpty
	private String numeroUsp;
	
	@NotEmpty
	private String nome;
	
	@NotEmpty
	private String senha;

	public String getNumeroUsp() {
		return numeroUsp;
	}

	public void setNumeroUsp(String numeroUsp) {
		this.numeroUsp = numeroUsp;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
