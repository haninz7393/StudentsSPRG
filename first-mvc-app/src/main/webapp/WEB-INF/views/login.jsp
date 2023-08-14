<%@ include file="includes/header.jspf" %>

<body>
<%@ include file="includes/navbar.jspf" %>

	<div class="container">
		<h1>LOGIN</h1>
		<div class="alert alert-danger" role="alert">${errorMsg}</div>
		<form action="/login" method="POST">
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">User name</label>
				<input type="text" class="form-control" name="name">
			</div>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Password</label>
				<input type="password" class="form-control" name="password">
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>

<%@ include file="includes/footer.jspf" %>
