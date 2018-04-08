<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="br.com.academia.entity.Avaliacao"%>
<%@page import="java.util.Iterator"%>
<%@page import="br.com.academia.entity.Aluno"%>
<%@page import="java.util.Collection"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Avaliação</title>
</head>
	<jsp:include page="Cabecalho.jsp" />
<body>
	<%
		Avaliacao avaliacaoEdicao = (Avaliacao) request.getAttribute("avaliacaoEdicao");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	%>
	<div>
		<h1 class="h1" align="center">Avaliação do Aluno: <%=avaliacaoEdicao.getAluno().getNomeAluno() %> </h1>
		<br>
	</div>
		 
	<div class="row">
		<div class="col-md-2">
		</div>
			<form method="POST">
				<input type="hidden" id="nome" name="id" class="form-control" value="<%=avaliacaoEdicao.getIdAvaliacao()%>"/>
				<div class="col-md-4">
					<div class="form-group">
						<label for="numero">Avaliacao nº:</label>
						<input type="text" id="numero" name="numero"  readonly class="form-control" value="<%=avaliacaoEdicao.getIdAvaliacao()%>"/>
						<label for="data_aval">Data da Avaliação:</label>
						<input type="date" id="data_aval" name="data_aval" readonly class="form-control" value="<%=avaliacaoEdicao.getDataAvaliacao()%>"/>
						<label for="peso">Peso (kg):</label>
						<input type="text" id="peso" name="peso" class="form-control" value="<%=avaliacaoEdicao.getPesoAluno()%>"/>
						<label for="peitoral">Peitoral (cm):</label>
						<input type="text" id="peitoral" name="peitoral" class="form-control" value="<%=avaliacaoEdicao.getPeitoralAluno()%>"/>
						<label for="cintura">Cintura (cm):</label>
						<input type="text" id="cintura" name="cintura" class="form-control" value="<%=avaliacaoEdicao.getCinturaAluno()%>"/>
						<label for="coxa">Coxa (cm):</label>
						<input type="text" id="coxa" name="coxa" class="form-control" value="<%=avaliacaoEdicao.getCoxaAluno()%>"/>
					</div>
				</div>
				<div class="col-md-4">
					<div class="form-group">
						<input type="hidden" name="alunoid" value="<%=avaliacaoEdicao.getAluno().getIdAluno() %>"/>
						<label for="altura">Altura (cm):</label>
						<input type="text" id="altura" name="altura" class="form-control" value="<%=avaliacaoEdicao.getAlturaAluno()%>"/>
						<label for="biceps">Bíceps (cm):</label>
						<input type="text" id="biceps" name="biceps" class="form-control" value="<%=avaliacaoEdicao.getBicepsAluno()%>"/>
						<label for="quadril">Quadril (cm):</label>
						<input type="text" id="quadril" name="quadril" class="form-control" value="<%=avaliacaoEdicao.getQuadrilAluno()%>"/>
						<label for="pantu">Panturrilha (cm):</label>
						<input type="text" id="pantu" name="pantu" class="form-control" value="<%=avaliacaoEdicao.getPanturrilhaAluno()%>"/>
						
						
					</div>
					<div class="form-group" align="right">
						<a href="Index.jsp"><input type="submit" value="Cancelar" class="btn btn-primary btn-lg"></a>
						<input type="submit" value="Salvar" name="action" class="btn btn-primary btn-lg">
					
					</div>
			</div>
		</form>	
	</div>
	
	

</body>
</html>