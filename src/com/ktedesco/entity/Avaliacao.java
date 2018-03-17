package com.ktedesco.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Avaliacao {
	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private Integer idAvaliacao;
	private Double pesoAluno;
	private Double peitoralAluno;
	private Double cinturaAluno;
	private Double coxaAluno;
	private Double alturaAluno;
	private Double bicepsAluno;
	private Double quadrilAluno;
	private Double panturrilhaAluno;
	
	public Avaliacao() {
		super();
	}

	public Avaliacao(Double pesoAluno, Double peitoralAluno, Double cinturaAluno, Double coxaAluno, Double alturaAluno,
			Double bicepsAluno, Double quadrilAluno, Double panturrilhaAluno) {
		super();
		this.pesoAluno = pesoAluno;
		this.peitoralAluno = peitoralAluno;
		this.cinturaAluno = cinturaAluno;
		this.coxaAluno = coxaAluno;
		this.alturaAluno = alturaAluno;
		this.bicepsAluno = bicepsAluno;
		this.quadrilAluno = quadrilAluno;
		this.panturrilhaAluno = panturrilhaAluno;
	}

	public Integer getIdAvaliacao() {
		return idAvaliacao;
	}

	public void setIdAvaliacao(Integer idAvaliacao) {
		this.idAvaliacao = idAvaliacao;
	}

	public Double getPesoAluno() {
		return pesoAluno;
	}

	public void setPesoAluno(Double pesoAluno) {
		this.pesoAluno = pesoAluno;
	}

	public Double getPeitoralAluno() {
		return peitoralAluno;
	}

	public void setPeitoralAluno(Double peitoralAluno) {
		this.peitoralAluno = peitoralAluno;
	}

	public Double getCinturaAluno() {
		return cinturaAluno;
	}

	public void setCinturaAluno(Double cinturaAluno) {
		this.cinturaAluno = cinturaAluno;
	}

	public Double getCoxaAluno() {
		return coxaAluno;
	}

	public void setCoxaAluno(Double coxaAluno) {
		this.coxaAluno = coxaAluno;
	}

	public Double getAlturaAluno() {
		return alturaAluno;
	}

	public void setAlturaAluno(Double alturaAluno) {
		this.alturaAluno = alturaAluno;
	}

	public Double getBicepsAluno() {
		return bicepsAluno;
	}

	public void setBicepsAluno(Double bicepsAluno) {
		this.bicepsAluno = bicepsAluno;
	}

	public Double getQuadrilAluno() {
		return quadrilAluno;
	}

	public void setQuadrilAluno(Double quadrilAluno) {
		this.quadrilAluno = quadrilAluno;
	}

	public Double getPanturrilhaAluno() {
		return panturrilhaAluno;
	}

	public void setPanturrilhaAluno(Double panturrilhaAluno) {
		this.panturrilhaAluno = panturrilhaAluno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alturaAluno == null) ? 0 : alturaAluno.hashCode());
		result = prime * result + ((bicepsAluno == null) ? 0 : bicepsAluno.hashCode());
		result = prime * result + ((cinturaAluno == null) ? 0 : cinturaAluno.hashCode());
		result = prime * result + ((coxaAluno == null) ? 0 : coxaAluno.hashCode());
		result = prime * result + ((idAvaliacao == null) ? 0 : idAvaliacao.hashCode());
		result = prime * result + ((panturrilhaAluno == null) ? 0 : panturrilhaAluno.hashCode());
		result = prime * result + ((peitoralAluno == null) ? 0 : peitoralAluno.hashCode());
		result = prime * result + ((pesoAluno == null) ? 0 : pesoAluno.hashCode());
		result = prime * result + ((quadrilAluno == null) ? 0 : quadrilAluno.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Avaliacao other = (Avaliacao) obj;
		if (alturaAluno == null) {
			if (other.alturaAluno != null)
				return false;
		} else if (!alturaAluno.equals(other.alturaAluno))
			return false;
		if (bicepsAluno == null) {
			if (other.bicepsAluno != null)
				return false;
		} else if (!bicepsAluno.equals(other.bicepsAluno))
			return false;
		if (cinturaAluno == null) {
			if (other.cinturaAluno != null)
				return false;
		} else if (!cinturaAluno.equals(other.cinturaAluno))
			return false;
		if (coxaAluno == null) {
			if (other.coxaAluno != null)
				return false;
		} else if (!coxaAluno.equals(other.coxaAluno))
			return false;
		if (idAvaliacao == null) {
			if (other.idAvaliacao != null)
				return false;
		} else if (!idAvaliacao.equals(other.idAvaliacao))
			return false;
		if (panturrilhaAluno == null) {
			if (other.panturrilhaAluno != null)
				return false;
		} else if (!panturrilhaAluno.equals(other.panturrilhaAluno))
			return false;
		if (peitoralAluno == null) {
			if (other.peitoralAluno != null)
				return false;
		} else if (!peitoralAluno.equals(other.peitoralAluno))
			return false;
		if (pesoAluno == null) {
			if (other.pesoAluno != null)
				return false;
		} else if (!pesoAluno.equals(other.pesoAluno))
			return false;
		if (quadrilAluno == null) {
			if (other.quadrilAluno != null)
				return false;
		} else if (!quadrilAluno.equals(other.quadrilAluno))
			return false;
		return true;
	}
	
	
	
	
	

}
