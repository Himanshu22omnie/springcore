package com.tut.refInjection;

public class First {
	private int a;
	private Second ob;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public Second getOb() {
		return ob;
	}
	public void setOb(Second ob) {
		this.ob = ob;
	}
	
	public First() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "First [a=" + a + ", ob=" + ob + "]";
	}
	
}
