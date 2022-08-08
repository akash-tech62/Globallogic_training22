<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Employee Management Application</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: #00FFFF">
			<div>
				<a> Employee Management App </a>
			</div>

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link">Employee</a></li>
			</ul>
		</nav>
	</header>
	<br>
	
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				
				
				<c:if test="${employee != null}">
					<form action="update" method="post">
				</c:if>
				<c:if test="${employee == null}">
					<form action="insert" method="post">
				</c:if>


				<caption>
					<h2>
						<c:if test="${employee != null}">
            			Add/ Edit Employee
            	
					</h2>
				</caption>


				<c:if test="${employee != null}">
					<input type="hidden" name="id" value='${employee.id}' />
				</c:if>

				<fieldset class="form-group">
					<label>First Name</label> <input type="text" placeholder = "Enter First Name"
						value='${employee.first_name}' class="form-control"
						name="firstname" required="required">
				</fieldset>
				
				<fieldset class="form-group">
					<label>Last Name</label> <input type="text" placeholder = "Enter Last Name"
						value='${employee.last_name}' class="form-control"
						name="lastname" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label>Email</label> <input type="text" placeholder = "Enter Email"
						value='${employee.email}'  class="form-control"
						name="email">
				</fieldset>

				<fieldset class="form-group">
					<label>Contact</label> <input type="text" placeholder = "Enter Contact"
						value='${employee.contact}' class="form-control"
						name="country">
				</fieldset>

				<button type="submit" class="btn btn-success">Save</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>