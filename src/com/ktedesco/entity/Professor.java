package com.ktedesco.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Professor {
		
		@Id
		@GeneratedValue (strategy=GenerationType.AUTO)
		private Integer idProfessor;
		private String loginProfessor;
		private String passwordProfessor;
		
		public Professor() {
			super();
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

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((idProfessor == null) ? 0 : idProfessor.hashCode());
			result = prime * result + ((loginProfessor == null) ? 0 : loginProfessor.hashCode());
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
			if (passwordProfessor == null) {
				if (other.passwordProfessor != null)
					return false;
			} else if (!passwordProfessor.equals(other.passwordProfessor))
				return false;
			return true;
		}
		
		
	
	
}
