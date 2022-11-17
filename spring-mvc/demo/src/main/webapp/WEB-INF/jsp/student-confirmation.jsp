<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Confirmation</title>
</head>
<body>
    <div>
        The student is confirmed: ${student.firstName} <strong>${student.lastName}</strong>
    </div>
    <div>
        <p>The student's country is: <strong>${student.country}</strong></p>
    </div>
    <div>
        <p>The student's favorite programming language is: <strong>${student.favoriteLanguage}</strong></p>
    </div>
    <div>
        <p>The student's operating systems are...</p>
        <ul>
            <c:forEach var="temp" items="${student.operatingSystems}">
                <li>${temp}</li>
            </c:forEach>
        </ul>
    </div>
    <br>
    <div>
        <p>Free passes remaining: ${student.freePasses}</p>
    </div>
</body>
</html>