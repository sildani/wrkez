<html>

<head>
	<title>Wrkez : Login Form</title>
</head>

<body>
	<h2>Please log in</h2>
	<g:form name="loginForm" action="form">
	<ul>
		<g:if test="${failed}">
		<li>Error: The username and/or password were incorrect. Please try again.</li>
		</g:if>
		<li><label>Username<label><g:textField name="username" value="${username}" /></li>
		<li><label>Password<label><g:passwordField name="password" value="" /></li>
		<li><g:actionSubmit value="Login" action="form" /></li>
	</ul>
	</g:form>
</body>