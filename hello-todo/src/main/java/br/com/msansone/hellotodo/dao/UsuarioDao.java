package br.com.msansone.hellotodo.dao;

import java.util.List;

import javax.ejb.Stateless;

import br.com.msansone.hellotodo.entity.Usuario;

@Stateless
public class UsuarioDao extends AbstractDao {

	public Usuario createUsuario(Usuario usuario) {
		entityManager.persist(usuario);
		return usuario;
	}
	
	public Usuario upgradeUsuario(Usuario usuario) {
		entityManager.merge(usuario);
		return usuario;
	}
	
	public Usuario findUsuarioById(Long id) {
		return entityManager.find(Usuario.class, id);
	}
	
	public List<Usuario> getUsuario(){
		return entityManager.createQuery("SELECT u FROM Usuario u", Usuario.class).getResultList();
	}
	
}
