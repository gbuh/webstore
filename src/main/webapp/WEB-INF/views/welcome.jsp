<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><spring:message code="welcome.title" /></title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
</head>
<body>
    <section>
        <div class="pull-right" style="padding-right: 50px">
            <a href="?language=en"><spring:message code="internationalisation.switch.en" /></a>|<a href="?language=ru"><spring:message
                    code="internationalisation.switch.ru" /></a> <a href="<c:url value="/logout"/>"><spring:message
                    code="logout" /></a>
        </div>
    </section>
    <div class="jumbotron">
        <h1>${greeting}</h1>
        <p>${tagline}</p>
    </div>
    <div>
        <p>
            <a href="<spring:url value="/market/products"/>" class="btn btn-default"> <span
                class="glyphicon-info-sign glyphicon"></span> <spring:message code="welcome.productButton.label" />
            </a>
            <a href="<spring:url value="/customers"/>" class="btn btn-default"> <span
                class="glyphicon-info-sign glyphicon"></span> <spring:message code="welcome.customerButton.label" />
            </a>
        </p>
    </div>
</body>
</html>