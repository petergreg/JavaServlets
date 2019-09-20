package com.in28minutes.todo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.in28minutes.todo.TodoService;

@WebServlet(urlPatterns = "/delete-todo.do")
public class DeleteTodoServlet extends HttpServlet{

	private TodoService todoService = new TodoService();

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		todoService.deleteTodo(new Todo(request.getParameter("todo"), request.getParameter("category")));
		response.sendRedirect("/list-todo.do");

	}
//	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
//	throws ServletException, IOException {
//		String newTodo = request.getParameter("todo");
//		todoService.addTodo(new Todo(newTodo));
//		
//		response.sendRedirect("/list-todo.do");
//	}
//	
	
}
