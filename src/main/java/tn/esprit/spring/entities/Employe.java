package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Employe  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id ; 
	private String prenom;
	private String nom;
	private String email;
	private boolean isActif;
	private Role role;
	@OneToOne
	private Contrat contrat;
	
	@ManyToMany(mappedBy = "employes")
	private Set<Departement> departements;
	
	@OneToMany(mappedBy = "idEmploye")
	private Set<Timesheet> timesheets;

	public Employe(int id, String prenom, String nom, String email, boolean isActif, Role role, Contrat contart,
			Set<Departement> departements, Set<Timesheet> timesheets) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.isActif = isActif;
		this.role = role;
		this.contrat = contart;
		this.departements = departements;
		this.timesheets = timesheets;
	}

	public Employe() {
		super();
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isActif() {
		return isActif;
	}

	public void setActif(boolean isActif) {
		this.isActif = isActif;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Contrat getContart() {
		return contrat;
	}

	public void setContart(Contrat contart) {
		this.contrat= contart;
	}

	public Set<Departement> getDepartements() {
		return departements;
	}

	public void setDepartements(Set<Departement> departements) {
		this.departements = departements;
	}

	public Set<Timesheet> getTimesheets() {
		return timesheets;
	}

	public void setTimesheets(Set<Timesheet> timesheets) {
		this.timesheets = timesheets;
	}

	public int getId() {
		return id;
	}

	
	
	
	
}
