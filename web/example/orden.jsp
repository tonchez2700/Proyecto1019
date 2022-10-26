

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
  <form action="AGREGAR1" method="post">
      <h1>Datos Cliente</h1>
      Nombre:<imput type="text" name="Nombre"/><br>
       <input type="text" name="Nombre1"/>
      <br>
      Calle y Numero:<imput type="text" name="CC"/><br>
       <input type="text" name="CC1"/>
       <br>
      Colonia:<imput type="text" name="Colonia"/><br>
       <input type="text" name="Colonia1"/>
           <br>
      Ciudad<imput type="text" name="Ciudad"/><br>
       <input type="text" name="Ciudad1"/>
                <br>
     Telefono:<imput type="text" name="Telefono"/><br>
      <input type="text" name="Telefono1"/>
                        <br>
      Tamano:<select name="Tam"><br>
          <option value="10cm">10 cm</option><br>
          <br>
       <option value="14cm">14 cm</option><br>
    
       </select>
      
   <br>   Cantidad: <imput type="text" name="Cantidad"/><br>
    <input type="text" name="Cantidad1"/>
   <br>
      <input type="submit" name="Ordenar">
  </form>
        
    </body>
</html>
