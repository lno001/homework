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

	public List<ShopInventory> selectLowAll(int stock) {
		return shopS.selectLowAll(stock);
	}

	public int checkName(String name) {
		return shopS.checkName(name);
	}

	public List<ShopInventory> selectName(String name) {
		return shopS.selectName(name);
	}

	public List<ShopInventory> checkNumber(String number) {
		return shopS.checkNumber(number);
	}

	public void sellItem(String number, int sellNum) {
		shopS.sellItem(number, sellNum);
	}

	public void addQuantity(String id, int quantity) {
		shopS.addQuantity(id, quantity);
	}

	public void deleteItem(String id) {
		shopS.deleteItem(id);
	}

	public void deleteZero() {
		shopS.deleteZero();
	}
	
	

}
