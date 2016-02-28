<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>

<h1>Student Management System</h1>
<div class="sign-in-up">
	<security:authorize access="!isAuthenticated()">
		<div class="align-horizontal">
			<a href="register">register</a>
		</div>

		<div class="align-horizontal">|</div>

		<div class="align-horizontal">
			<a href="login">sign in</a>
		</div>
	</security:authorize>

	<security:authorize access="isAuthenticated()">
		<div class="align-horizontal">
			<a href="logout">logout</a>
		</div>
	</security:authorize>

</div>