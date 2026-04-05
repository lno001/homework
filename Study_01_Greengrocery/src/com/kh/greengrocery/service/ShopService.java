package com.kh.greengrocery.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.greengrocery.VO.ShopInventory;

public class ShopService {
	private List<ShopInventory> list = new ArrayList<ShopInventory>();
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

}
