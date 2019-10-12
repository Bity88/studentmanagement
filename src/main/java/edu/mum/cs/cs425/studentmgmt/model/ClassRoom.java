package edu.mum.cs.cs425.studentmgmt.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class ClassRoom {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private Integer buildingNumber;
	
	
	private Integer roomNumber;
	
	@ManyToMany( cascade = CascadeType.ALL)
	public List<Student> student;
	
	public ClassRoom() {}
	
	public ClassRoom(Integer buildingNumber, Integer roomNumber, List<Student> student){
		buildingNumber = this.buildingNumber;
		roomNumber = this.roomNumber;
		student = this.student;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBuildingNumber() {
		return buildingNumber;
	}

	public void setBuildingNumber(Integer buildingNumber) {
		this.buildingNumber = buildingNumber;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}
	
	

}
