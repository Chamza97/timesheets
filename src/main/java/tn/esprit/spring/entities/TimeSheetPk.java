package tn.esprit.spring.entities;

import java.sql.Date;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.IdClass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


public class TimeSheetPk {
	
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	private int idEmploye;
	private int idMission;
	
	

	public TimeSheetPk(Date dateDebut, Date dateFin, int idEmploye, int idMission) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.idEmploye = idEmploye;
		this.idMission = idMission;
	}

	public TimeSheetPk() {
		super();
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public int getIdEmploye() {
		return idEmploye;
	}

	public void setIdEmploye(int idEmploye) {
		this.idEmploye = idEmploye;
	}

	public int getIdMission() {
		return idMission;
	}

	public void setIdMission(int idMission) {
		this.idMission = idMission;
	}
	
	
}
