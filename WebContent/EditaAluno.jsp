<%@ page info="Cadastro_Aluno" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Collection"%>
<%@page import="java.util.List "%>
<%@page import="java.util.Iterator"%>
<%@ page import="br.com.academia.entity.Aluno" %>
<%@ page import="br.com.academia.entity.Avaliacao" %>
<%@page import ="java.text.SimpleDateFormat"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Cadastro de Alunos</title>
</head>

	 <jsp:include page="Cabecalho.jsp" /> 
	
<body>
	<% 
	Aluno alunoEdicao = (Aluno) request.getAttribute("alunoEdicao"); 
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			%>
	 <div class="row">
		<div class="col-md-2">
		</div>
		<div>
			<form method="POST">
				<input type="hidden" id="nome" name="id" class="form-control" value="<%=alunoEdicao.getIdAluno()%>"/>
			
				<div class="col-md-4">
					<div class="form-group">
						<label for="nome">Nome</label>
						<input type="text" id="nome" name="nome" class="form-control" value="<%=alunoEdicao.getNomeAluno()%>"/>
						<label for="nome">CPF</label>
						<input type="text" id="cpf" name="cpf" class="form-control" value="<%=alunoEdicao.getCpfAluno()%>"/>
						<label for="nome">Telefone</label>
						<input type="text" name="telefone"class="form-control" value="<%=alunoEdicao.getTelefoneAluno()%>"/>
					</div>
				</div>
				<div class="col-md-4">
					<div class="form-group">
						<label for="email">E-Mail</label>
						<input type="text" id="email" name="email" class="form-control" value="<%=alunoEdicao.getEmailAluno()%>"/>
						<label for="datanasc">Data de Nascimento</label>
						<input type="date" id="datanasc" name="datanasc" class="form-control" value="<%=sdf.format(alunoEdicao.getDataNascimento())%>"/>
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