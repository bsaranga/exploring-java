<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Form</title>
    <style>
        .error {
            color: red
        }
    </style>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">
        First Name: <form:input path="firstName" />
        <form:errors path="firstName" cssClass="error" />
        Last Name(*): <form:input path="lastName" />
        <form:errors path="lastName" cssClass="error" />
        <br>
        Country:
        <form:select path="country">
            <form:options items="${student.countryOptions}" />
        </form:select>
        <br>
        Favorite Programming Language:
        <form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}" />
        <br>
        Proficient Operating Systems:
        Windows<form:checkbox path="operatingSystems" value="Windows"/>  
        Linux<form:checkbox path="operatingSystems" value="Linux"/>  
        Mac OS<form:checkbox path="operatingSystems" value="Mac OS"/>
        <br>
        Free Passes: <form:input path="freePasses" />
        <form:errors path="freePasses" cssClass="error" />
        <br>
        Postal Code: <form:input path="postalCode" />
        <form:errors path="postalCode" cssClass="error" />
        <input type="submit" value="Submit" />
    </form:form>
</body>
</html>