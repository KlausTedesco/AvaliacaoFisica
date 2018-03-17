package com.ktedesco.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.br.CPF;
@Entity
public class Aluno {
	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private Integer idAluno;
	
	private String nomeAluno;
	@CPF
	private String cpfAluno;
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	private String telefoneAluno;
	@Email
	private String emailAluno;
	


	public Aluno() {
		super();
	}


	public Aluno(String nomeAluno, String cpfAluno, Date dataNascimento, String telefoneAluno,
			String emailAluno) {
		super();
		this.nomeAluno = nomeAluno;
		this.cpfAluno = cpfAluno;
		this.dataNascimento = dataNascimento;
		this.telefoneAluno = telefoneAluno;
		this.emailAluno = emailAluno;
	}


	public Integer getIdAluno() {
		return idAluno;
	}


	public void setIdAluno(Integer idAluno) {
		this.idAluno = idAluno;
	}


	public String getNomeAluno() {
		return nomeAluno;
	}


	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}


	public String getCpfAluno() {
		return cpfAluno;
	}


	public void setCpfAluno(String cpfAluno) {
		this.cpfAluno = cpfAluno;
	}


	public Date getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getTelefoneAluno() {
		return telefoneAluno;
	}


	public void setTelefoneAluno(String telefoneAluno) {
		this.telefoneAluno = telefoneAluno;
	}


	public String getEmailAluno() {
		return emailAluno;
	}


	public void setEmailAluno(String emailAluno) {
		this.emailAluno = emailAluno;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpfAluno == null) ? 0 : cpfAluno.hashCode());
		result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + ((emailAluno == null) ? 0 : emailAluno.hashCode());
		result = prime * result + ((idAluno == null) ? 0 : idAluno.hashCode());
		result = prime * result + ((nomeAluno == null) ? 0 : nomeAluno.hashCode());
		result = prime * result + ((telefoneAluno == null) ? 0 : telefoneAluno.hashCode());
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
		Aluno other = (Aluno) obj;
		if (cpfAluno == null) {
			if (other.cpfAluno != null)
				return false;
		} else if (!cpfAluno.equals(other.cpfAluno))
			return false;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (emailAluno == null) {
			if (other.emailAluno != null)
				return false;
		} else if (!emailAluno.equals(other.emailAluno))
			return false;
		if (idAluno == null) {
			if (other.idAluno != null)
				return false;
		} else if (!idAluno.equals(other.idAluno))
			return false;
		if (nomeAluno == null) {
			if (other.nomeAluno != null)
				return false;
		} else if (!nomeAluno.equals(other.nomeAluno))
			return false;
		if (telefoneAluno == null) {
			if (other.telefoneAluno != null)
				return false;
		} else if (!telefoneAluno.equals(other.telefoneAluno))
			return false;
		return true;
	}
}

