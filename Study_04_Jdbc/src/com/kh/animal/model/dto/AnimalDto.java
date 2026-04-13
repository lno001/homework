package com.kh.animal.model.dto;

import java.sql.Date;

public class AnimalDto {
	private String animalId;
	private String animalName;
	private String speciesId;
	private String ZoneId;
	private String KeeperId;
	private char gender;
	private int weightKg;
	private Date birthDate;
	private Date arrivalDate;
	
	public AnimalDto() {
		super();
	}

	public AnimalDto(String animalId, String animalName, String speciesId, String zoneId, String keeperId, char gender,
			int weightKg, Date birthDate, Date arrivalDate) {
		super();
		this.animalId = animalId;
		this.animalName = animalName;
		this.speciesId = speciesId;
		ZoneId = zoneId;
		KeeperId = keeperId;
		this.gender = gender;
		this.weightKg = weightKg;
		this.birthDate = birthDate;
		this.arrivalDate = arrivalDate;
	}

	public String getAnimalId() {
		return animalId;
	}

	public void setAnimalId(String animalId) {
		this.animalId = animalId;
	}

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public String getSpeciesId() {
		return speciesId;
	}

	public void setSpeciesId(String speciesId) {
		this.speciesId = speciesId;
	}

	public String getZoneId() {
		return ZoneId;
	}

	public void setZoneId(String zoneId) {
		ZoneId = zoneId;
	}

	public String getKeeperId() {
		return KeeperId;
	}

	public void setKeeperId(String keeperId) {
		KeeperId = keeperId;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getWeightKg() {
		return weightKg;
	}

	public void setWeightKg(int weightKg) {
		this.weightKg = weightKg;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	@Override
	public String toString() {
		return "AnimalDto [animalId=" + animalId + ", animalName=" + animalName + ", speciesId=" + speciesId
				+ ", ZoneId=" + ZoneId + ", KeeperId=" + KeeperId + ", gender=" + gender + ", weightKg=" + weightKg
				+ ", birthDate=" + birthDate + ", arrivalDate=" + arrivalDate + "]";
	}
	
	
}
