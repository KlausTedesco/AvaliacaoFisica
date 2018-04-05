package br.com.academia.controller;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.academia.entity.Professor;
import br.com.academia.service.ProfessorService;

@WebServlet("/CadastroProfessor")
public class ProfessorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ProfessorService service;
       
    public ProfessorController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		forwardToView(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		switch (action) {
		case "salvar":
			System.out.println("Aqui é pra salvar o professor");
			String nome = request.getParameter("nome");
			String email = request.getParameter("email");
			String loginProfessor = request.getParameter("user");
			String passwordProfessor = request.getParameter("senha");
			Professor professor = new Professor(nome, email, loginProfessor, passwordProfessor);
			service.persist(professor);
			break;
		default:
			break;
		}
			forwardToView(request, response);
		}
	private void forwardToView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.getRequestDispatcher("Login.jsp").forward(request, response);
	}
}
