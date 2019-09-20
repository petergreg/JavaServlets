<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

	<div class="container">
		Your new Todo
		<ol>
			<c:forEach items="${todos}" var="todo">
				<li>${todo.name}&nbsp;<a href="/delete-todo.do?todo=${todo.name}">Delete</a></li>
			</c:forEach>
		</ol>
		<p>
			<font color="red">${errorMessage}</font>
		</p>
		<form method="POST" action="/add-todo.do">
			<fieldset class="form-group">
				<label>Description</label>
				<input name="todo" type="text" class="form-control"/>
			</fieldset>
			<fieldset class="form-group">			
				<label>Category</label>
				<input name="category" type="text"  class="form-control"/>
			</fieldset>			
			<input name="add" type="submit" class="btn btn-success" value="Submit"/><BR/>
			
		</form>
	</div>

	<%@ include file="../common/footer.jspf"%>
	