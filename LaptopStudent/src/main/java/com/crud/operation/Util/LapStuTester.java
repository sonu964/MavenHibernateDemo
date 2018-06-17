package com.crud.operation.Util;

import com.crud.operation.DAO.StudentDao;
import com.crud.operation.DTO.Laptop;
import com.crud.operation.DTO.Student;

public class LapStuTester {

	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.setName("XXX");
		stu.setMarks(55);
		
		Laptop lap = new Laptop();
		lap.setName("HP");
		
		stu.setLap(lap);
		
		lap.setStu(stu);
		
		StudentDao sdao = new StudentDao();
		sdao.saveObject(stu);

	}

}
