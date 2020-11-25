package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Departement implements Serializable {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	private String name;
	@ManyToOne()
	private Entreprise entreprise;
	@ManyToMany
	private Set<Employe> employes;
	@OneToMany(mappedBy = "departement")
	private Set<Mission> mission;
	public Departement(int id, String name, Entreprise entreprise, Set<Employe> employes, Set<Mission> mission) {
		super();
		this.id = id;
		this.name = name;
		this.entreprise = entreprise;
		this.employes = employes;
		this.mission = mission;
	}
	public Departement() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Entreprise getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}
	public Set<Employe> getEmployes() {
		return employes;
	}
	public void setEmployes(Set<Employe> employes) {
		this.employes = employes;
	}
	public Set<Mission> getMission() {
		return mission;
	}
	public void setMission(Set<Mission> mission) {
		this.mission = mission;
	}
	public int getId() {
		return id;
	}
	
	
	
	
	
}
