<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="br.com.academia.entity.Professor"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
	<jsp:include page="Cabecalho.jsp" />

<body>
	
	<!-- Início da Home -->
	<div class="container">
		<div class="panel panel-default">
			<div class="panel-body">
				<div class="row">
					<div class="col-md-12">
						<div><%
							Professor professor = (Professor) session.getAttribute("sessaoUsuario");
							 %>
							<h1>Atendimentos: <%=professor.getNome() %></h1>
							<br><br>	
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						
						<br>
						<a href=listarAvaliacao><input type="submit" value="Meus Atendimentos" class="btn btn-primary"></a>
						<a href=CadastrarAluno><input type="submit" value="+ Novo Atendimento" class="btn btn-success"></a>
						<br><br><br>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>