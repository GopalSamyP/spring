package com.gopal.SpringPractice;

public class HelloWorld {
	
	 	private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		
		public void printName(){
			System.out.println("Given name is :"+getName());
		}
}
