<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Djimmobilier examen JEE 2024</title>
  <link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body class="bg-white">
  <div class="container">
    <% if (1==1){ %>
      <div class="col-6 offset-3 mt-5 text-danger text-center h3">Connexion echouer</div>
    <% }
    %>
    <div class="card col-6 offset-3 mt-5 border border-1">
      <div class="card-header text-center h2 bg-light">Connexion</div>
      <div class="card-body">
        <form>
          <div class="mt-3">
            <label>Identifiant</label>
            <input class="form-control" placeholder="Identifiant">
          </div>
          <div class="mt-3">
            <label>Mot de passe</label>
            <input class="form-control" placeholder="Mot de passe">
          </div>
          <a href="hello-servlet" class="btn btn-success col-4 mt-3 offset-4">Se connecter</a>
        </form>
      </div>
    </div>
  </div>
</body>
</html>