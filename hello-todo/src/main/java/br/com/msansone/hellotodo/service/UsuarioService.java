package br.com.msansone.hellotodo.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.msansone.hellotodo.dao.UsuarioDao;
import br.com.msansone.hellotodo.entity.Usuario;

@Transactional
public class UsuarioService {

	@Inject
	private UsuarioDao usuarioDao;
	
	public Usuario createUsuario(Usuario usuario) {
		usuarioDao.createUsuario(usuario);
		return usuario;
	}
	
	public Usuario updateUsuario(Usuario usuario) {
		usuarioDao.upgradeUsuario(usuario);
		return usuario;
	}
	
	public Usuario findUsuarioById(Long id) {
		return usuarioDao.findUsuarioById(id);
	}
	
	public List<Usuario> getTodos(){
		return usuarioDao.getUsuario();
	}
	
}
