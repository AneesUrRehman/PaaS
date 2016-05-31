
//<html>
	//<head>
		<meta name="layout" content="main"/>
		<title>Container List</title>
	</head>
	//<body>
<g:form controller="docker" action="listContainers">
    <input type="submit" value="List Containers">
</g:form>
	</body>
</html>

<html>
<head>
    <meta name="layout" content="layout">
</head>

<body>
<g:form controller="docker" action="listContainers">
    <input type="submit" value="Refresh">
</g:form>
<div id="main">
    <div id="main_content" class="container-fluid">

        <div class="row-fluid">


                <g:if test="${flash.message}">
                    <div class="alert alert-info-error">${flash.message}</div>
                </g:if>
                <g:if test="${flash.error}">
                    <div class="alert alert-error">${flash.error}</div>
                </g:if>


                <table>
                    <thead>
                    <tr>
                        <g:sortableColumn property="id"
                                          title="ID"/>

                        <g:sortableColumn property="repoTags"
                                          title="Tag"/>
                        <g:sortableColumn property="size"
                                          title="Size"/>
                    </tr>
                    </thead>
                    <tbody>
                    <g:each in="${listContainers}" var="containers">
                        <tr>
                          <td> ${containers?.id}</td>
                           <td> ${container?.size}</td>
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
</body>
</html>
