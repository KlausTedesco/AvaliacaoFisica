package br.com.academia.controller;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
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
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		forwardToView(request,response);
	}

	protected void doPost( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html;charset=UTF-8");
		
		String usuarioLogado = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		
		Professor professor = new Professor();
		professor.setLoginProfessor(usuarioLogado);
		professor.setPasswordProfessor(senha);
		
		if(service.verificaProfessor(usuarioLogado, senha)){
			 
			HttpSession sessao = request.getSession();
			sessao.setAttribute("sessaoUsuario", usuarioLogado);
			request.setAttribute("usuarioLogado", usuarioLogado);
			response.sendRedirect("Index.jsp");
			forwardToView(request, response);
			
		}else{
			request.setAttribute("mensagem", usuarioLogado);
			response.sendRedirect("Login");
			forwardToView(request, response);
		}
		
		String action = request.getParameter("action");
		switch (action) {
		case "Cadastrar":
			response.sendRedirect("CadastroProfessor");
			break;
		default:
			break;
		}
	}
	
	private void forwardToView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/Login.jsp").forward(request, response);
	}
	
}
