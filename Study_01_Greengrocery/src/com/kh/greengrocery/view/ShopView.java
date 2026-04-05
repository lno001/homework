package com.kh.greengrocery.view;

import java.util.List;
import java.util.Scanner;

import com.kh.greengrocery.VO.ShopInventory;
import com.kh.greengrocery.controller.ShopController;

public class ShopView {
	Scanner sc = new Scanner(System.in);
	ShopController shopC = new ShopController();
	
	public void mainView() {
		while(true) {
			System.out.println("======================================");
			System.out.println("청과물 재고 관리 프로그램에 오신 것을 환영합니다.");
			System.out.println("이용하실 시스템을 골라주세요");
			System.out.println("1. 재고 등록하기");
			System.out.println("2. 모든 재고 보기");
			System.out.println("3. 10개 이하인 재고 보기");
			System.out.println("4. 판매할 재고 꺼내기");
			System.out.println("5. 재고 보충하기");
			System.out.println("6. 재고 폐기하기");
			System.out.println("7. 없는 재고 지우기");
			System.out.println("0. 프로그램 종료하기");
			System.out.print("숫자를 입력해주세요 > ");
		
			String mainNum = sc.nextLine();
		
			switch(mainNum) {
			case "1" : addItem();
				break;
			case "2" : selectAll();
				break;
			case "3" :
				break;
			case "4" :
				break;
			case "5" :
				break;
			case "6" :
				break;
			case "7" :
				break;
			case "0" : System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다.");
				System.out.println("======================================");
				return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
		}
	}
	
	public void addItem() {
		int item;
		String name;
		int price;
		int quantity;
		
		while(true) {
			System.out.println("======================================");
			System.out.println("재고 등록하기");
			while(true) {
			System.out.println("--------------------------------------");
				System.out.println("재고의 품목을 알려주세요.");
				System.out.print("과일이면 F, 채소면 V를 입력해주세요 > ");
				String checkItem = sc.nextLine();
				item = shopC.checkItem(checkItem);
				if (item == -1) {
					System.out.println("잘못 입력하셨습니다. 품목을 제대로 알려주세요.");
					continue;
				}
				break;
			}
			System.out.println("--------------------------------------");
			System.out.print("재고의 이름을 입력해주세요 > ");
			name = sc.nextLine();
			while(true) {
				int checkNum;
				System.out.println("--------------------------------------");
				System.out.println("재고의 가격을 알려주세요.");
				System.out.print("숫자만 입력해주세요 > ");
				String checkInt = sc.nextLine();
				try {
					checkNum = shopC.checkNum(Integer.parseInt(checkInt));
				} catch (NumberFormatException e) {
					System.out.println("잘못 입력하셨습니다. 정수 값으로 입력해주세요.");
					continue;
				}
				if (checkNum == -1) {
					System.out.println("가격은 음수가 될 수 없습니다.");
					continue;
				}
				price = Integer.parseInt(checkInt);
				break;
			}
			while(true) {
				int checkNum;
				System.out.println("--------------------------------------");
				System.out.println("넣을 재고의 개수를 알려주세요.");
				System.out.print("숫자만 입력해주세요 > ");
				String checkInt = sc.nextLine();
				try {
					checkNum = shopC.checkNum(Integer.parseInt(checkInt));
				} catch (NumberFormatException e) {
					System.out.println("잘못 입력하셨습니다. 정수 값으로 입력해주세요.");
					continue;
				}
				if (checkNum == -1) {
					System.out.println("재고는 음수가 될 수 없습니다.");
					continue;
				}
				quantity = Integer.parseInt(checkInt);
				break;
			}
			shopC.addItem(item, name, price, quantity);
			return;
		}
	}
	
	private void selectAll() {
		System.out.println("======================================");
		System.out.println("모든 재고 보기");
		List<ShopInventory> list = shopC.selectAll();
		
		if (!list.isEmpty()) {
			for(ShopInventory si : list) {
				System.out.println("--------------------------------------");
				System.out.println("재고번호 : " + si.getNumber());
				System.out.println("제품명 : " + si.getName());
				System.out.println("제품가격 : " + si.getPrice());
				System.out.println("제품수량 : " + si.getQuantity());
			}
		} else {
			System.out.println("아직 보관중인 재고가 없습니다.");
		}
	}
}
