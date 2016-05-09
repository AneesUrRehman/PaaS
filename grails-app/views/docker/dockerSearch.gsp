<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Docker Search</title>
	</head>
	<body>
${dockerSearch}
<g:form controller="docker" action="dockerSearch"><g:textField name="searchTerm"/><g:action="Search"/>
</g:form> 
	</body>
</html>
