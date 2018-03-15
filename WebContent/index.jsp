<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Home</title>
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
<body">
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
			        <span class="icon-bar"></span>
			        <span class="icon-bar"></span>
			        <span class="icon-bar"></span>
     			</button>
     		</div>
     		<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
			    	<li><a></a></li>
			        <li class="dropdown">
			        	<a class="dropdown-toggle" data-toggle="dropdown" href="#">Alunos<span class="caret"></span></a>
			          	<ul class="dropdown-menu">
			            	<li><a href="cadastro_aluno.jsp">Cadastrar Aluno</a></li>
			            	<li><a href="relatorio_do_Klaus">Todos os Alunos</a></li>
			          	</ul>
			        </li>
			        <li><a href="#">Fichas</a></li>
			        <li><a href="#">Graficos</a></li>
			    </ul>
			    <ul class="nav navbar-nav navbar-right">
			    	<li><a href="login.jsp"><span class="glyphicon glyphicon-user"></span> Sair</a></li>
			    	<li><a></a></li>
			    </ul>
   			</div>
		</div>
	</nav>
	<div class="jumbotron text-center" id="banner">
		<h1 id="titulo">Keep Fitness</h1>
	</div>
	<!-- Início da Home -->
	<div class="container">
		<div class="panel panel-default">
			<div class="panel-body">
				<div class="row">
					<div class="col-md-12">
						<div>
							<h1>Atendimento</h1>
							<br><br>	
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<br>
						<input type="submit" value="Meus Atendimentos" class="btn btn-primary">
						<input type="submit" value="+ Novo Atendimento" class="btn btn-success">
						<br><br><br>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>