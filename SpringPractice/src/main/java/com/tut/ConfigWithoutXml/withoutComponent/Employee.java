package com.tut.ConfigWithoutXml.withoutComponent;

public class Employee {
	
	private Lappy lapyy; 
	
	public Employee(Lappy lapyy) {
		super();
		this.lapyy = lapyy;
	}

	public Lappy getLapyy() {
		return lapyy;
	}

	public void setLapyy(Lappy lapyy) {
		this.lapyy = lapyy;
	}

	public void study() {
		this.lapyy.display();
		System.out.println("Employee is Working on Project");
	}
}
