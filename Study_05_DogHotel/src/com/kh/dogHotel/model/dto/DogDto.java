package com.kh.dogHotel.model.dto;

public class DogDto {
	private double dogId;
	private String dogName;
	private String dogSpecies;
	private char dogGender;
	private int dogAge;
	private int dogKg;
	
	public DogDto() {
		super();
	}

	public DogDto(double dogId, String dogName, String dogSpecies, char dogGender, int dogAge, int dogKg) {
		super();
		this.dogId = dogId;
		this.dogName = dogName;
		this.dogSpecies = dogSpecies;
		this.dogGender = dogGender;
		this.dogAge = dogAge;
		this.dogKg = dogKg;
	}

	public double getDogId() {
		return dogId;
	}

	public void setDogId(double dogId) {
		this.dogId = dogId;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public String getDogSpecies() {
		return dogSpecies;
	}

	public void setDogSpecies(String dogSpecies) {
		this.dogSpecies = dogSpecies;
	}

	public char getDogGender() {
		return dogGender;
	}

	public void setDogGender(char dogGender) {
		this.dogGender = dogGender;
	}

	public int getDogAge() {
		return dogAge;
	}

	public void setDogAge(int dogAge) {
		this.dogAge = dogAge;
	}

	public int getDogKg() {
		return dogKg;
	}

	public void setDogKg(int dogKg) {
		this.dogKg = dogKg;
	}
	
	
	
}
