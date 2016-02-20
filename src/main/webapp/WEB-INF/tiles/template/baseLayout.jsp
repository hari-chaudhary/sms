<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title><tiles:insertAttribute name="title" /></title>

<link rel="stylesheet" type="text/css"
	href="/SchoolManagementSystem/resource/css/main.css" />
<link href="http://getbootstrap.com/dist/css/bootstrap.css"
	rel="stylesheet">

<link href="http://getbootstrap.com/examples/jumbotron/jumbotron.css"
	rel="stylesheet">

</head>

<body>

	<div class="container">
		<div class="header">
			<div>
				<a href="/SchoolManagementSystem/welcome"> <img alt="logo"
					src="/SchoolManagementSystem/resource/images/school.jpg"
					class="logo">
				</a>
				<ul class="header-title">
					<tiles:insertAttribute name="header" />
				</ul>
				<!-- <security:authorize access="isAuthenticated()">
					<span class="username"> Hello <security:authentication
							property="principal.username" />!
					</span>
				</security:authorize> -->

			</div>

		</div>

		<div class="menu">
			<tiles:insertAttribute name="menu" />
		</div>

		<div class="body">
			<tiles:insertAttribute name="body" />
		</div>

		<div class="footer">
			<tiles:insertAttribute name="footer" />
		</div>

	</div>

</body>
</html>
