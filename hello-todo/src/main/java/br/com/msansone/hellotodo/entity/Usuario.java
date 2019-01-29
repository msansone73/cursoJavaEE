package br.com.msansone.hellotodo.entity;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

@Entity
public class Usuario extends AbstractEntity {
	
	@NotEmpty(message="Campo nome é obrigatório.")
	private String nome;
	@NotEmpty(message="Campo usuario é obrigatório.")
	private String usuario;
	@NotEmpty(message="Campo e-mail é obrigatório.")
	private String email;
	@NotEmpty(message="Campo senha é obrigatório.")
	private String senha;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	
	
}
