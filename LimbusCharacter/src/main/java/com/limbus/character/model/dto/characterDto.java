package com.limbus.character.model.dto;

import java.sql.Date;

public class characterDto {
	private Long charNo;
	private String charName;
	private Long charTier;
	private Long memberNo;
	private Date releaseDate;
	
	public characterDto() {
		super();
	}
	
	public characterDto(Long charNo, String charName, Long charTier, Long memberNo, Date releaseDate) {
		super();
		this.charNo = charNo;
		this.charName = charName;
		this.charTier = charTier;
		this.memberNo = memberNo;
		this.releaseDate = releaseDate;
	}

	public Long getCharNo() {
		return charNo;
	}

	public String getCharName() {
		return charName;
	}

	public Long getCharTier() {
		return charTier;
	}

	public Long getMemberNo() {
		return memberNo;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setCharNo(Long charNo) {
		this.charNo = charNo;
	}

	public void setCharName(String charName) {
		this.charName = charName;
	}

	public void setCharTier(Long charTier) {
		this.charTier = charTier;
	}

	public void setMemberNo(Long memberNo) {
		this.memberNo = memberNo;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	@Override
	public String toString() {
		return "characterDto [charNo=" + charNo + ", charName=" + charName + ", charTier=" + charTier + ", memberNo="
				+ memberNo + ", releaseDate=" + releaseDate + "]";
	}
	
	
}
