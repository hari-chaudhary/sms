<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>

<div class="menu-list">
	<security:authorize access="hasRole('ROLE_ADMIN')">
		<center><a href="admin">Admin</a></center>
	</security:authorize>
	
	<center><a href="staff">Staff</a></center>
	<center><a href="student">Student</a></center>
	<center><a href="login">check in</a></center>
</div>