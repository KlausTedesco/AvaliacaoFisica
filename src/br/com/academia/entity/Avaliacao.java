package br.com.academia.entity;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="avaliacao")
@ManagedBean
@SessionScoped
public class Avaliacao implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Integer idAvaliacao;
	private Integer numeroAvaliacao;
	@Temporal(TemporalType.DATE)
	private Date dataAvaliacao;
	private Double pesoAluno;
	private Double peitoralAluno;
	private Double cinturaAluno;
	private Double coxaAluno;
	private Double alturaAluno;
	private Double bicepsAluno;
	private Double quadrilAluno;
	private Double panturrilhaAluno;
	private Double Imc;
	@ManyToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name="id_aluno")
	private Aluno aluno;
	
	public Avaliacao() {
		super();
	}

	public Avaliacao(Integer numeroAvaliacao, Date dataAvaliacao, Double pesoAluno, Double peitoralAluno,
			Double cinturaAluno, Double coxaAluno, Double alturaAluno, Double bicepsAluno, Double quadrilAluno,
			Double panturrilhaAluno) {
		super();
		this.numeroAvaliacao = numeroAvaliacao;
		this.dataAvaliacao = dataAvaliacao;
		this.pesoAluno = pesoAluno;
		this.peitoralAluno = peitoralAluno;
		this.cinturaAluno = cinturaAluno;
		this.coxaAluno = coxaAluno;
		this.alturaAluno = alturaAluno;
		this.bicepsAluno = bicepsAluno;
		this.quadrilAluno = quadrilAluno;
		this.panturrilhaAluno = panturrilhaAluno;
		
	}

	
	public Double getImc() {
		return Imc;
	}

	public void setImc(Double imc) {
		Imc = imc;
	}

	public Integer getIdAvaliacao() {
		return idAvaliacao;
	}

	public void setIdAvaliacao(Integer idAvaliacao) {
		this.idAvaliacao = idAvaliacao;
	}

	public Integer getNumeroAvaliacao() {
		return numeroAvaliacao;
	}

	public void setNumeroAvaliacao(Integer numeroAvaliacao) {
		this.numeroAvaliacao = numeroAvaliacao;
	}

	public Date getDataAvaliacao() {
		return dataAvaliacao;
	}

	public void setDataAvaliacao(Date dataAvaliacao) {
		this.dataAvaliacao = dataAvaliacao;
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

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alturaAluno == null) ? 0 : alturaAluno.hashCode());
		result = prime * result + ((aluno == null) ? 0 : aluno.hashCode());
		result = prime * result + ((bicepsAluno == null) ? 0 : bicepsAluno.hashCode());
		result = prime * result + ((cinturaAluno == null) ? 0 : cinturaAluno.hashCode());
		result = prime * result + ((coxaAluno == null) ? 0 : coxaAluno.hashCode());
		result = prime * result + ((dataAvaliacao == null) ? 0 : dataAvaliacao.hashCode());
		result = prime * result + ((idAvaliacao == null) ? 0 : idAvaliacao.hashCode());
		result = prime * result + ((numeroAvaliacao == null) ? 0 : numeroAvaliacao.hashCode());
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
		if (aluno == null) {
			if (other.aluno != null)
				return false;
		} else if (!aluno.equals(other.aluno))
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
		if (dataAvaliacao == null) {
			if (other.dataAvaliacao != null)
				return false;
		} else if (!dataAvaliacao.equals(other.dataAvaliacao))
			return false;
		if (idAvaliacao == null) {
			if (other.idAvaliacao != null)
				return false;
		} else if (!idAvaliacao.equals(other.idAvaliacao))
			return false;
		if (numeroAvaliacao == null) {
			if (other.numeroAvaliacao != null)
				return false;
		} else if (!numeroAvaliacao.equals(other.numeroAvaliacao))
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
