package com.crud.operation.DTO;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Lap")
public class Laptop {

	@Id
	
	@GenericGenerator(name="lapid" ,strategy="increment")
	@GeneratedValue(generator="lapid")
	
	@Column(name="id")
	private int lid;
	
	@Column(name="name")
	private String name;
	
	@OneToOne(mappedBy="lap")
	private Student stu;

	

	public int getLid() {
		return lid;
	}



	public void setLid(int lid) {
		this.lid = lid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Student getStu() {
		return stu;
	}



	public void setStu(Student stu) {
		this.stu = stu;
	}



	public Laptop() {
		
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	
}
