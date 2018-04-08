<%@ page info="Cadastro_Aluno" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Collection"%>
<%@page import="java.util.List "%>
<%@page import="java.util.Iterator"%>
<%@ page import="br.com.academia.entity.Aluno" %>
<%@ page import="br.com.academia.entity.Avaliacao" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Cadastro de Alunos</title>
</head>

	 <jsp:include page="Cabecalho.jsp" /> 
	
<body>
	 <div class="row">
		<div class="col-md-2">
		</div>
		<div>
			<form action="${pageContext.request.contextPath}/AlunoController" method="POST">
				<div class="col-md-4">
					<div class="form-group">
						<label for="nome">Nome</label>
						<input type="text" id="nome" name="nome" class="form-control"/>
						<label for="nome">CPF</label>
						<input type="text" id="cpf" name="cpf" class="form-control" placeholder="CPF"/>
						<label for="nome">Telefone</label>
						<input type="text" id="telefone" name="telefone" class="form-control"/>
					</div>
				</div>
				<div class="col-md-4">
					<div class="form-group">
						<label for="email">E-Mail</label>
						<input type="text" id="email" name="email" class="form-control"/>
						<label for="datanasc">Data de Nascimento</label>
						<input type="date" id="datanasc" name="datanasc" class="form-control"/>
					</div>
					<div class="form-group" align="right">						
						<input type="submit" value="Cancelar" href="Index.jsp" class="btn btn-primary btn-lg"/>
						<input type="submit" value="Gravar" name="action" class="btn btn-primary btn-lg"/>
						
					</div>
				</div>
			</form>
		</div>
	</div>

</html>