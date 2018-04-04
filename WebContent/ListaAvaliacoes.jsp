<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Collection"%>
<%@page import ="java.text.SimpleDateFormat"%>
<%@page import="br.com.academia.entity.Avaliacao"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<<html>
<head>
	<title>Lista Avaliações</title>
</head>
	<jsp:include page="Cabecalho.jsp" />
	
<body>
		<div class="container">
			<h1 align="center">Avaliação dos Alunos</h1>
			<table class="table table-striped table-hover"">
				<% 
			Collection<Avaliacao> avaliacaoT = (Collection<Avaliacao>) request.getAttribute("avaliacoes");
		  if(!avaliacaoT.isEmpty()) {
			  %>
			  <thead>
			    <tr>
	      			<th scope="col">Registro:</th>
	     			<th scope="col">Avaliacao nº:</td>
					<th scope="col">Data:</td>
					<th scope="col">Peso:</td>
					<th scope="col">Peitoral:</td>
					<th scope="col">Cintura:</td>
					<th scope="col">Coxa:</td>
					<th scope="col">Altura:</td>
					<th scope="col">Quadril:</td>
					<th scope="col">Panturrilha:</td>
					<th scope="col"></td>
    			</tr>
 			 </thead>
 			 <%
				Iterator<Avaliacao> ita = avaliacaoT.iterator();
				Avaliacao avaliacao = new Avaliacao(); 
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
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
				
			
				<td>
					<form method="POST" action="listaAvaliacao">
						<input type="hidden" name="remove" value="<%=avaliacao.getIdAvaliacao() %>"/>
						<input type="submit" name="action"   class="btn btn-danger"  value="Excluir"/>
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