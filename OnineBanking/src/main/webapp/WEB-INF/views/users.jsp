<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%><!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!---<title> Responsive Registration Form | CodingLab </title>--->

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style>
@import
	url('https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700&display=swap')
	;

* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: 'Poppins', sans-serif;
}

body .nit {
	height: 90vh;
	display: flex;
	justify-content: center;
	align-items: center;
	padding: 10px;
	background: linear-gradient(135deg, #71b7e6, #9b59b6);
}

.container {
	max-width: 100%;
	width: 100%;
	background-color: #fff;
	padding: 25px 30px;
	border-radius: 5px;
	box-shadow: 0 5px 10px rgba(0, 0, 0, 0.15);
}

.container .title {
	font-size: 25px;
	font-weight: 500;
	position: relative;
}

.container .title::before {
	content: "";
	position: absolute;
	left: 0;
	bottom: 0;
	height: 3px;
	width: 30px;
	border-radius: 5px;
	background: linear-gradient(135deg, #71b7e6, #9b59b6);
}

.content form .user-details {
	display: flex;
	flex-wrap: wrap;
	justify-content: space-between;
	margin: 20px 0 12px 0;
}

form .user-details .input-box {
	margin-bottom: 15px;
	width: calc(100%/ 2 - 20px);
}

form .input-box span.details {
	display: block;
	font-weight: 500;
	margin-bottom: 5px;
}

.user-details .input-box input {
	height: 45px;
	width: 100%;
	outline: none;
	font-size: 16px;
	border-radius: 5px;
	padding-left: 15px;
	border: 1px solid #ccc;
	border-bottom-width: 2px;
	transition: all 0.3s ease;
}

.user-details .input-box input:focus, .user-details .input-box input:valid
	{
	border-color: #9b59b6;
}

form .button {
	height: 30px;
	margin: 20px 0
}

form .button input {
	height: 100%;
	width: 100%;
	border-radius: 5px;
	border: none;
	color: #fff;
	font-size: 18px;
	font-weight: 500;
	letter-spacing: 1px;
	cursor: pointer;
	transition: all 0.3s ease;
	background: linear-gradient(135deg, #71b7e6, #9b59b6);
}

form .button input:hover {
	/* transform: scale(0.99); */
	background: linear-gradient(-135deg, #71b7e6, #9b59b6);
}

@media ( max-width : 584px) {
	.container {
		max-width: 100%;
	}
	form .user-details .input-box {
		margin-bottom: 15px;
		width: 100%;
	}
}

.content form .user-details {
	max-height: 300px;
	overflow-y: scroll;
}

.user-details::-webkit-scrollbar {
	width: 5px;
}

}
@media ( max-width : 459px) {
	.container .content .category {
		flex-direction: column;
	}
}

body {
	background-repeat: no-repeat;
	height: 100%;
	background-size: cover;
	background: #333;
}

ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #333;
}

li {
	float: left;
}

li a {
	display: block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

li a:hover {
	background-color: #111;
}

.active {
	background-color: green;
}

.styled-table {
	border-collapse: collapse;
	margin: 25px 0;
	font-size: 0.9em;
	font-family: sans-serif;
	min-width: 100%;
	box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
}

.styled-table thead tr {
	background-color: #009879;
	color: #ffffff;
	text-align: center;
}

.styled-table th {
	background-color: #009879;
	padding: 12px 15px;
	text-align: center;
}

.styled-table td {
	padding: 12px 15px;
	text-align: center;
}

.styled-table tbody tr {
	border-bottom: 1px solid #dddddd;
}

.styled-table tbody tr:last-of-type {
	border-bottom: 2px solid #009879;
}

.styled-table tbody tr.active-row {
	font-weight: bold;
	color: #484848;
}

.button2 {
	border: none;
	color: white;
	padding: 10px 16px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 10px;
	margin: 4px 2px;
	transition-duration: 0.4s;
	cursor: pointer;
}

.button2 {
	background-color: white;
	color: black;
	border: 2px solid #008CBA;
}

.button2:hover {
	background-color: #008CBA;
	color: white;
}
</style>
</head>
<body>
	<header>
		<div>
			<ul>
				<li><a href="/admin/home">Home</a></li>
				<li><a href="/admin/users">Users</a></li>
				<li><a href="/admin/deposit">Deposit Transactions</a></li>
				<li><a href="/admin/withdraw">Withdraw Transactions</a></li>
				<li><a href="/admin/transaction">Transactions to Others</a></li>
				<li style="float: right"><a> <form:form
							action="${pageContext.request.contextPath}/logout" method="post">
							<input type="submit" value="Logout"
								style="color: white; background-color: #333; border-radius: 10px">
						</form:form></a></li>
			</ul>
		</div>
	</header>
	<div class="nit">
		<div class="container">
			<div class="title">Users Details</div>
			<div class="content">

				<table class="styled-table">
					<tr>
						<th>Name</th>
						<th>User Name</th>
						<th>Current Account Number</th>
						<th>Current Balance</th>
						<th>Savings Account Balance</th>
						<th>Savings Balance</th>
						<th>Delete User</th>
					</tr>
					<c:forEach var="user" items="${details}">

						<tr class="active-row">
							<td>${user.name}</td>
							<td>${user.userName}</td>
							<td>${user.currentNumber}</td>
							<td>${user.currentBalance}</td>
							<td>${user.savingsNumber}</td>
							<td>${user.savingsBalance}</td>
							<td><a href="/admin/delete/${user.userName}">Delete User</a></td>
						</tr>
					</c:forEach>
				</table>


			</div>
		</div>
	</div>



</body>


</html>

