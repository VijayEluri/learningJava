package com.composition;

public class Student {

	private String name;
	private int id;
	private Adress adress;
	private Department dep;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int id, Adress adress, Department dep) {
		super();
		this.name = name;
		this.id = id;
		this.adress = adress;
		this.dep = dep;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public Department getDep() {
		return dep;
	}

	public void setDep(Department dep) {
		this.dep = dep;
	}
	
	
	
	
	
	
}
