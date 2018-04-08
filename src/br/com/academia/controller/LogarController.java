package br.com.academia.controller;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.academia.entity.Professor;
import br.com.academia.service.ProfessorService;

@WebServlet("/Login")

public class LogarController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Inject
	
	private ProfessorService service;
       
    public LogarController() {
        super();
    }
    Object professorLogado = new Object();
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		forwardToView(request, response);
	}
    
	protected void doPost( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html;charset=UTF-8");
		
		String usuarioLogado = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		
		Professor professor = new Professor();
		professor.setLoginProfessor(usuarioLogado);
		professor.setPasswordProfessor(senha);
		
		if(service.verificaProfessor(usuarioLogado, senha)){
			professorLogado = service.carregarProfessor(usuarioLogado, senha);
			
			HttpSession sessao = request.getSession();
			sessao.setAttribute("sessaoUsuario", professorLogado);
			request.setAttribute("usuarioLogado", professorLogado);
			response.sendRedirect("Index.jsp");
			forwardToView(request, response);
			
		}else{
			request.setAttribute("mensagem", usuarioLogado);
			forwardToView(request, response);
		}
	}
	
	private void forwardToView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/Login.jsp").forward(request, response);
	}
	
}
