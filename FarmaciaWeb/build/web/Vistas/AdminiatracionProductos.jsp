<%-- 
    Document   : AdminiatracionProductos
    Created on : 20/08/2024, 10:39:58 AM
    Author     : SENA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>Yasbel Drugs - Administración de Productos</title>
          <link href="../CSS/Gestion.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
       <div class="container">
    <h1 class="title">Yasbel Drugs - Administración de Productos</h1>
    <div class="grid">
      <div class="form-section">
        <h2 class="subtitle">Agregar Nuevo Producto</h2>
        <div class="form-group">
          <label for="name">Nombre</label>
          <input id="name" name="name" type="text" placeholder="Nombre del Producto">
        </div>
        <div class="form-group">
          <label for="description">Descripción</label>
          <textarea id="description" name="description" placeholder="Descripción del Producto"></textarea>
        </div>
        <select id="category" name="category">
          <option value="" disabled selected>Selecciona una categoría</option>
          <option value="Categoria 1">Anti-pirectico</option>
          <option value="Categoria 2">Desinflamatorio</option>
          <option value="Categoria 3">Sales de Rehidratación</option>
          <option value="Categoria 4">Anti-Diarreica</option>
          <option value="Categoria 4">Sistema digestivo y Metabolico</option>
        </select>
        <div class="form-group">
          <label for="price" style="padding-top: 10px;">Stock</label>
          <input id="price" name="price" type="number" placeholder="Cantidad">
        </div>      
        <div class="form-group">
          <label for="price">Precio</label>
          <input id="price" name="price" type="number" placeholder="Precio del Producto">
        </div>
        <div class="form-group">
          <label for="imageUrl">URL de la Imagen</label>
          <input id="imageUrl" name="imageUrl" type="text" placeholder="URL de la Imagen">
        </div>
        <button class="button">Agregar Producto</button>
      </div>
      <div class="products-section">
        <h2 class="subtitle">Productos Existentes</h2>
        <div class="product-card">
          <div class="card-header">
            <h3 class="card-title">Panadol</h3>
          </div>
          <div class="card-content">
            <img src="../Imagenes/panadol-20s.png" style="width: 250px; height: 250px;" alt="Panadol" class="product-image">
            <p>Analgésico para el dolor de cabeza</p>
            <div class="card-footer">
              <span class="price">$5.999</span>
              <button class="button small">Editar</button>
            </div>
          </div>
        </div>
        <!-- Repeat similar blocks for other products -->
      </div>
    </div>
  </div> 
    </body>
</html>
