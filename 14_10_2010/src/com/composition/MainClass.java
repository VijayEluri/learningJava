package com.composition;
import com.composition2.*;

public class MainClass {

	public static void main(String[] args) {
		Door d1;
		Adress adres1 = new Adress("istanbul","bagdat st","1234");
		Department dep1 = new Department(1, "Political Science");
		
		Adress adres2 = new Adress("ankara","esat st.","34555");
		
		Student stu1 = new Student("Ali",1234,adres1,dep1);
		Student stu2 = new Student("mehmet",3456,adres2, dep1);
		
		Student[] students = {stu1,stu2};
		
		for (Student student : students) {
			System.out.println("Name: " + student.getName());
			System.out.println("ID: " + student.getId());
			System.out.println("Adress:");
			System.out.println(student.getAdress().getCity());
			System.out.println(student.getAdress().getPostalCode());
			System.out.println(student.getAdress().getStreet());
			System.out.println("Department:");
			System.out.println(student.getDep().getName());
		}
		
		
		
		
	}
	
}
