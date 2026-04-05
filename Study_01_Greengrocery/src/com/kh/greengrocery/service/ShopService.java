package com.kh.greengrocery.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.greengrocery.VO.ShopInventory;

public class ShopService {
	private List<ShopInventory> list = new ArrayList<ShopInventory>();
	private List<ShopInventory> stocks = new ArrayList<ShopInventory>();
	private int fruitsId;
	private int vegetablesId;
	
	/** 사용자가 입력한 값이 0 이상의 정수값인지 확인
	 */
	public int checkNum(int num) {
		if (num >= 0) {
			return 1;
		} else {
		return -1;
		}
	}
	
	/** 사용자가 입력한 값이 과일인지 채소인지 확인
	 */
	public int checkItem(String item) {
		switch(item) {
		case "과일", "f", "F" : return 1;
		case "채소", "v", "V" : return 2;
		default : return -1;
		}
	}
	
	public void addItem(int item, String name, int price, int quantity) {
		switch(item) {
		case 1 : list.add(new ShopInventory("F" + (++fruitsId), name, price, quantity));
			break;
		case 2 : list.add(new ShopInventory("V" + (++vegetablesId), name, price, quantity));
			break;
		}
	}
	
	public List<ShopInventory> selectAll() {
		return list;
	}

	public List<ShopInventory> selectLowAll(int stock) {
		stocks.clear();
		for(int i = 0; i < list.size(); i++) {
			if(stock >= list.get(i).getQuantity()) {
				stocks.add(list.get(i));
			}
		}
		return stocks;
	}

	public int checkName(String name) {
		int num = 0;
		for(int i = 0; i < list.size(); i++) {
			if(name.equals(list.get(i).getName())) {
				++num;
			}
		}
		if(num == 1) {
			return 1;
		} else if(num > 1){
			return 2;
		}
		return -1;
	}

	public List<ShopInventory> selectName(String name) {
		stocks.clear();
		for(int i = 0; i < list.size(); i++) {
			if(name.equals(list.get(i).getName())) {
				stocks.add(list.get(i));
			}
		}
		return stocks;
	}

	public List<ShopInventory> checkNumber(String number) {
		for(int i = 0; i < list.size(); i++) {
			if(number.equals(list.get(i).getId())) {
				return list;
			}
		}
		return null;
	}

	public void sellItem(String id, int sellNum) {
		int index = 0;
		for(int i = 0; i < list.size(); i++) {
			if(id.equals(list.get(i).getId())) {
				index = i;
				break;
			}
		}
		 ShopInventory l = list.get(index);
		list.set(index, new ShopInventory(id, l.getName(), l.getPrice(), l.getQuantity() - sellNum));
	}

	public void addQuantity(String id, int quantity) {
		int index = 0;
		for(int i = 0; i < list.size(); i++) {
			if(id.equals(list.get(i).getId())) {
				index = i;
				break;
			}
		}
		ShopInventory l = list.get(index);
		list.set(index, new ShopInventory(id, l.getName(), l.getPrice(), l.getQuantity() + quantity));
	}

}
