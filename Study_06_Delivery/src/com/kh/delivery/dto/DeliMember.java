package com.kh.delivery.dto;

import java.sql.Date;

public class DeliMember {
	// 기본 컬럼
	private int memberNo; // PRIMARY KEY, 시퀀스로 자동 입력
	private String memberId; // NOT NULL, UNIQUE, 최대 20자 제한
	private String memberPw; // NOT NULL, 최대 20자 제한
	private String memberName; // NOT NULL, 최대 30자 제한
	private String address; // NOT NULL, 최대 100자 제한
	private Date enrollDate; // 기본값은 SYSDATE
	
	// 생성자부
	public DeliMember() {}
	public DeliMember(String memberId, String memberPw) {
		this.memberId = memberId;
		this.memberPw = memberPw;
	}
	public DeliMember(String memberId, String memberPw, String memberName, String address) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.address = address;
	}
	public DeliMember(int memberNo, String memberId, String memberPw, String memberName, String address,
					  Date enrollDate) {
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.address = address;
		this.enrollDate = enrollDate;
	}
	
	// 게터 / 세터
	public int getMemberNo() {
		return memberNo;
	}
	public String getMemberId() {
		return memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public String getAddress() {
		return address;
	}
	public Date getEnrollDate() {
		return enrollDate;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}
}
