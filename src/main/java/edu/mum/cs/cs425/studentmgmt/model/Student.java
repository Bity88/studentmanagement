package edu.mum.cs.cs425.studentmgmt.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

@Entity
public class Student {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	
	@NotEmpty
	private String studentNumber;
	
	
	@NotEmpty
	private String firstName;
	
	@NotEmpty
	private String lastName;
	
	@NotEmpty
	private String middleName;
	
	
	@NotNull
	private double cgpa;
	
	private LocalDate dateOfEnrollment;
	
	@OneToOne(cascade = CascadeType.ALL)
	public Transcript transcript;
	
	@ManyToMany(mappedBy = "student", cascade = CascadeType.ALL)
	public List<ClassRoom> classRooms;
	
	public Student() {}
	
	
	
	
	
	public List<ClassRoom> getClassRooms() {
		return classRooms;
	}





	public void setClassRooms(List<ClassRoom> classRooms) {
		this.classRooms = classRooms;
	}





	public Transcript getTranscript() {
		return transcript;
	}



	public void setTranscript(Transcript transcript) {
		this.transcript = transcript;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	public LocalDate getDateOfEnrollment() {
		return dateOfEnrollment;
	}

	public void setDateOfEnrollment(LocalDate dateOfEnrollment) {
		this.dateOfEnrollment = dateOfEnrollment;
	}


	
	

}
