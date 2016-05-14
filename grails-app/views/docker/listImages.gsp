//<html>
	//<head>
		<meta name="layout" content="main"/>
		<title>Images List</title>
	</head>
	//<body>
<g:form controller="docker" action="listImages">
    <input type="submit" value="List Images">
</g:form>
	</body>
</html>

<html>
<head>
    <meta name="layout" content="layout">
</head>

<body>
<g:form controller="docker" action="listImages">
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
                    <g:each in="${listImages}" var="image">
                        <tr>
                            <!--
                            Example for get property in object
                            if there are more properties put more td, and
                            set the correct name property,
                            example : https://gist.github.com/GloriaPG/1aa33dc5220121036aed2f803d472d77
                            --->
                           <td> ${image?.id}</td>
                            <td> ${image?.repoTags[0]}</td>
                            <td> ${image?.size}</td>
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
