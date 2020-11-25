package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Entity
@DiscriminatorValue(value = "MissionExtreme")
public class MissionExterne extends Mission implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String emailFacturation;
	private float tauxJournalierMoyen;
	

	public MissionExterne(int id, String name, String description, Departement departement, Set<Timesheet> timesheets,
			String emailFacturation, float tauxJournalierMoyen) {
		super(id, name, description, departement, timesheets);
		this.emailFacturation = emailFacturation;
		this.tauxJournalierMoyen = tauxJournalierMoyen;
	}
	
	public MissionExterne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MissionExterne(int id, String name, String description, Departement departement, Set<Timesheet> timesheets) {
		super(id, name, description, departement, timesheets);
		// TODO Auto-generated constructor stub
	}

	protected String getEmailFacturation() {
		return emailFacturation;
	}
	protected void setEmailFacturation(String emailFacturation) {
		this.emailFacturation = emailFacturation;
	}
	protected float getTauxJournalierMoyen() {
		return tauxJournalierMoyen;
	}
	protected void setTauxJournalierMoyen(float tauxJournalierMoyen) {
		this.tauxJournalierMoyen = tauxJournalierMoyen;
	}
	
}
