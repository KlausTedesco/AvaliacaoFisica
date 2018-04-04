<%@page import="java.util.Iterator"%>
<%@page import="br.com.academia.entity.Aluno"%>
<%@page import="java.util.Collection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Avaliação</title>
</head>
	<jsp:include page="Cabecalho.jsp" />
<body>
	
	<div>
		<h1 class="h1" align="center">Avaliação do Aluno: ${param.nomeS} </h1>
		<br>
	</div>
		 
	<div class="row">
		<div class="col-md-2">
		</div>
			<form method="POST" action="">
				<div class="col-md-4">
					<div class="form-group">
						<label for="numero">Avaliacao nº:</label>
						<input type="text" id="numero" name="numero" class="form-control">
						<label for="data_aval">Data da Avaliação:</label>
						<input type="date" id="data_aval" name="data_aval" class="form-control">
						<label for="peso">Peso:</label>
						<input type="text" id="peso" name="peso" class="form-control">
						<label for="peitoral">Peitoral:</label>
						<input type="text" id="peitoral" name="peitoral" class="form-control">
						<label for="cintura">Cintura:</label>
						<input type="text" id="cintura" name="cintura" class="form-control">
						<label for="coxa">Coxa:</label>
						<input type="text" id="coxa" name="coxa" class="form-control">
					</div>
				</div>
				<div class="col-md-4">
					<div class="form-group">
						<input type="hidden" name="alunoid" value="${param.id_grava}"/>
						<label for="altura">Altura:</label>
						<input type="text" id="altura" name="altura" class="form-control">
						<label for="biceps">Bíceps:</label>
						<input type="text" id="biceps" name="biceps" class="form-control">
						<label for="quadril">Quadril:</label>
						<input type="text" id="quadril" name="quadril" class="form-control">
						<label for="pantu">Panturrilha:</label>
						<input type="text" id="pantu" name="pantu" class="form-control">
					</div>
					<div class="form-group" align="right">
						<input type="submit" value="Cancelar" href="Index.jsp" class="btn btn-primary btn-lg">
						<input type="submit" value="Salvar" name="action" class="btn btn-primary btn-lg">
					
					</div>
			</div>
		</form>	
	</div>
	
	

</body>
</html>