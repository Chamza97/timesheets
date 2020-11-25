package tn.esprit.spring.entities;

import java.io.Serializable;

import java.util.Set;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name ="d_type")
public class Mission implements Serializable {
	 
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	 private int id;
	 private String name;
	 private String description;
	 @ManyToOne
	 private Departement departement;
	 
	 @OneToMany(mappedBy = "idMission")
	 private Set<Timesheet> timesheets;

	public Mission(int id, String name, String description, Departement departement, Set<Timesheet> timesheets) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.departement = departement;
		this.timesheets = timesheets;
	}

	public Mission() {
		super();
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getDescription() {
		return description;
	}

	protected void setDescription(String description) {
		this.description = description;
	}

	protected Departement getDepartement() {
		return departement;
	}

	protected void setDepartement(Departement departement) {
		this.departement = departement;
	}

	protected Set<Timesheet> getTimesheets() {
		return timesheets;
	}

	protected void setTimesheets(Set<Timesheet> timesheets) {
		this.timesheets = timesheets;
	}

	protected int getId() {
		return id;
	}
	 
}
