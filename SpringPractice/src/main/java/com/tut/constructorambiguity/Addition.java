package com.tut.constructorambiguity;

public class Addition {
	int a;
	int b;
	
	
	public Addition(double a, double b) {
		super();
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("Constructor double, double");
	}
	
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("Constructor int,int");
	}
	
	public Addition(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor String,String");
	}
	
	
	public void doSum() {
		System.out.println("Sum is :"+(this.a+this.b));
	}

	@Override
	public String toString() {
		return "Addition [a=" + a + ", b=" + b + "]";
	}
	
	
}

// Note :- it takes String constructor by-default. But in main class there is no String arg Constructor then it takes top-to-bottom.
