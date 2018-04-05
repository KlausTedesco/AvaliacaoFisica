package br.com.academia.service;


import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.academia.entity.Professor;

@Stateless
public class ProfessorService {

	@PersistenceContext
	private EntityManager em;
	
	public List<Professor> getProfessor(){
		return em.createQuery("FROM Professor").getResultList();
	}
	public void persist(Professor professor){
		em.persist(professor);
	}
	public void remove(int id){
		em.remove(em.find(Professor.class, id));
		
	}
	public boolean verificaProfessor(String usuario, String senha){
		return !em.createQuery("FROM Professor WHERE loginProfessor = :login AND passwordProfessor = :senha")
					.setParameter("login", usuario)
					.setParameter("senha", senha)
					.getResultList().isEmpty();
	
	}
	
	
}
