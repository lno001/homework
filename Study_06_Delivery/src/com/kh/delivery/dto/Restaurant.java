package com.kh.delivery.dto;

public class Restaurant {
	// 기본 컬럼
	private int restNo; // PRIMARY KEY, 시퀀스로 자동 입력
	private String restName; // NOT NULL, 최대 50자 제한
	private String category; // NOT NULL, ('한식', '중식', '일식', '양식', '분식', '치킨', '피자')만 입력 가능
	private int minPrice; // 최소주문금액, 기본값은 0, 0 이상의 정수일 것
	private int deliveryFee; // 기본값은 0, 0 이상의 정수일 것
	
	// 생성자부
	public Restaurant() {}
	public Restaurant(int restNo, String restName, String category, int minPrice, int deliveryFee) {
		this.restNo = restNo;
		this.restName = restName;
		this.category = category;
		this.minPrice = minPrice;
		this.deliveryFee = deliveryFee;
	}
	
	// 게터 / 세터
	public int getRestNo() {
		return restNo;
	}
	public String getRestName() {
		return restName;
	}
	public String getCategory() {
		return category;
	}
	public int getMinPrice() {
		return minPrice;
	}
	public int getDeliveryFee() {
		return deliveryFee;
	}
	public void setRestNo(int restNo) {
		this.restNo = restNo;
	}
	public void setRestName(String restName) {
		this.restName = restName;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setMinPrice(int minPrice) {
		this.minPrice = minPrice;
	}
	public void setDeliveryFee(int deliveryFee) {
		this.deliveryFee = deliveryFee;
	}
}
