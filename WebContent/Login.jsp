<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  	#banner {
  		background-image: url("img/fundo1.png");
  	}
  	#titulo {
  		color: #fff;
  		font-size: 80px;
  	}
  </style>
</head>



<body class="text-center">
    <div class="col-md-5">
	</div>
	<div class="col-md-2">
	    <form method="POST" class="form-signin">
	    	<br><br>
	    	<img class="mb-4" src="img/logo_KF.png" alt="" width="152" height="152">
	      	<h2 class="h2 mb-3 font-weight-normal">Fazer Login</h2>
	      	<br>
	      	<label for="nomeusuario" class="sr-only">E-Mail</label>
	     	<input type="text" name="usuario" id="nomeusuario" class="form-control" placeholder="Nome" required>
	     	<br>
	     	<label for="inputPassword" class="sr-only">Senha</label>
	      	<input type="password" name="senha" id="inputPassword" class="form-control" placeholder="Password" required>
	     	<div class="checkbox mb-3">
		       	<label>
		       		<input type="checkbox" value="remember-me"> Lembrar senha
		       	</label>
	      	</div>
	      	<br>
	      	<input type="submit" value="Entrar"  class="btn btn-lg btn-primary btn-block"/>
	      	<a href="CadastrarProfessor"><input type="button" value="Cadastre-se"  class="btn btn-lg btn-primary btn-block"/></a>
	      	<p class="mt-5 mb-3 text-muted">&copy; 2018</p>
	    </form>
	</div>
</body>
</html>