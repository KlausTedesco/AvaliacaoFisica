<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Medidas</title>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<style>
  	#banner {
  		background-image: url("img/fundo1.png");
  	}
  	#titulo {
  		color: #fff;
  		font-size: 100px;
  	}
 	</style>
</head>
<body>
	<div class="jumbotron text-center" id="banner">
		<h1 id="titulo">Keep Fitness</h1>
	</div>
	<div>
		<h1 class="h1" align="center">Medidas do aluno</h1>
		<br>
	</div>
	<div class="row">
		<div class="col-md-2">
		</div>
		<div class="col-md-4">
			<form action="Medidas1" method="post">
				<div class="form-group">
					<label for="peso">Peso</label>
					<input type="text" id="peso" name="peso" class="form-control">
					<label for="peitoral">Peitoral</label>
					<input type="text" id="peitoral" name="peitoral" class="form-control">
					<label for="cintura">Cintura</label>
					<input type="text" id="cintura" name="cintura" class="form-control">
					<label for="coxa">Coxa</label>
					<input type="text" id="coxa" name="coxa" class="form-control">
				</div>
			</form>	
		</div>
		<div class="col-md-4">
			<form action="Medidas2" method="post">
				<div class="form-group">
					<label for="altura">Altura</label>
					<input type="text" id="altura" name="altura" class="form-control">
					<label for="biceps">Bíceps</label>
					<input type="text" id="biceps" name="biceps" class="form-control">
					<label for="quadril">Quadril</label>
					<input type="text" id="quadril" name="quadril" class="form-control">
					<label for="pantu">Panturrilha</label>
					<input type="text" id="pantu" name="pantu" class="form-control">
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