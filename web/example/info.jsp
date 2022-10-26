

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
               <style> body {
  background-color:#2BB465;
}
</style>
    <body>
        <h1>Detalle Cliente</h1>
        <p>Nombre: <s:property value="Nombre"/> </p><br>
        <p>Calle y Numero: <s:property value="CC"/> </p><br>
        <p>Colonia: <s:property value="Colonia"/> </p><br>
        <p>Ciudad: <s:property value="Ciudad"/> </p><br>
        <p>Telefono: <s:property value="Telefono"/> </p><br>
        <p>Tamano: <s:property value="tam"/> </p><br>
        <p>Cantidad: <s:property value="Cantidad"/> </p><br>

<button onclick="location.href='example/Detalle.jsp'">Detalle</button><br>    
    </body>
</html>
