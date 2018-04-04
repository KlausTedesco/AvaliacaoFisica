package br.com.academia.controller;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.academia.service.AlunoService;


@WebServlet("/listar_Aluno")
public class ListaAlunoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private AlunoService service;
   
    public ListaAlunoController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		forwardToView(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		switch (action) {
	case "Excluir":
		service.remove(Integer.parseInt(request.getParameter("remove")));
		break;
		}
		forwardToView(request, response);
	}

	private void forwardToView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("alunos", service.getAluno());
		request.getRequestDispatcher("/Lista_Aluno.jsp").forward(request, response);
	}
}
