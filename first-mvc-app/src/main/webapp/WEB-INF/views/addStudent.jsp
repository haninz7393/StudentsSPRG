<%@ include file="includes/header.jspf" %>

<body>
<%@ include file="includes/navbar.jspf" %>
	
	<div class="container">
		<h1>Add new student</h1>
		<form action="/add-student" method="POST">
			<div class="mb-3">
			<c:if test="${errorMsg.length() > 0}">
			<div class="alert alert-danger" role="alert">${errorMsg}</div>
			</c:if>
				<input type="hidden"  name="${_csrf.parameterName}" value="${_csrf.token}">
				<label for="exampleInputEmail1" class="form-label">Name</label>
				<input type="text" class="form-control" name="name" required>
			</div>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Date</label>
				<input type="text" class="form-control" name="date" required>
			</div>
			<button type="submit" class="btn btn-primary">Add student</button>
		</form>
	</div>

<%@ include file="includes/footer.jspf" %>
