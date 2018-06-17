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
@Table(name="Stu")

public class Student {

	

		@Id
		
		@GenericGenerator(name="stuid" ,strategy="increment")
		@GeneratedValue(generator="stuid")
		
		@Column(name="rollno")
		private	int rollno;
		
		@Column(name="name")
		private String name;
		
		@Column(name="marks")
		private int marks;
		
		@OneToOne(cascade=CascadeType.ALL)
		private Laptop lap;
		
		
		public int getRollno() {
			return rollno;
		}



		public void setRollno(int rollno) {
			this.rollno = rollno;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public int getMarks() {
			return marks;
		}



		public void setMarks(int marks) {
			this.marks = marks;
		}



		public Laptop getLap() {
			return lap;
		}



		public void setLap(Laptop lap) {
			this.lap = lap;
		}



		public Student() {
			
			System.out.println(this.getClass().getSimpleName()+" created");
		}
		
}
