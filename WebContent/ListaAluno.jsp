<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.academia.entity.Aluno" %>
<%@page import="br.com.academia.entity.Avaliacao"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Collection"%>
<%@page import ="java.text.SimpleDateFormat"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Lista Alunos</title>
</head>
	<jsp:include page="Cabecalho.jsp" />
	
<body>
	<div class="container">
		<h1 align="center" >Alunos Cadastrados</h1>	
			<table class="table table-striped table-hover">
			<% 
		   Collection<Aluno> AlunoT = (Collection<Aluno>) request.getAttribute("alunos");
		  if(!AlunoT.isEmpty()) {
			  %>
			  <thead>
			    <tr>
			    <th scope="col">Código:</td>
			    <th scope="col">Nome:</td>
				<th scope="col">Cpf:</td>
				<th scope="col">Telefone:</td>
				<th scope="col">E-mail:</td>
				<th scope="col">Data Nascimento:</td>
				
			    </tr>
			  </thead>
			  <%
				Iterator<Aluno> ita = AlunoT.iterator();
				Aluno alunoNome = new Aluno(); 
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				while(ita.hasNext()){
						alunoNome = ita.next(); 
						
			%>
			 <!--  <tbody> -->
			 <tr>
			 	<th scope="row"><%=alunoNome.getIdAluno()%></td>
				<td><%=alunoNome.getNomeAluno()%></td>
				<td><%=alunoNome.getCpfAluno()%></td>
				<td><%=alunoNome.getTelefoneAluno()%></td>
				<td><%=alunoNome.getEmailAluno()%></td>
				<td><%=sdf.format(alunoNome.getDataNascimento())%></td>
				
				<td>
					<form method="POST" action="Avaliacao">
						<input type="hidden" name="nomeS" value="<%=alunoNome.getNomeAluno() %>"/>
						<input type="hidden" name="id_grava" value="<%=alunoNome.getIdAluno() %>"/>
						<input type="submit" name="action"  class="btn btn-priomary" value="Avaliar"/>
					</form>
					
				</td>
				<td>
					<form method="POST" action="Cadastro">
						<input type="hidden" name="id_Edita" value="<%=alunoNome.getIdAluno() %>"/>
						<input type="submit" name="action" class="btn btn-success"value="Editar"/>
					</form>
					
				</td>
				<td>
					<form method="POST" action="Cadastro">
						<input type="hidden" name="remove" value="<%=alunoNome.getIdAluno() %>"/>
						<input type="submit" value="Editar" name="action"  class="btn btn-danger" value="Excluir"/>
					</form>
					
				</td>
			</tr>
		<%			
				}
		%>
		 </table>
	  <% } %>
	</div>
</body>
</html>