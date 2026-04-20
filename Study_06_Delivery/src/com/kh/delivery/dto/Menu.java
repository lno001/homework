package com.kh.delivery.dto;

public class Menu {
	// 기본 컬럼
	private int menuNo; // PRIMARY KEY, 시퀀스로 자동 입력
	private int restNo; // NOT NULL, RESTAURANT의 FOREIGN KEY
	private String menuName; // NOT NULL
	private int price; // NOT NULL, 0 이상의 정수 일 것
	private char soldOut; // 기본값은 'N', ('Y', 'N')만 입력 가능
	
	// 생성자부
	public Menu() {}
	public Menu(int menuNo, int restNo, String menuName, int price, char soldOut) {
		this.menuNo = menuNo;
		this.restNo = restNo;
		this.menuName = menuName;
		this.price = price;
		this.soldOut = soldOut;
	}
	
	// 게터 / 세터
	public int getMenuNo() {
		return menuNo;
	}
	public int getRestNo() {
		return restNo;
	}
	public String getMenuName() {
		return menuName;
	}
	public int getPrice() {
		return price;
	}
	public char getSoldOut() {
		return soldOut;
	}
	public void setMenuNo(int menuNo) {
		this.menuNo = menuNo;
	}
	public void setRestNo(int restNo) {
		this.restNo = restNo;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setSoldOut(char soldOut) {
		this.soldOut = soldOut;
	}
}
