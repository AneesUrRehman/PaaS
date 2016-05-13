<html>
<head>
    <meta name="layout" content="main"/>
    <title>Docker Search</title>
</head>

<body>
<g:if test="${flash.message}">
    <div class="alert alert-info-error">${flash.message}</div>
</g:if>
<g:if test="${flash.error}">
    <div class="alert alert-error">${flash.error}</div>
</g:if>
<g:form controller="docker" action="dockerSearch"><g:textField name="searchTerm"/><g:action="Search"/>
</g:form>
</body>
</html>
