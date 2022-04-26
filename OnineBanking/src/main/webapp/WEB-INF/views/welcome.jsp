<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
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
	max-width: 700px;
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

.column {
	float: left;
	width: 50%;
}

/* Clear floats after the columns */
.row:after {
	content: "";
	display: table;
	clear: both;
}

.flex-column {
	color: #adb5bd;
	font-size: 13px
}

.flex-column p {
	letter-spacing: 1px;
	font-size: 18px
}

.back {
	background: #333;
	width: 250px;
	padding: 30px;
	border-radius: 15px 50px 30px 5px;
	float: right;
	margin-top: 10px;
}


</style>
</head>
<body>
	<div>
		<ul>
			<li class="active"><a href="/">Home</a></li>
			<li><a href="/deposit">Deposit</a></li>
			<li><a href="/withdrawl">Withdraw</a></li>
			<li><a href="/toself">Transfer to Self</a></li>
			<li><a href="/toothers">Transfer to Others</a></li>
			<li><a href="/admin/home">Admin</a></li>
			<li style="float: right"><a> <form:form
						action="${pageContext.request.contextPath}/logout" method="post">
						<input type="submit" value="Logout"
							style="color: white; background-color: #333; border-radius: 10px">
					</form:form></a></li>
		</ul>
	</div>
	<div class="nit">
		<div class="container">
			<div class="title">Home</div><br>
			<div class="content">
				<div class="row">
					<div class="column">
					<br>
						Name: ${details.name}<br><br>
						User Name: ${details.userName}<br><br>
						Email: ${details.email}<br><br>
						Phone Number : ${details.phoneNumber}<br><br>
						
					</div>

					<div class="column">

						<div class="back">
							<div class="d-flex flex-row">
								<div class=" flex-column">
									<span>Savings Account Balance</span>
									<p>
										Rs. <span>${savingBalance }</span>
									</p>

								</div>
							</div>
						</div>

						<div class="back">
							<div class="d-flex flex-row">
								<div class=" flex-column">
									<span>Current Account Balance</span>
									<p>
										Rs. <span>${currentBalance}</span>
									</p>

								</div>
							</div>
						</div>
					</div>


				</div>
			</div>

		</div>
	</div>



</body>


</html>