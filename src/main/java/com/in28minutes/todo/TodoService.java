package com.in28minutes.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {

	public TodoService() {
	}
	
	private static List<Todo> todos = new ArrayList<Todo>();
	static {
		todos.add(new Todo("Learn Pyhton", "Study"));
		todos.add(new Todo("Learn Java 8 differencies", "Study"));
		todos.add(new Todo("Learn everything", "Study"));
	}
	
	public List<Todo> retrieveTodos(){
		return todos;
	}
	
	public void addTodo(Todo todo) {
		todos.add(todo);
	}
	
	public void deleteTodo(Todo todo) {
		todos.remove(todo);
	}


}
