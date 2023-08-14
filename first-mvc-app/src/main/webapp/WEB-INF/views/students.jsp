<%@ include file="includes/header.jspf" %>

<body>
<%@ include file="includes/navbar.jspf" %>
	<div class="container">
		<h1>Students</h1>
		<p class="h3">Hello ${name } </p>

		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Id</th>
					<th scope="col">Name</th>
					<th scope="col">Date</th>
					<th scope="col">Is active</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${students}" var="stud">
					<tr>
						<th scope="row">${stud.id}</th>
						<td>${stud.name}</td>
						<td>${stud.date}</td>
						<td>${stud.isActive}</td>
						<td><a href = "/delete-student?id=${stud.id}" class="btn btn-danger">Delete</a>
						<a href = "/edit-student?id=${stud.id}" class="btn btn-success">Edit</a></td>
						
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<div class="container">
		
		<a href = "/add-student" class="btn btn-primary">Add Student</a>
		
		</div>



	</div>

<%@ include file="includes/footer.jspf" %>
