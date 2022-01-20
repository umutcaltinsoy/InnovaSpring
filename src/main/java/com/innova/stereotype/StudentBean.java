package com.innova.stereotype;

// Fazla olan annotation yapılarımızı teke indirgemek için kullanıyoruz.

@InnovaMultipleAnnotation
public class StudentBean {
	
	private String name = "Deneme";
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
