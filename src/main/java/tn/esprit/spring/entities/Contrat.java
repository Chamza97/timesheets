package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Contrat implements Serializable {
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		@Id
		private int reference ;
		@Temporal(TemporalType.DATE)
		private Date dateDebut;
		private String typeContrat;
		private long salaire;
		@OneToOne(mappedBy = "contrat")
		private Employe employe;
		public Contrat(int reference, Date dateDebut, String typeContrat, long salaire, Employe employe) {
			super();
			this.reference = reference;
			this.dateDebut = dateDebut;
			this.typeContrat = typeContrat;
			this.salaire = salaire;
			this.employe = employe;
		}
		public Contrat() {
			super();
		}
		public Date getDateDebut() {
			return dateDebut;
		}
		public void setDateDebut(Date dateDebut) {
			this.dateDebut = dateDebut;
		}
		public String getTypeContrat() {
			return typeContrat;
		}
		public void setTypeContrat(String typeContrat) {
			this.typeContrat = typeContrat;
		}
		public long getSalaire() {
			return salaire;
		}
		public void setSalaire(long salaire) {
			this.salaire = salaire;
		}
		public Employe getEmploye() {
			return employe;
		}
		public void setEmploye(Employe employe) {
			this.employe = employe;
		}
		public int getReference() {
			return reference;
		}
		
		
		
		
}
