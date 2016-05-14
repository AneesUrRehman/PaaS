<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Welcome to Docker</title>
	</head>
	<body>
	<g:if test="${flash.message}">
		<div class="alert alert-info-error">${flash.message}</div>
	</g:if>
	<g:if test="${flash.error}">
		<div class="alert alert-error">${flash.error}</div>
	</g:if>
<g:form controller="docker" action="createContainer">

    <input type="submit" value="Create Container">
</g:form>
	</body>
</html>


