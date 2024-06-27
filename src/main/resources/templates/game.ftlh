<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Игра Морской бой</title>
</head>
<body>

<table>
    <tr>
        <th>Идентификатор</th>


    </tr>
    <#list gameList as game>
        <tr>
            <td>${game.id}</td>


        </tr>
    </#list>
</table>
</body>
</html>