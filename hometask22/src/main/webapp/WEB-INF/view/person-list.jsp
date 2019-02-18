<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
    <body>
        <h1>All persons</h1>
        <c:forEach var="product" items="${persons}">
            <span>${product.id} ${product.title} ${product.cost}</span>
            <br>
        </c:forEach>
    </body>
</html>