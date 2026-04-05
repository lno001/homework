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
			System.out.println("3. 일정 개수 이하 재고 보기");
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
			case "3" : selectLowAll();
				break;
			case "4" : sellItem();
				break;
			case "5" :
				break;
			case "6" :
				break;
			case "7" :
				break;
			case "0" : System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다.");
				System.out.println("======================================");
				sc.close();
				return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
		}
	}
	
	private void addItem() {
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
				System.out.println("재고번호 : " + si.getId());
				System.out.println("제품명 : " + si.getName());
				System.out.println("제품가격 : " + si.getPrice());
				System.out.println("제품수량 : " + si.getQuantity());
			}
		} else {
			System.out.println("아직 보관중인 재고가 없습니다.");
		}
	}
	
	private void selectLowAll() {
		int stock;
		System.out.println("======================================");
		System.out.println("일정 개수 이하 재고 보기");
		while(true) {
			int checkNum;
			System.out.println("--------------------------------------");
			System.out.println("몇 개 이하의 재고를 보고 싶나요?");
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
			stock = Integer.parseInt(checkInt);
			break;
		}
		List<ShopInventory> stocks = shopC.selectLowAll(stock);
		if (!stocks.isEmpty()) {
			for(ShopInventory si : stocks) {
				System.out.println("--------------------------------------");
				System.out.println("재고번호 : " + si.getId());
				System.out.println("제품명 : " + si.getName());
				System.out.println("제품가격 : " + si.getPrice());
				System.out.println("제품수량 : " + si.getQuantity());
			}
		} else {
			System.out.println("조건에 맞는 재고가 없습니다.");
		}
	}
	
	private void sellItem() {
		String name;
		String number;
		int sellNum;
		System.out.println("======================================");
		System.out.println("판매할 재고 꺼내기");
		while(true) {
			System.out.println("--------------------------------------");
			System.out.print("판매할 재고 이름을 알려주세요 > ");
			name = sc.nextLine();
			int checkName = shopC.checkName(name);
			if(checkName == -1) {
				System.out.println("존재하지 않는 재고입니다. 메인 메뉴로 넘어갑니다.");
				return;
			} else if(checkName == 1) {
				number = shopC.selectName(name).get(0).getId();
				break;
			} else if(checkName > 1) {
				System.out.println("그 재고는 두 군데 이상 존재하는 이름입니다.");
				System.out.println("중복된 이름의 재고들의 재고번호입니다");
				System.out.println("--------------------------------------");
				List<ShopInventory> sameName = shopC.selectName(name);
				for(int i =0; i < sameName.size(); i++) {
					System.out.print(sameName.get(i).getId() + "  |  ");
				}
				System.out.println(" ");
				while(true) {
					System.out.println("--------------------------------------");
					System.out.print("추가로 재고번호를 입력해주세요 > ");
					number = sc.nextLine();
					List<ShopInventory> checkNumber = shopC.checkNumber(number);
					if (checkNumber.equals(null)) {
						System.out.println("잘못된 재고번호입니다. 다시 입력해주세요.");
						continue;
					}
					break;
				}
				break;
			}
		}
		while(true) {
			int checkNum;
			System.out.println("--------------------------------------");
			System.out.print("꺼낼 재고 수량을 입력해주세요 > ");
			System.out.print("숫자만 입력해주세요 > ");
			String checkInt = sc.nextLine();
			try {
				checkNum = shopC.checkNum(Integer.parseInt(checkInt));
			} catch (NumberFormatException e) {
				System.out.println("잘못 입력하셨습니다. 정수 값으로 입력해주세요.");
				continue;
			}
			if (checkNum == -1) {
				System.out.println("꺼낼 재고는 음수가 될 수 없습니다.");
				continue;
			}
			sellNum = Integer.parseInt(checkInt);
			List<ShopInventory> sellItem = shopC.checkNumber(number);
			if (sellNum > sellItem.get(0).getQuantity()) {
				System.out.println("꺼낼 재고는 현재 재고 수량보다 클 수 없습니다.");
				System.out.println("손님에게는 재고가 부족하다고 말해주세요.");
				System.out.println("메인 메뉴로 돌아갑니다.");
				return;
			}
			System.out.println("--------------------------------------");
			shopC.sellItem(number, sellNum);
			System.out.println("성공적으로 물건을 꺼냈습니다.");
			break;
		}
	}
}
