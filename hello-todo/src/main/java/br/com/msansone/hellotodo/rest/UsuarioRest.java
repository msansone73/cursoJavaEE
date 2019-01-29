package br.com.msansone.hellotodo.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.msansone.hellotodo.entity.Usuario;
import br.com.msansone.hellotodo.service.UsuarioService;

@Path("usuario")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UsuarioRest {

	@Inject
	UsuarioService usuarioService;

	@Path("new")
	@POST
	public Response createUsuario(Usuario usuario) {
		usuarioService.createUsuario(usuario);
		return Response.ok(usuario).build();
	}
	
	@Path("update")
	@PUT
	public Response updateUsuario(Usuario usuario) {
		usuarioService.updateUsuario(usuario);
		return Response.ok(usuario).build();
	}
	
	@Path("{id}")
	@GET
	public Usuario getUsuario(@PathParam("id") Long id) {
		return usuarioService.findUsuarioById(id);
	}
	
	@Path("list")
	@GET
	public List<Usuario> getTodos(){
		return usuarioService.getTodos();
	}
	
}
