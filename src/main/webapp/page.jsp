<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="ru">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" name="viewport"
          content="width=device-width, initial-scale=1">
</head>
<body>
    <p>Last value of response: <c:out value="${sentText}"/></p>
    <p>This form will be submitted using the POST method:</p>

    <div class="container">
        <h1>Form for request </h1>
        <form action="/sendRequest" method="POST">
            Enter the text:<br>
            <input type="text" name="sentText">
            <br>
            <input type="submit" value="Send post request">
        </form>
    </div>
</body>
</html>