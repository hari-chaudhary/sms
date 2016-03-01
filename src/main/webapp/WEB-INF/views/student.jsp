<div class="content">
	<h1>Add Student</h1>

	<form id="studentForm" method="post">
		<table cellpadding="0" cellspacing="0" border="1" class="GridOne">
			<tr>
				<td>First Name</td>
				<td><input type="text" name="firstName" id="firstName" value=""></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="lastName" id="lastName" value=""></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" id="email" value=""></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="button"
					value="Ajax Submit" onclick="makeAjaxCall();"></td>
			</tr>
		</table>
	</form>
</div>
<!-- Success - or Validation errors -->
<div id="errors" style="display: none"></div>

<div id="formInput" style="display: none"></div>