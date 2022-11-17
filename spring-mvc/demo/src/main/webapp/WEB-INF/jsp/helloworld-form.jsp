<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hello World Input Form</title>
    <link rel="stylesheet" href="resources/style.css">
</head>
<body>
    <form action="processForm" method="GET">
        <input type="text" name="studentName" placeholder="What is your name?" />
        <input type="submit" />
    </form>
    <br>
    <form action="processFormVersionTwo" method="GET">
        <input type="text" name="studentName" placeholder="Type the shout message..." />
        <input type="submit" />
    </form>
</body>
</html>