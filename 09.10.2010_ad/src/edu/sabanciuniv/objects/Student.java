package edu.sabanciuniv.objects;
import java.sql.Array;
import java.util.Arrays;


public class Student {

	String name;
	String surname;
	int age;
	String address;
	String department;
	
	String[]courses;
	
	public Student(String _name,
			String _surname,
			int _age,
			String _address,
			String _dep,
			String[] _courses){
		name=_name;
		surname=_surname;
		age=_age;
		address= _address;
		department=_dep;
		courses=_courses;}
	
	
	//underscore : _
	
	
	

	public void changeAddress(String newAddress){
		address = newAddress;

	
	}

	public double avgGrades(int... grades){
		int sum =0;
		int count=0;
		for (int i : grades) {
			sum+=i;
			count++;
			
		}
		return (double) sum/count;
	}
	
	//if we do not know the size of grades
	
	public Student copyMe(){
		
		String []copyCourses = Arrays.copyOf(courses, courses.length);
		
		return new Student(name,surname,age,address,department,copyCourses[]);
	}
	
	
	}
