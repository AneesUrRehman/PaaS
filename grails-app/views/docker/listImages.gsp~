//<html>
	//<head>
		<meta name="layout" content="main"/>
		<title>Images List</title>
	</head>
	//<body>
${listImages}
<g:form controller="docker" action="listImages">
    <input type="submit" value="List Images">
</g:form>
	</body>
</html>

<html>
<head>
    <meta name="layout" content="layout">
    <g:set var="listImages" value="${message(code: 'notificationCategory.label', default: 'NotificationCategory')}"/>
    <title><g:message code="default.list.label" args="[listImages]"/></title>
    <jqui:resources
            themeCss="https://s3.amazonaws.com/club_premier/jquery-ui/themes/custom/jquery-ui-1.8.15.custom.css"/>
    <r:require modules="core"/>
</head>

<body>
${listImages}
<g:form controller="docker" action="listImages">
    <input type="submit" value="List Images">
</g:form>
<div id="main">
    <div id="main_content" class="container-fluid">

        <div class="row-fluid">

            <div class="span3">
                <div class="well">
                    <ul class="nav nav-list">
                        <li class="nav-header">${entityName}</li>
                        <li class="active">
                            <g:link class="list" action="list">
                                <i class="icon-list icon-white"></i>
                                <g:message code="default.list.label" args="[entityName]"/>
                            </g:link>
                        </li>
                        <li>
                            <g:link class="create" action="create">
                                <i class="icon-plus"></i>
                                <g:message code="default.create.label" args="[listImages]"/>
                            </g:link>
                        </li>
                    </ul>
                </div>
            </div>

            <div class="span9">

                <div class="page-header">
                    <h1><g:message code="default.list.label" args="[listImages]"/></h1>
                </div>

                <g:if test="${flash.message}">
                    <div class="alert alert-info-error">${flash.message}</div>
                </g:if>
                <g:if test="${flash.error}">
                    <div class="alert alert-error">${flash.error}</div>
                </g:if>


                <table class="table table-striped">
                    <thead>
                    <tr>
                        
                        <g:sortableColumn property="title"
                                          title="${message(code: 'notificationCategory.title.label', default: 'Title')}"/>
                        
                        <g:sortableColumn property="description"
                                          title="${message(code: 'notificationCategory.description.label', default: 'Description')}"/>
                        
                        <g:sortableColumn property="shortDesc"
                                          title="${message(code: 'notificationCategory.shortDesc.label', default: 'Short Desc')}"/>
                        
                        <g:sortableColumn property="displayOrder"
                                          title="${message(code: 'notificationCategory.displayOrder.label', default: 'Display Order')}"/>
                        
                        <g:sortableColumn property="code"
                                          title="${message(code: 'notificationCategory.code.label', default: 'Code')}"/>
                        
                        <th></th>
                    </tr>
                    </thead>
                    <tbody>
                    <g:each in="${notificationCategoryInstanceList}" var="notificationCategoryInstance">
                        <tr>
                            
                            <td>${fieldValue(bean: notificationCategoryInstance, field: "title")}</td>
                            
                            <td>${fieldValue(bean: notificationCategoryInstance, field: "description")}</td>
                            
                            <td>${fieldValue(bean: notificationCategoryInstance, field: "shortDesc")}</td>
                            
                            <td>${fieldValue(bean: notificationCategoryInstance, field: "displayOrder")}</td>
                            
                            <td>${fieldValue(bean: notificationCategoryInstance, field: "code")}</td>
                            
                            <td class="link">
                                <g:link action="show" id="${notificationCategoryInstance.id}"
                                        class="btn btn-small"><g:message code="default.button.show.label" default="mostrar"/> &raquo;</g:link>
                            </td>
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
