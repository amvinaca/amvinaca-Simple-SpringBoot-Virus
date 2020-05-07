<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Virus</title>

    <style>

        body
        {
            background-image: url("http://www.allwhitebackground.com/images/2/2281.jpg");
        }

        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: lightblue;
        }
    </style>
</head>
<body>

<h2>Deadliest Viruses on Earth </h2>

<style>
    h2
    {
        text-align: center;
    }
</style>


<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Description</th>
        <th>Symptoms</th>
        <th>Duration</th>
        <th>Mortality Rate</th>
        <th>Image</th>
    </tr>
    <c:forEach var = "listitem" items = "${virus}">
        <tr>

            <td>${listitem.id}</td>
            <td>${listitem.name}</td>
            <td>${listitem.description}</td>
            <td>${listitem.symptoms}</td>
            <td>${listitem.duration}</td>
            <td>${listitem.mortalityrate}%</td>
            <td><img src="${listitem.getImageaddress()}"></td>
            <td></td>
        </tr>
    </c:forEach>

    <style>
        img{
            width: 80px;
            height: 80px;
        }
    </style>

</table>

</body>
</html>
