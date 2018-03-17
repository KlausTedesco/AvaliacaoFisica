
package com.ktedesco.service;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ktedesco.entity.Aluno;
@Stateless
public class AlunoService {
	
	@PersistenceContext
	private EntityManager em;
	
	public Collection<Aluno> getAluno (){
		return em.createQuery("SELECT i FROM Aluno i").getResultList();
	}
	public void persist(Aluno aluno){
		//imc.setResultado(imc.getAltura()/Math.pow(imc.getPeso(),2)); REGRA DE NEGOCIO
		em.persist(aluno);
	}
	
	public void remove(int idAluno){
		em.remove(em.find(Aluno.class, idAluno));
	}

}
