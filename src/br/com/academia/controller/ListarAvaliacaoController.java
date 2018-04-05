package br.com.academia.controller;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.academia.service.AvaliacaoService;

/**
 * Servlet implementation class listarAvaliacaoController
 */
@WebServlet("/listarAvaliacao")
public class ListarAvaliacaoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@Inject
	private AvaliacaoService service;
	
     public ListarAvaliacaoController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		forwardToView(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		forwardToView(request, response);
	}
	private void forwardToView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("avaliacoes", service.getAvaliacao());
		request.getRequestDispatcher("/ListaAvaliacoes.jsp").forward(request, response);
	}
}
