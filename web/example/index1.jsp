

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
                                   <svg width="500%" height="500%">
   <rect width="11%" height="100%" fill=#B44A2B />
    <text x="625" y="100" font-family="Verdana" font-size="75"
          fill=#FFFFFF stroke=#FFFFFF stroke-width="2">
                      PIZZA CAGLIARI
    </text>

  </svg>
        <style type="text/css">
 
  .boton_1{
    text-decoration: none;
    padding: 3px;
    padding-left: 10px;
    padding-right: 10px;
    font-family: helvetica;
    font-weight: 300;
    font-size: 25px;
    font-style: italic;
    color: #ffffff;
    background-color: #FF1207;
    border-radius: 15px;
    border: 3px double #006505;
  }
  .boton_1:hover{
    opacity: 0.6;
    text-decoration: none;
  }
</style>
        <h1>ADMIN</h1>
        <button onclick="location.href='example/admin.jsp'"class="boton_1">Admin</button><br>      
        <style> body {
  background-color:#2BB465;
}
</style>
        <style>
        div.gallery {
  margin: 5px;
  border: 1px solid #ccc;
  float: left;
  width: 180px;
}

div.gallery:hover {
  border: 1px solid #777;
}

div.gallery img {
  width: 100%;
  height: auto;
}

div.desc {
  padding: 15px;
  text-align: center;
}
</style>
<div class="gallery">
  <a target="_self" href='example/orden.jsp'>
      
    <img src="Fotos/HAW.jpg" alt="Hawaiana" width="600" height="400">
  </a>
  <div class="desc">Pina, jamon, queso provolone</div>
</div>

<div class="gallery">
  <a target="_self" href='example/orden.jsp'>
    <img src="Fotos/Pepperoni.jpg" alt="Pepperoni" width="600" height="400">
  </a>
  <div class="desc">Queso, Pepperoni</div>
</div>

<div class="gallery">
  <a target="_self" href='example/orden.jsp'>
    <img src="Fotos/mexicana.jpg" alt="Mexicana" width="600" height="400">
  </a>
  <div class="desc">Chorizo, jamon, morron, cebolla, queso</div>
</div>

<div class="gallery">
  <a target="_self" href='example/orden.jsp'>
    <img src="Fotos/mex.jpg" alt="Mountains" width="600" height="400">
  </a>
  <div class="desc">Aguacate, jalapenos, queso, carne</div>
</div>
    <div class="gallery">
  <a target="_self" href='APS.jsp'>
    
  </a>
  <div class='APS.jsp'>            </div>
</div>    
    </body>
</html>
