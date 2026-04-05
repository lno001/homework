package com.kh.greengrocery.VO;

import java.util.Objects;

public class ShopInventory {
	private String number;
	private String name;
	private Integer price;
	private Integer quantity;

	public ShopInventory() {
		super();
	}

	public ShopInventory(String number, String name, Integer price, Integer quantity) {
		super();
		this.number = number;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, number, price, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShopInventory other = (ShopInventory) obj;
		return Objects.equals(name, other.name) && Objects.equals(number, other.number)
				&& Objects.equals(price, other.price) && Objects.equals(quantity, other.quantity);
	}

	@Override
	public String toString() {
		return "[No." + number + ", 이름 : " + name + ", 가격 : " + price + ", 재고 수량 : " + quantity
				+ "]";
	}
	
	

}
