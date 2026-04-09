package com.kh.simplerpg.character.model;

public class Character {
	private int saveNum;
	private String characterName;
	private Job job;
	private CharacterStat stats;
	private int currentHp;
	private int currentMp;
	
	public Character(int saveNum, String characterName, Job job, CharacterStat stats, int currentHp, int currentMp) {
		super();
		this.saveNum = saveNum;
		this.characterName = characterName;
		this.job = job;
		this.stats = stats;
		this.currentHp = currentHp;
		this.currentMp = currentMp;
	}

	public int getSaveNum() {
		return saveNum;
	}

	public void setSaveNum(int saveNum) {
		this.saveNum = saveNum;
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public CharacterStat getStats() {
		return stats;
	}

	public void setStats(CharacterStat stats) {
		this.stats = stats;
	}

	public int getCurrentHp() {
		return currentHp;
	}

	public void setCurrentHp(int currentHp) {
		this.currentHp = currentHp;
	}

	public int getCurrentMp() {
		return currentMp;
	}

	public void setCurrentMp(int currentMp) {
		this.currentMp = currentMp;
	}
	
	
	
	
	
	
}
