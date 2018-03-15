<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Login</title>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
</head>
<body class="text-center">
    <div class="col-md-4">
	</div>
	<div class="col-md-4">
	    <form class="form-signin">
	    	<br><br>
	    	<img class="mb-4" src="img/logo_KF.png" alt="" width="152" height="152">
	      	<h2 class="h2 mb-3 font-weight-normal">Fazer Login</h2>
	      	<br>
	      	<label for="inputEmail" class="sr-only">E-Mail</label>
	     	<input type="email" id="inputEmail" class="form-control" placeholder="Email address" required>
	     	<br>
	     	<label for="inputPassword" class="sr-only">Senha</label>
	      	<input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
	     	<div class="checkbox mb-3">
		       	<label>
		       		<input type="checkbox" value="remember-me"> Lembrar senha
		       	</label>
	      	</div>
	      	<br>
	      	<a class="btn btn-lg btn-primary btn-block" href="index.jsp" type="submit">Entrar</a>
	      	<p class="mt-5 mb-3 text-muted">&copy; 2018</p>
	    </form>
	</div>
</body>
</html>