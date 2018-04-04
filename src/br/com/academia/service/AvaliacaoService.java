package br.com.academia.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.academia.entity.Aluno;
import br.com.academia.entity.Avaliacao;

@Stateless
public class AvaliacaoService {
	
	@PersistenceContext
	private EntityManager em;
	
	public List<Avaliacao> getAvaliacao(){
		return em.createQuery("FROM Avaliacao").getResultList();
	}
	public void persistAv (Avaliacao avaliacao){
		em.persist(avaliacao);
	}
	public void removeAv (int id){
		em.remove(em.find(Avaliacao.class, id));
	}
	public Aluno carregarAluno(int id){
		Aluno alunoRet = em.find(Aluno.class, id);
		return alunoRet;
	}
	public void autaliza(Avaliacao	avaliacao){
		em.merge(avaliacao);
	}

}
