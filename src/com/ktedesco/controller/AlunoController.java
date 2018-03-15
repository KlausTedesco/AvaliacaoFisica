package com.ktedesco.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ktedesco.entity.Aluno;
import com.ktedesco.service.AlunoService;

/**
 * Servlet implementation class ImcService
 */
@WebServlet("/DadosAluno")
public class AlunoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private AlunoService service;
	
    public AlunoController() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		forwardToView(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action =request.getParameter("action");
		switch (action) {
		case "Gravar":
			SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
			try {
				Aluno imc = new Aluno(request.getParameter("nome"),sdf.parse(request.getParameter("dataNascimento")),Integer.parseInt(request.getParameter("altura")), Double.parseDouble(request.getParameter("peso")));
//				imc.setResultado(Integer.parseInt(request.getParameter("altura")), Double.parseDouble(request.getParameter("peso")));
//				imc.getResultado();
				service.persist(imc);
								
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (ParseException e) {
				e.printStackTrace();
			}
			break;
		case "Excluir":
			service.remove(Integer.parseInt(request.getParameter("id")));
			break;
		default:
			break;
		}
		
		forwardToView(request,response);
	}
	
	private void forwardToView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("imc", service.getAluno());
		request.getRequestDispatcher("/aluno.jsp").forward(request, response);
	}

}














