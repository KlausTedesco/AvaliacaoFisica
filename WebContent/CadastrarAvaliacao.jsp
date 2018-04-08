<%@page import="java.text.DecimalFormat"%>
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
						<label for="peso">Peso (kg):</label>
						<input type="text" id="peso" name="peso" class="form-control" placeholder="em Quilogramas (kg)"/>
						<label for="peitoral">Peitoral (cm):</label>
						<input type="text" id="peitoral" name="peitoral" class="form-control" placeholder="em centímetros (cm)"/>
						<label for="cintura">Cintura (cm):</label>
						<input type="text" id="cintura" name="cintura" class="form-control" placeholder="em centímetros (cm)"/>
						<label for="coxa">Coxa (cm):</label>
						<input type="text" id="coxa" name="coxa" class="form-control" placeholder="em centímetros (cm)"/>
					</div>
				</div>
				<div class="col-md-4">
					<div class="form-group">
						<input type="hidden" name="alunoid" value="${param.id_grava}"/>
						<label for="altura">Altura (cm):</label>
						<input type="text" id="altura" name="altura" class="form-control" placeholder="em centímetros (cm)"/>
						<label for="biceps">Bíceps (cm):</label>
						<input type="text" id="biceps" name="biceps" class="form-control" placeholder="em centímetros (cm)"/>
						<label for="quadril">Quadril (cm):</label>
						<input type="text" id="quadril" name="quadril" class="form-control" placeholder="em centímetros (cm)"/>
						<label for="pantu">Panturrilha (cm):</label>
						<input type="text" id="pantu" name="pantu" class="form-control"" placeholder="em centímetros (cm)"/>
					</div>
					<div class="form-group" align="right">
						<a href="Index.jsp"><input type="button" value="Cancelar" class="btn btn-primary btn-lg"></a>
						<a href="Index.jsp"><input type="submit" value="Salvar" name="action" class="btn btn-primary btn-lg"></a>
					
					</div>
			</div>
		</form>	
	</div>
	
	

</body>
</html>