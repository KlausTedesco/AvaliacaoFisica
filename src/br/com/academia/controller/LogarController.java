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

@WebServlet("/LogarU")
public class LogarController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Inject
	private ProfessorService service;
       
    public LogarController() {
        super();
    }

	protected void doPost( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html;charset=UTF-8");
		
		String usuarioLogado = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		
		Professor professor = new Professor();
		professor.setLoginProfessor(usuarioLogado);
		professor.setPasswordProfessor(senha);
		RequestDispatcher rd = null;
		
		if(service.verificaProfessor(usuarioLogado, senha)){
			 
			HttpSession sessao = request.getSession();
			sessao.setAttribute("sessaoUsuario", usuarioLogado);
			request.setAttribute("usuarioLogado", usuarioLogado);
			rd = request.getRequestDispatcher("/Index.jsp");
			rd.forward(request, response);
			
			
		}else{
			System.out.println("passeio aqui ");
			request.setAttribute("mensagem", usuarioLogado);
			rd = request.getRequestDispatcher("CadastroProfessor.jsp");
			rd.forward(request, response);
		}
	}
	
	
}
