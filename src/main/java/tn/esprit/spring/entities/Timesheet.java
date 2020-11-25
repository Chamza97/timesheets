package tn.esprit.spring.entities;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@IdClass(TimeSheetPk.class)
public class Timesheet implements Serializable {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	@Id
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	
	@Id

	@ManyToOne
	private int idEmploye;
	
	@Id
	
	@ManyToOne
	private int idMission;
	
	private boolean isValid;

	public Timesheet(Date dateDebut, Date dateFin, int idEmploye, int idMission, boolean isValid) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.idEmploye = idEmploye;
		this.idMission = idMission;
		this.isValid = isValid;
	}

	public Timesheet() {
		super();
	}

	protected Date getDateDebut() {
		return dateDebut;
	}

	protected void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	protected Date getDateFin() {
		return dateFin;
	}

	protected void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	protected int getIdEmploye() {
		return idEmploye;
	}

	protected void setIdEmploye(int idEmploye) {
		this.idEmploye = idEmploye;
	}

	protected int getIdMission() {
		return idMission;
	}

	protected void setIdMission(int idMission) {
		this.idMission = idMission;
	}

	protected boolean isValid() {
		return isValid;
	}

	protected void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	
	
}
