<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Collection"%>
<%@page import ="java.text.SimpleDateFormat"%>
<%@page import="br.com.academia.entity.Avaliacao"%>
<%@page import="java.text.DecimalFormat"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<<html>
<head>
	<title>Lista Avaliações</title>
</head>
	<jsp:include page="Cabecalho.jsp" />
	
<body>

		<div class="container">
			
			<table class="table table-striped table-hover"">
				<% 
			Collection<Avaliacao> avaliacaoT = (Collection<Avaliacao>) request.getAttribute("avaliacoes");
		  if(!avaliacaoT.isEmpty()) {

			  %>
			  <h1 align="center">Avaliação dos Alunos</h1>
			  <thead>
			    <tr>
	      			<th scope="col">Registro:</th>
	     			<th scope="col">Avaliacao nº:</td>
					<th scope="col">Data da Avaliação:</td>
					<th scope="col">Peso:</td>
					<th scope="col">Peitoral:</td>
					<th scope="col">Cintura:</td>
					<th scope="col">Coxa:</td>
					<th scope="col">Altura:</td>
					<th scope="col">Quadril:</td>
					<th scope="col">Panturrilha:</td>
					<th scope="col">Imc:</td>
					<th scope="col"></td>
    			</tr>
 			 </thead>
 			 <%
				Iterator<Avaliacao> ita = avaliacaoT.iterator();
				Avaliacao avaliacao = new Avaliacao(); 
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				DecimalFormat df = new DecimalFormat ("0.00");
				while(ita.hasNext()){
						avaliacao = ita.next(); 
			%>
 			 
<!--   <tbody> -->
			  
			  <tr>
				<th scope="row"><%=avaliacao.getIdAvaliacao()%></td>
				<td><%=avaliacao.getNumeroAvaliacao()%></td>
				<td><%=sdf.format(avaliacao.getDataAvaliacao())%></td>
				<td><%=avaliacao.getPesoAluno()%></td>
				<td><%=avaliacao.getPeitoralAluno()%></td>
				<td><%=avaliacao.getCinturaAluno()%></td>
				<td><%=avaliacao.getCoxaAluno()%></td>
				<td><%=avaliacao.getAlturaAluno()%></td>
				<td><%=avaliacao.getQuadrilAluno()%></td>
				<td><%=avaliacao.getPanturrilhaAluno()%></td>
				<td><%=df.format(avaliacao.getImc())%></td>
				
			
				<td>
					<form method="POST">
						<input type="hidden" name="remove" value="<%=avaliacao.getIdAvaliacao() %>"/>
						<input type="submit" value="Excluir" name="action"   class="btn btn-danger"/>
					</form>
				</td>
				<td>
					<form method="POST">
						<input type="hidden" name="id_Edita" value="<%=avaliacao.getIdAvaliacao() %>"/>
						<a href="EditarAvaliacao"><input type="submit" name="action" class="btn btn-success"value="Editar"/></a>
					</form>
				</td>
			</tr>
		<%			
				}
		%>
		 </table>
		
	  <% }else{ %>
	  	<h1 align="center">Nenhuma Avaliação!</h1>
	  <%} %>
	
</div>

</body>
</html>