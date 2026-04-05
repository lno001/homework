package com.kh.greengrocery.controller;

import java.util.List;

import com.kh.greengrocery.VO.ShopInventory;
import com.kh.greengrocery.service.ShopService;

public class ShopController {
	ShopService shopS = new ShopService();

	public int checkItem(String item) {
		return shopS.checkItem(item);
	}

	public int checkNum(int num) {
		return shopS.checkNum(num);
	}

	public void addItem(int item, String name, int price, int quantity) {
		shopS.addItem(item, name, price, quantity);
	}

	public List<ShopInventory> selectAll() {
		return shopS.selectAll();
	}

}
