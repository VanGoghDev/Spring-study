<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

 <html>
    <body>
        <form:form action="formAddPersonProcess" modelAttribute="person">
            Name: <form:input path="name" />
            <br>
            Age: <form:input path="age" />
        </form:form>
    </body>
 </html>