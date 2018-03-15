<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Cadastro</title>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
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
<body>
	<div class="jumbotron text-center" id="banner">
		<h1 id="titulo">Keep Fitness</h1>
	</div>
	<div class="row">
		<div class="col-md-2">
		</div>
		<div class="col-md-4">
			<form action="Aluno" method="post">
				<div class="form-group">
					<label for="nome">Nome</label>
					<input type="text" id="nome" name="nome" class="form-control">
					<label for="nome">CPF</label>
					<input type="text" id="curso" name="curso" class="form-control" placeholder="CPF">
					<label for="nome">Telefone</label>
					<input type="text" id="telefone" name="telefone" class="form-control">
				</div>
			</form>	
		</div>
		<div class="col-md-4">
			<form action="Aluno" method="post">
				<div class="form-group">
					<label for="nome">E-Mail</label>
					<input type="text" id="email" name="email" class="form-control">
					<label for="nome">Data de Nascimento</label>
					<input type="date" id="datanasc" name="datanasc" class="form-control">
				</div>
				<div class="form-group" align="right">
					<input type="submit" value="Cancelar" href="index.jsp" class="btn btn-primary btn-lg">
					<input type="submit" value="Salvar" class="btn btn-primary btn-lg">
				</div>
			</form>
		</div>
	</div>
</body>
</html>