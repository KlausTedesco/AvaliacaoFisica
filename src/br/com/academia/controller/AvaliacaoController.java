package br.com.academia.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.academia.entity.Aluno;
import br.com.academia.entity.Avaliacao;
import br.com.academia.service.AvaliacaoService;


@WebServlet("/Avaliacao")
public class AvaliacaoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@Inject
	private AvaliacaoService service;
	
    public AvaliacaoController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		forwardToView(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		switch (action) {
		case "Salvar":
			SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd");
			
			Integer numeroAvaliacao = Integer.parseInt(request.getParameter("numero"));
			Date dataAvaliacao = null;
			try {
				dataAvaliacao = sdf.parse(request.getParameter("data_aval"));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			Double pesoAluno = Double.parseDouble(request.getParameter("peso"));
			Double peitoralAluno= Double.parseDouble(request.getParameter("peitoral"));
			Double cinturaAluno= Double.parseDouble(request.getParameter("cintura"));
			Double coxaAluno= Double.parseDouble(request.getParameter("coxa"));
			Double alturaAluno= Double.parseDouble(request.getParameter("altura"));
			Double bicepsAluno= Double.parseDouble(request.getParameter("biceps"));
			Double quadrilAluno= Double.parseDouble(request.getParameter("quadril"));
			Double panturrilhaAluno= Double.parseDouble(request.getParameter("pantu"));
			
			Avaliacao A = new Avaliacao(numeroAvaliacao, dataAvaliacao, pesoAluno, peitoralAluno, cinturaAluno, coxaAluno, alturaAluno, bicepsAluno, quadrilAluno, panturrilhaAluno);
			
			int atua = Integer.parseInt(request.getParameter("alunoid"));
			System.out.println(action);
			Aluno aluno = service.carregarAluno(atua);
			
			A.setAluno(aluno);
			aluno.addAvaliacao(A);
			service.persistAv(A);
			
			break;

		default:
			break;
		}
		
		forwardToView(request, response);
		
	}

	private void forwardToView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("Avaliacoes", service.getAvaliacao());
		request.getRequestDispatcher("/Avaliacao.jsp").forward(request, response);
		
	}
	
}
