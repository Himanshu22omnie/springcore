package com.tut.springlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class PcUsingAnnotations {
	private String subjects;

	public String getSubjects() {
		return subjects;
	}

	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "PcUsingAnnotations [subjects=" + subjects + "]";
	}

	public PcUsingAnnotations() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void start() {
		System.out.println("starting methods");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("ending methods");
	}
}
