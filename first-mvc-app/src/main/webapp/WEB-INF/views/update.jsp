<%@ include file="includes/header.jspf"%>

<body>
	<%@ include file="includes/navbar.jspf"%>

	<div class="container">
		<h1>Update student</h1>
		<form action="/update-student" method="POST">
			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}"> <input type="text"
				class="form-control" name="id" value="${student.id}" hidden required>

			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Name</label> <input
					type="text" class="form-control" name="name"
					value="${student.name}" required>
			</div>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Date</label> <input
					type="text" class="form-control" name="date"
					value="${student.date}" required>
			</div>

			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Is
					active</label> <input type="text" class="form-control" name="isActive"
					value="${student.isActive}" required>
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>

	<%@ include file="includes/footer.jspf"%>