/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.msansone.hellotodo.rest;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.msansone.hellotodo.entity.Todo;
import br.com.msansone.hellotodo.service.TodoService;

@Path("todo")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TodoRest {
    
    @Inject
    TodoService todoService;
    
    @Path("new")
    @POST
    public Response createTodo(Todo todo){
       todoService.createTodo(todo);
       
       return Response.ok(todo).build();
    }
    
    
    @Path("update")
    @PUT
    public Response updateTodo(Todo todo){
        todoService.updateTodo(todo);
        
         return Response.ok(todo).build();
    }
    
    
    @Path("{id}")
    @GET
    public Todo getTodo(@PathParam("id") Long id){
        return todoService.findTodoById(id);
    }
    
    
    
    @Path("list")
    @GET
    public List<Todo> getTodos(){
        return todoService.getTodos();
    }

    @Path("status")
    @POST
    public Response markAsComplete(@QueryParam("id") Long id){
        Todo todo = todoService.findTodoById(id);
        todo.setIsComplete(true);
        todoService.updateTodo(todo);

        return Response.ok(todo).build();

    }


    
}
