<%-- 
    Document   : agregar
    Created on : 27/01/2021, 04:13:25 PM
    Author     : escob
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <title> --Mi Monedero-- </title>
    </head>

    <body>
        <div class="container mt-4 col-lg-4">


            <form method="POST">
                <div class="input-group mb-3">
                    <div class="input-group-prepend">
                        <span class="input-group-text">COP</span>
                        <span class="input-group-text">
                            <select class="custom-select" name="denominacion">
                                <option value="50">50</option>
                                <option value="100">100</option>
                                <option value="200">200</option>
                                <option value="500">500</option>
                                <option value="1000">1.000</option>
                            </select></span>
                    </div>
                    <input type="text" class="form-control" name="cantidad">
                </div>
                <input type="submit" value="Agregar" class="btn btn-success">
            </form>
            
            <div class="row mt-4">
                <div class="col-md-12">
                    <table border="1" class="table">
                        <thead>
                            <tr>
                                <th scope="col">Denominacion</th>
                                <th scope="col">Acciones</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>50</td>
                                <td>
                                    <a class="btn btn-primary" href="estadisticas.htm?id=50">Cantidades</a>
                                    <a class="btn btn-primary" href="acumulado.htm?id=50">Acumulado</a>
                                </td>
                            </tr>
                        <td>100</td>
                        <td>
                            <a class="btn btn-primary" href="estadisticas.htm?id=100">Cantidades</a>
                            <a class="btn btn-primary" href="acumulado.htm?id=100">Acumulado</a>
                        </td>
                        </tr>
                        <td>200</td>
                        <td>
                            <a class="btn btn-primary" href="estadisticas.htm?id=200">Cantidades</a>
                            <a class="btn btn-primary" href="acumulado.htm?id=200">Acumulado</a>
                        </td>
                        </tr>
                        <td>500</td>
                        <td>
                            <a class="btn btn-primary" href="estadisticas.htm?id=500">Cantidades</a>
                            <a class="btn btn-primary" href="acumulado.htm?id=500">Acumulado</a>
                        </td>
                        </tr>
                        <td>1000</td>
                        <td>
                            <a class="btn btn-primary" href="estadisticas.htm?id=1000">Cantidades</a>
                            <a class="btn btn-primary" href="acumulado.htm?id=1000">Acumulado</a>
                        </td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>

        </div>

    </body>
</html>
