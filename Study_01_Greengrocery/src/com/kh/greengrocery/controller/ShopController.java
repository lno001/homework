package com.kh.greengrocery.controller;

import java.util.List;

import com.kh.greengrocery.model.service.ShopService;
import com.kh.greengrocery.vo.ShopInventory;

public class ShopController {
	ShopService shopService = new ShopService();

	public int checkItem(String item) {
		return shopService.checkItem(item);
	}

	public int checkNum(int num) {
		return shopService.checkNum(num);
	}

	public void addItem(int item, String name, int price, int quantity) {
		shopService.addItem(item, name, price, quantity);
	}

	public List<ShopInventory> selectAll() {
		return shopService.selectAll();
	}

	public List<ShopInventory> selectLowAll(int stock) {
		return shopService.selectLowAll(stock);
	}

	public int checkName(String name) {
		return shopService.checkName(name);
	}

	public List<ShopInventory> selectName(String name) {
		return shopService.selectName(name);
	}

	public List<ShopInventory> checkNumber(String number) {
		return shopService.checkNumber(number);
	}

	public void sellItem(String number, int sellNum) {
		shopService.sellItem(number, sellNum);
	}

	public void addQuantity(String id, int quantity) {
		shopService.addQuantity(id, quantity);
	}

	public void deleteItem(String id) {
		shopService.deleteItem(id);
	}

	public void deleteZero() {
		shopService.deleteZero();
	}
	
	

}
