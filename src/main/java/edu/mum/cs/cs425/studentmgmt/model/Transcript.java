package edu.mum.cs.cs425.studentmgmt.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "transcript")
public class Transcript {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer transcriptID;
	
	@NotEmpty
	private String degreeTitle;
	
	
	@OneToOne(mappedBy = "transcript", cascade = CascadeType.ALL)
	public Student student;
	
	public Transcript() {}
	
	public Transcript(Integer id, String title) {
		title = this.degreeTitle;
		id = this.transcriptID;
	}


	public Integer getTranscriptID() {
		return transcriptID;
	}


	public void setTranscriptID(Integer transcriptID) {
		this.transcriptID = transcriptID;
	}


	public String getDegreeTitle() {
		return degreeTitle;
	}


	public void setDegreeTitle(String degreeTitle) {
		this.degreeTitle = degreeTitle;
	}
	
	
	

}
