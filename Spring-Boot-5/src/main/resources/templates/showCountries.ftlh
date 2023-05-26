<!DOCTYPE html>
<html>
    <head>
        <title>Show countries</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        </head>

    <body>

        <h2>List of countries</h2>

        <table>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Population</th>
            </tr>

            <#list countries as country>
                <tr>
                    <td>${country.id}</td>
                    <td>${country.name}</td>
                    <td>${country.population}</td>
                </tr>
            </#list>
        </table>
    </body>
</html>