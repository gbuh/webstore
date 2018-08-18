<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
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
                                class="btn btn-primary"> <span class="glyphicon-info-sign glyphicon"></span> <spring:message
                                    code="products.detailButton.label" />
                            </a>
                        </p>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</section>
