package br.com.msansone.hellotodo.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.msansone.hellotodo.dao.TodoDao;
import br.com.msansone.hellotodo.entity.Todo;

@Transactional
public class TodoService {

	@Inject 
	private TodoDao todoDao;

	public Todo createTodo(Todo todo) {
		todoDao.createTodo(todo);
		return todo;
	}
	
	public Todo updateTodo(Todo todo ) {
		todoDao.updateTodo(todo);
		return todo;
	}
	
	public Todo findTodoById(Long id) {
		return todoDao.findTodoById(id);
	}
	
	public List<Todo> getTodos(){
		return todoDao.getTodos();
	}
	
}
