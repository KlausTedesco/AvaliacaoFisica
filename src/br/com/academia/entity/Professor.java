package br.com.academia.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="professor")
public class Professor implements Serializable {
		
	private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue (strategy=GenerationType.IDENTITY)
		private Integer idProfessor;
		private String nome;
		private String email;
		private String loginProfessor;
		private String passwordProfessor;
		@OneToMany(mappedBy="professor", targetEntity = Aluno.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
		private List<Aluno> listaAluno;
		
		public Professor() {
			super();
		}
		public Professor(String nome, String email, String loginProfessor, String passwordProfessor) {
			super();
			this.nome = nome;
			this.email = email;
			this.loginProfessor = loginProfessor;
			this.passwordProfessor = passwordProfessor;
		}
		public String getEmail() {
		return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public Integer getIdProfessor() {
			return idProfessor;
		}
		public void setIdProfessor(Integer idProfessor) {
			this.idProfessor = idProfessor;
		}
		public String getLoginProfessor() {
			return loginProfessor;
		}
		public void setLoginProfessor(String loginProfessor) {
			this.loginProfessor = loginProfessor;
		}
		public String getPasswordProfessor() {
			return passwordProfessor;
		}
		public void setPasswordProfessor(String passwordProfessor) {
			this.passwordProfessor = passwordProfessor;
		}
		public List<Aluno> getListaAluno() {
			return listaAluno;
		}
		public void setListaAluno(List<Aluno> listaAluno) {
			this.listaAluno = listaAluno;
		}
		
		public void addListaAluno(Aluno aluno){
			if(listaAluno == null){
				listaAluno = new ArrayList<>();
			}
				listaAluno.add(aluno);
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((idProfessor == null) ? 0 : idProfessor.hashCode());
			result = prime * result + ((loginProfessor == null) ? 0 : loginProfessor.hashCode());
			result = prime * result + ((nome == null) ? 0 : nome.hashCode());
			result = prime * result + ((passwordProfessor == null) ? 0 : passwordProfessor.hashCode());
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
			Professor other = (Professor) obj;
			if (idProfessor == null) {
				if (other.idProfessor != null)
					return false;
			} else if (!idProfessor.equals(other.idProfessor))
				return false;
			if (loginProfessor == null) {
				if (other.loginProfessor != null)
					return false;
			} else if (!loginProfessor.equals(other.loginProfessor))
				return false;
			if (nome == null) {
				if (other.nome != null)
					return false;
			} else if (!nome.equals(other.nome))
				return false;
			if (passwordProfessor == null) {
				if (other.passwordProfessor != null)
					return false;
			} else if (!passwordProfessor.equals(other.passwordProfessor))
				return false;
			return true;
		}
		
	
	
}
