
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
		return em.createQuery("SELECT i FROM Aluno i", Aluno.class).getResultList();
	}
	public void persist(Aluno imc){
		imc.setResultado(imc.getAltura()/Math.pow(imc.getPeso(),2));
		em.persist(imc);
	}
	
	public void remove(int id){
		em.remove(em.find(Aluno.class, id));
	}

}
