package edu.mum.cs.cs425.studentmgmt;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.mum.cs.cs425.studentmgmt.model.ClassRoom;
import edu.mum.cs.cs425.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.model.Transcript;

@SpringBootApplication
public class StudentmanagementApplication {
	
	
	private static final String PERSISTENCE_UNIT_NAME = "studentmanagementApp";
	public static EntityManagerFactory factory;
	
	
	
	
	public StudentmanagementApplication() {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	}
	

	public static void main(String[] args) {
		StudentmanagementApplication app = new StudentmanagementApplication();
		
		Student student1 = new Student();
		student1.setStudentNumber("000-61-0001");
		student1.setFirstName("Anna");
		student1.setMiddleName("Lynn");
		student1.setLastName("Smith");
		student1.setCgpa(3.45);
		student1.setDateOfEnrollment(LocalDate.of(2016, 01, 06));
		
		
		Transcript transcript = new Transcript();
		transcript.setDegreeTitle("Bs Computer Science");
		
		student1.setTranscript(transcript);
		
		
		
		ClassRoom class1 = new ClassRoom();
		class1.setBuildingNumber(111);
		class1.setRoomNumber(123);	
		
		List<ClassRoom> classRooms = new ArrayList();
		classRooms.add(class1);
		
		student1.setClassRooms(classRooms);
		
		
	
		
		

		System.out.println(student1.getFirstName());
		
		app.saveStudent(student1);
		
	
	}

	private void saveStudent(Student student) {
		System.out.println("Inside saveStudent   "+student.getFirstName());
		EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
        em.close();
        factory.close();
		
	}
	


}
