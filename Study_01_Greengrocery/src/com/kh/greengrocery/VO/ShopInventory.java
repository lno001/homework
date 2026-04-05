package com.kh.greengrocery.VO;

import java.util.Objects;

public class ShopInventory {
	private String id;
	private String name;
	private Integer price;
	private Integer quantity;

	public ShopInventory() {
		super();
	}

	public ShopInventory(String id, String name, Integer price, Integer quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getId() {
		return id;
	}

	public void setId(String number) {
		this.id = number;
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
		return Objects.hash(name, id, price, quantity);
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
		return Objects.equals(name, other.name) && Objects.equals(id, other.id)
				&& Objects.equals(price, other.price) && Objects.equals(quantity, other.quantity);
	}

	@Override
	public String toString() {
		return "[No." + id + ", 이름 : " + name + ", 가격 : " + price + ", 재고 수량 : " + quantity
				+ "]";
	}
	
	

}
