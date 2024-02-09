package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "subject")
@NamedQuery(name = "Subject.findAll", query = "SELECT s FROM Subject s")
public class Subject {
	@Id
	@Column
	private Long idsubject;
	@Column(name = "subject")
	private String subject;
	@Column(name = "credits")
	private String credits;
	
	public Long getIdsubject() {
		return idsubject;
	}
	public void setIdsubject(Long idsubject) {
		this.idsubject = idsubject;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getCredits() {
		return credits;
	}
	public void setCredits(String credits) {
		this.credits = credits;
	}
	
}
