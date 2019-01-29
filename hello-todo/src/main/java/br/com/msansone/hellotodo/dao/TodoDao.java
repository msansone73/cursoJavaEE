package br.com.msansone.hellotodo.dao;

import java.util.List;

import javax.ejb.Stateless;
import br.com.msansone.hellotodo.entity.Todo;


@Stateless
public class TodoDao extends AbstractDao {


	public Todo createTodo(Todo todo) {
		entityManager.persist(todo);
		return todo;	
	}
	
	public Todo updateTodo(Todo todo ) {
		entityManager.merge(todo);
		return todo;
	}
	
	public Todo findTodoById(Long id) {
		return entityManager.find(Todo.class, id);
	}
	
	public List<Todo> getTodos(){
		return entityManager.createQuery("SELECT t FROM Todo t", Todo.class).getResultList();
	}
	
}
