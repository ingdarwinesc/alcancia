<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <title> --Mi Monedero-- </title>
    </head>

    <body>
         <div class="container mt-4">
                <div class="row w-50 p-3" style="background-color: #eee;">
                    <div class="row col-md-12">
                        <form method="POST" action="index.htm">
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
                            <a class="btn btn-primary" href="ahorrado.htm">Ahorro total</a>
                        </form>
                        
                    </div>
                    <div class="w-75 p-3 col-md-12" style="background-color: #eee;">

                        <table border="1" class="table table-striped">
                            <thead>
                                <tr>
                                    <th scope="col" style="align-content: center">Denominacion</th>
                                    <th scope="col" style="align-content: center">Acciones</th>
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
