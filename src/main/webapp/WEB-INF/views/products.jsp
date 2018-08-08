<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title><spring:message code="products.title" /></title>
</head>
<body>
    <section>
        <div class="pull-right" style="padding-right: 50px">
            <a href="?language=en"><spring:message code="internationalisation.switch.en" /></a>|<a href="?language=ru"><spring:message code="internationalisation.switch.ru" /></a>
        </div>
    </section>
    <section>
        <div class="jumbotron">
            <div class="container">
                <h1>
                    <spring:message code="products.section1" />
                </h1>
                <p>
                    <spring:message code="products.section1p" />
                </p>
            </div>
        </div>
    </section>
    <section class="container">
        <div class="row">
            <c:forEach items="${products}" var="product">
                <div class="col-sm-6 col-md-3">
                    <div class="thumbnail">
                        <img alt="img" style="width: 100%" src="<c:url value="/img/${product.productId}.png"></c:url>">
                        <div class="caption">
                            <h3>${product.name}</h3>
                            <p>${product.description}</p>
                            <p>${product.unitPrice}</p>
                            <p>Available ${product.unitsInStock} units in stock</p>
                            <p>
                                <a
                                    href="<spring:url value="/market/product?id=${product.productId}"
                                    htmlEscape="true" />"
                                    class="btn btn-primary"> <span class="glyphicon-info-sign glyphicon"></span><spring:message code="products.detailButton.label" />
                                </a>
                            </p>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </section>
    <a href="<spring:url value="/"/>" class="btn btn-primary"><spring:message code="products.welcomeButton.label" /></a>
</body>
</html>