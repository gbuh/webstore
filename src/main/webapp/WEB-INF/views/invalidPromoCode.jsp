<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title><spring:message code="invalidPromoCode.title" /></title>
</head>
<body>
    <section>
        <div class="pull-right" style="padding-right: 50px">
            <a href="?language=en"><spring:message code="internationalisation.switch.en" /></a>|<a href="?language=ru"><spring:message
                    code="internationalisation.switch.ru" /></a> <a href="<c:url value="/logout"/>"><spring:message
                    code="logout" /></a>
        </div>
    </section>
    <section>
        <div class="jumbotron">
            <div class="container">
                <h1 class="alert alert-danger"><spring:message code="invalidPromoCode.alert" /></h1>
            </div>
        </div>
    </section>
    <section>
        <div class="container">
            <p>
                <a href="<spring:url value="/market/products" />" class="btn btn-primary"> <span
                    class="glyphicon-hand-left glyphicon"> </span> <spring:message code="invalidPromoCode.products" />
                </a>
            </p>
        </div>
    </section>
</body>
</html>