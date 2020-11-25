package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Entreprise implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int  id;
	private String name;
	@OneToMany(mappedBy = "entreprise")
	private Set<Departement> departements ;
	public Entreprise(int id, String name, Set<Departement> departements) {
		super();
		this.id = id;
		this.name = name;
		this.departements = departements;
	}
	public Entreprise() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Departement> getDepartements() {
		return departements;
	}
	public void setDepartements(Set<Departement> departements) {
		this.departements = departements;
	}
	public int getId() {
		return id;
	} 
	
	
}
