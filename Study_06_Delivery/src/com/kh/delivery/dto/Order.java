package com.kh.delivery.dto;

import java.sql.Date;

public class Order {
	 // 기본 컬럼
    private int orderNo;  // PRIMARY KEY, 시퀀스로 자동 입력
    private int memberNo; // NOT NULL, MEMBER의 FOREIGN KEY
    private int menuNo; // NOT NULL, MENU의 FOREIGN KEY
    private int quantity; // 기본값은 1, 1 이상의 정수일 것
    private Date orderDate; // 기본값은 SYSDATE
    private String status; // 기본값은 '주문접수', ('주문접수', '조리중', '배달중', '배달완료', '주문취소')만 입력 가능
    
    // JOIN 결과를 담을 추가 필드
    private String memberName;   // MEMBER 조인
    private String restName;     // RESTAURANT 조인
    private String menuName;     // MENU 조인
    private int price;           // MENU 조인

    // 생성자부
    public Order() {}
    public Order(int orderNo, int memberNo, int menuNo, int quantity, Date orderDate, String status, String memberName,
				 String restName, String menuName, int price) {
		this.orderNo = orderNo;
		this.memberNo = memberNo;
		this.menuNo = menuNo;
		this.quantity = quantity;
		this.orderDate = orderDate;
		this.status = status;
		this.memberName = memberName;
		this.restName = restName;
		this.menuName = menuName;
		this.price = price;
	}
    
	// getter / setter / toString
	public int getOrderNo() {
		return orderNo;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public int getMenuNo() {
		return menuNo;
	}
	public int getQuantity() {
		return quantity;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public String getStatus() {
		return status;
	}
	public String getMemberName() {
		return memberName;
	}
	public String getRestName() {
		return restName;
	}
	public String getMenuName() {
		return menuName;
	}
	public int getPrice() {
		return price;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public void setMenuNo(int menuNo) {
		this.menuNo = menuNo;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public void setRestName(String restName) {
		this.restName = restName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", memberNo=" + memberNo + ", menuNo=" + menuNo + ", quantity=" + quantity
				+ ", orderDate=" + orderDate + ", status=" + status + ", memberName=" + memberName + ", restName="
				+ restName + ", menuName=" + menuName + ", price=" + price + "]";
	}
}
