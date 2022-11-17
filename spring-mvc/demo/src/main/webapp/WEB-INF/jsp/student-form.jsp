<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Form</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">
        First Name: <form:input path="firstName" />
        Last Name: <form:input path="lastName" />
        <br>
        Country:
        <form:select path="country">
            <form:options items="${student.countryOptions}" />
        </form:select>
        <br>
        Favorite Programming Language:
        <form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}" />
        <input type="submit" value="Submit" />
    </form:form>
</body>
</html>