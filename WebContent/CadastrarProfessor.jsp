<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Cadastro Professor</title>
</head>
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
		<div class="jumbotron text-center" id="banner">
			<h1 id="titulo">Keep Fitness</h1>
		
		</div>
	
<body>
		<div class="container">
			
				<h1 align ="Center">Cadastro de Professores</h1>
				<form method="POST"  class="form-horizontal">
					  <div class="form-group">
					    <label for="nome" class="col-sm-2 control-label">Nome</label>
						    <div class="col-sm-10">
						      <input type="text" class="form-control" name ="nome" id="nome" placeholder="Nome">
						    </div>
					  </div>
					  <div class="form-group">
					   	 <label for="Email" class="col-sm-2 control-label">Email</label>
						    <div class="col-sm-10">
						      <input type="email" class="form-control" name ="email"  id="email" placeholder="Email">
						      </div>
					  </div>
					   <div class="form-group">
					   	 <label for="User" class="col-sm-2 control-label">Usuario</label>
						    <div class="col-sm-10">
						      <input type="text" class="form-control" name ="user" id="user" placeholder="Usuário">
					  		</div>
					  </div>
					  <div class="form-group">
					    <label for="senha" class="col-sm-2 control-label">Senha</label>
						    <div class="col-sm-10">
						      <input type="password" class="form-control" name ="senha"  id="senha" placeholder="Senha">
						    </div>
					  </div>
					  <div class="form-group">
					    <label for="matricula" class="col-sm-2 control-label">Matricula</label>
						    <div class="col-sm-10">
						      <input type="text" class="form-control" id="matricula" placeholder="Matricula">
						    </div>
					  </div>
				  <div class="form-group">
				    <div class="col-sm-offset-2 col-sm-10">
				     <button type="submit" value="salvar" name="action" class="btn btn-primary">Salvar</button>
				   	  <a href="Login"><button type="submit" value="excluir" name="action" class="btn btn-danger">Cancelar</button></a>
				   
				   	  <br><br>
				   
				    	 
				 	 </div>
				 </div>
		</form>
	</div>
<body>

</body>
</html>