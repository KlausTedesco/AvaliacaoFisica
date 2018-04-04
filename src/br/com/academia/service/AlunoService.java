package br.com.academia.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.academia.entity.Aluno;
import br.com.academia.entity.Professor;
@Stateless
public class AlunoService {
	
	@PersistenceContext
	private EntityManager em;
	
	
	public List<Aluno> getAluno(){
		return em.createQuery("FROM Aluno").getResultList();
	}
	public void atualiza(Aluno	aluno){
		em.merge(aluno);
	}
	public void persist(Aluno aluno){
		em.persist(aluno);
	}
	public void remove(int id){
		em.remove(em.find(Aluno.class, id));
	}
	public Aluno carregarAluno(int id){
		Aluno alunoRet = em.find(Aluno.class, id);
		return alunoRet;

	}
	
	
}