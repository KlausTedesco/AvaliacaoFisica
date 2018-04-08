package br.com.academia.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.academia.entity.Aluno;
import br.com.academia.entity.Professor;
import br.com.academia.service.AlunoService;

@WebServlet("/CadastrarAluno")

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
			
			int idProfessor = Integer.parseInt(request.getParameter("id_prof"));
			String nomeAluno = request.getParameter("nome");
			Date dataNascimento = null;
			try {
				dataNascimento = sdf.parse(request.getParameter("datanasc"));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			String cpfAluno = request.getParameter("cpf");
			String telefoneAluno = request.getParameter("telefone");
			String emailAluno = request.getParameter("email");
			
			/*if (!cpfAluno(false)) {
		        throw new ValidatorException(new FacesMessage("CPF inválido!"));
		    }
			*/
			if (!telefoneAluno.matches("^\\([1-9][0-9]\\)[0-9]{4,5}-[0-9]{4}$")) {
		        throw new ValidatorException(new FacesMessage("Telefone inválido!"));
		    }
			/*if (!emailAluno(false)) {
		        throw new ValidatorException(new FacesMessage("Email inválido!"));
		    }
			break;
			*/
			
			// Não salvar, se tiver erros. Mostrar todos erros no final (quando clicar em salvar) dar um break e não continuar (a partir daqui)   
	
			Professor professor = new Professor();
			professor.setIdProfessor(idProfessor);
			
			Aluno aluno = new Aluno(nomeAluno, cpfAluno, dataNascimento, telefoneAluno, emailAluno);
			aluno.setProfessor(professor);
			professor.addListaAluno(aluno);
			
			String id = request.getParameter("id");
			if (id != null && id.matches("^[0-9]+$")){
				aluno.setIdAluno(Integer.parseInt(id));
			}
			
			service.atualiza(aluno);
				
			break;
		case "Excluir":
			int remover = Integer.parseInt(request.getParameter("remove"));
			service.remove(remover);
			
			request.getRequestDispatcher("ListarAluno").forward(request, response);
			
			break;
		case "Editar":
			Integer carregarAluno = Integer.parseInt(request.getParameter("id_Edita"));
			
			Aluno alunoEdicao = service.carregarAluno(carregarAluno);
			
			request.setAttribute("alunoEdicao", alunoEdicao);
			request.getRequestDispatcher("EditarAluno").forward(request, response);
			
			break;
		default:
			break;
		}
		
		forwardToView(request,response);
	}
	
	private void forwardToView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("alunos", service.getAluno());
		request.getRequestDispatcher("/CadastrarAluno.jsp").forward(request, response);
	}
	
	
}














