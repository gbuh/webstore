<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title><spring:message code="cusomers.title" /></title>
</head>
<body>
    <section>
        <div class="jumbotron">
            <div class="container">
                <h1><spring:message code="cusomers.section1" /></h1>
                <p><spring:message code="cusomers.section1p" /></p>
            </div>
        </div>
    </section>
    <section class="container">
        <div class="row">
            <c:forEach items="${customers}" var="customer">
                <div class="col-sm-6 col-md-3">
                    <div class="thumbnail">
                        <div class="caption">
                            <h3>${customer.name}</h3>
                            <p>${customer.address}</p>
                            <p>Customer made ${customer.noOfOrdersMade} purchase in our store</p>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </section>
</body>
</html>