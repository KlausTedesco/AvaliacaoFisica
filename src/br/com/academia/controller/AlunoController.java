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
import br.com.academia.entity.Professor;
import br.com.academia.service.AlunoService;

@WebServlet("/Cadastro")
public class AlunoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private AlunoService service;

    public AlunoController() {
        super();  
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		forwardToView(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		switch (action) {
		case "Gravar":
			SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd");
			
			String nomeAluno = request.getParameter("nome");
			String cpfAluno = request.getParameter("cpf");
			Date dataNascimento = null;
			try {
				dataNascimento = sdf.parse(request.getParameter("datanasc"));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			String telefoneAluno = request.getParameter("telefone");
			String emailAluno = request.getParameter("email");
			
			Aluno aluno = new Aluno(nomeAluno, cpfAluno, dataNascimento, telefoneAluno, emailAluno);
		
			
			service.atualiza(aluno);
			
			break;
		case "Excluir":
			service.remove(Integer.parseInt(request.getParameter("remove")));
			break;
		case "Editar":
			Integer carregarAluno = Integer.parseInt(request.getParameter("id_Edita"));
			
			Aluno alunoEdicao = service.carregarAluno(carregarAluno);
			
			request.setAttribute("alunoEdicao", alunoEdicao);
			request.getRequestDispatcher("EditaAluno.jsp").forward(request, response);
			
			break;
		default:
			break;
		}
		
		forwardToView(request,response);
	}
	
	private void forwardToView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("alunos", service.getAluno());
		request.getRequestDispatcher("/Cadastro_Aluno.jsp").forward(request, response);
	}
	
	
}














