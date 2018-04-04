<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro Professor</title>

</head>
	<jsp:include page="Cabecalho.jsp" />
	
<body>
		<div class="container">
			<form class="form-horizontal">
				<h1 align ="Center">Cadastro de Professores</h1>
				
					  <div class="form-group">
					    <label for="nome" class="col-sm-2 control-label">Nome</label>
						    <div class="col-sm-10">
						      <input type="text" class="form-control" id="nome" placeholder="Nome">
						    </div>
					  </div>
					  <div class="form-group">
					   	 <label for="Email" class="col-sm-2 control-label">Email</label>
						    <div class="col-sm-10">
						      <input type="email" class="form-control" id="email" placeholder="Email">
					  </div>
					  </div>
					  <div class="form-group">
					    <label for="senha" class="col-sm-2 control-label">Senha</label>
						    <div class="col-sm-10">
						      <input type="password" class="form-control" id="senha" placeholder="Senha">
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
				      <button type="submit" class="btn btn-success">Novo</button>
				      <button type="submit" class="btn btn-primary">Salvar</button>
				   	  <button type="submit" class="btn btn-danger">Excluir</button>
				   	  <br><br>
				   
				    	 <input type="text" class="form-control" id="pesquisa" placeholder="Digite o professor a pesquisar">
				 	 </div>
				 </div>
		</form>
		<table class="table table-striped">
				  <thead>
				    <tr>
				      <th scope="col">Codigo</th>
				      <th scope="col">Nome</th>
				      <th scope="col">Last</th>
				      <th scope="col">Handle</th>
				    </tr>
				  </thead>
				  <tbody>
				    <tr>
				      <th scope="row">1</th>
				      <td>Mark</td>
				      <td>Otto</td>
				      <td>@mdo</td>
				    </tr>
				    <tr>
				      <th scope="row">2</th>
				      <td>Jacob</td>
				      <td>Thornton</td>
				      <td>@fat</td>
				    </tr>
				    <tr>
				      <th scope="row">3</th>
				      <td>Larry</td>
				      <td>the Bird</td>
				      <td>@twitter</td>
				    </tr>
				  </tbody>
			</table>
		
		
		
		
	</div>
<body>

</body>
</html>