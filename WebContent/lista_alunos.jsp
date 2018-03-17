<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="com.ktedesco.entity.Aluno" %>
<%@ @WebServlet("/Lista_Alunos") %>
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

	<% 
	
	Collection<Aluno> alunos = (Collection<Aluno>) request.getAttribute("aluno");
	if(!alunos.isEmpty()){
	%>
	<table>
		<tr>
			<td>Nome</td>
			<td>CPF</td>
			<td>Telefone</td>
			<td>Email</td>
			<td>Data Nascimento</td>
		</tr>
		<%
		Iterator<Aluno> it = alunos.iterator();
		while(it.hasNext()){
			Aluno aluno = it.next();
			%>
			
		<tr>
			<td><%=aluno.getNomeAluno()%> </td>
			<td><%=aluno.getCpfAluno()%> </td>
			<td><%=aluno.getTelefoneAluno()%> </td>
			<td><%=aluno.getEmailAluno()%> </td>
			<td><%=aluno.getDataNascimento()%> </td>
			<td>
				<form method="POST">
					<input type="hidden" name="idAluno" value="<%=aluno.getIdAluno()%>"/>
					<input type="hidden" name="nomeAluno" value="<%=aluno.getNomeAluno()%>"/>
					<input type="hidden" name="cpfAluno" value="<%=aluno.getCpfAluno()%>"/>
					<input type="hidden" name="telefoneAluno" value="<%=aluno.getTelefoneAluno()%>"/>
					<input type="hidden" name="emailAluno" value="<%=aluno.getEmailAluno()%>"/>
					<input type="hidden" name="datanascAluno" value="<%=aluno.getDataNascimento()%>"/>
					<input type="submit" name="action" value="Excluir"/>
				</form>
			</td>
		</tr>
		
			<%
		}
		%>
	</table>
	<%
	}
	%>
	
</body>
</html>