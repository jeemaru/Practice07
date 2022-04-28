package com.javaex.ex02;

public abstract class Bird {
	
    protected String name;

    public Bird() {

	}
	public Bird(String name) {
		this.name = name;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	 public void showName() {
	    	System.out.println(name);
	    }
	 public void fly() {
	    	
	    }
	 public void sing() {
	    	
	    }
}
