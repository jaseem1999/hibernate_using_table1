package com.smple.DemoHib;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

//Data transfer Object 

@Entity
@Table(name = "Student_sample")
public class StudentDTO {
	@Id // primary key
	@GenericGenerator(name="ref" ,strategy = "increment")//generator strategy increment
	@GeneratedValue(generator = "ref")//Generator value
	private int id;// all attribute must be private  
	private String name;
	private String color;
	public int getId() {
		return id;
	}
	
	// Generate getters and setters 
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//provide Constructor

	public StudentDTO() {
		System.out.println("Getting and setting successfully");
	}
	
	
}
