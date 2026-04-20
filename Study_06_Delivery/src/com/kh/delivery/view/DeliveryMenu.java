package com.kh.delivery.view;

import java.util.List;
import java.util.Scanner;

import com.kh.delivery.controller.MemberController;
import com.kh.delivery.controller.OrderController;
import com.kh.delivery.controller.RestaurantController;
import com.kh.delivery.dto.DeliMember;
import com.kh.delivery.dto.Restaurant;

public class DeliveryMenu {
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	RestaurantController rc = new RestaurantController();
	OrderController oc = new OrderController();
	private String loginName;
	
	public void deliveryMenu() {
		
		System.out.println("배달 프로그램에 오신걸 환영합니다.");
		while(true) {
			System.out.println("==============================");
			System.out.println("배달 프로그램 목록");
			System.out.println("------------------------------");
			System.out.println("1. 회원 서비스");
			System.out.println("2. 가게/메뉴 서비스");
			if (loginName != null) {
				System.out.println("3. 주문 서비스");
			}
			System.out.println("0. 서비스 종료하기");
			System.out.println("------------------------------");
			System.out.print("원하시는 서비스의 번호를 입력해주세요 > ");
			String menu = sc.nextLine();
			switch(menu){
			case "0" : System.out.println("프로그램을 종료합니다.");
					   sc.close();
					   return;
			case "1" : memberMenu(); break;
			case "2" : restaurantMenu(); break;
			case "3" : if(loginName != null) {
						   orderMenu();
					   } else {
						   System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
					   }
					   break;
			default  : System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
		}
	}
	
	// 회원 서비스
	private void memberMenu() {
		while(true) {
			System.out.println("==============================");
			System.out.println("회원 서비스 목록");
			System.out.println("------------------------------");
			if(loginName != null) {
				System.out.println("1. 로그아웃");
			} else {
				System.out.println("1. 로그인");
				System.out.println("2. 회원가입");
			}
			System.out.println("0. 이전 목록으로 돌아가기");
			System.out.println("------------------------------");
			System.out.print("원하시는 서비스의 번호를 입력해주세요 > ");
			String menu = sc.nextLine();
			switch(menu) {
			case "0" : return;
			case "1" : if(loginName != null) {
						   logout();
					   } else {
						   login();
					   }
					   break;
			case "2" : if(loginName != null) {
						   System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
					   } else {
						   insertMember();
					   }
					   break;
			default  : System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
		}
	}
	
	private void logout() {
		loginName = null;
		System.out.println("로그아웃 되었습니다.");
	}
	// 로그인 성공 시 로그인 메뉴로 전환
	private void login() {
		System.out.println("==============================");
		System.out.println("로그인");
		System.out.println("------------------------------");
		System.out.print("아이디 : ");
		String memberId = sc.nextLine();
		System.out.print("비밀번호 : ");
		String memberPw = sc.nextLine();
		DeliMember member = new DeliMember(memberId, memberPw);
		String memberName = mc.login(member);
		
		if(memberName == null) {
			System.out.println("아이디 또는 비밀번호를 잘못 입력하셨습니다.");
		} else {
			loginName = memberName;
			System.out.println(memberName + "님으로 로그인 되셨습니다.");
		}
	}
	// ID 중복체크 포함
	private void insertMember() {
		System.out.println("==============================");
		System.out.println("회원가입");
		System.out.println("------------------------------");
		while(true) {
			String memberId = null;
			String memberPw = null;
			String memberName = null;
			String address = null;
			System.out.print("가입할 아이디를 적어주세요 > ");
			memberId = sc.nextLine();
			boolean idCheck = mc.idCheck(memberId);
			if (idCheck == false) {
				System.out.println("아이디는 20자 이하로만 입력해주세요");
				continue;
			}
			int idCheckDuplicate = mc.idCheckDuplicate(memberId);
			if (idCheckDuplicate == 1) {
				System.out.println(memberId + "는 이미 사용 중인 아이디 입니다.");
				continue;
			} else {
				System.out.println(memberId + "는 사용 가능한 아이디 입니다.");
			}
			while(true) {
				System.out.println("사용할 비밀번호를 입력해주세요 > ");
				memberPw = sc.nextLine();
				boolean pwCheck = mc.pwCheck(memberPw);
				if (pwCheck == false) {
					System.out.println("비밀번호는 20자 이하로만 입력해주세요");
					continue;
				}
				break;
			}
			while(true) {
				System.out.print("사용할 이름을 입력해주세요 > ");
				memberName = sc.nextLine();
				boolean nameCheck = mc.nameCheck(memberName);
				if (nameCheck == false) {
					System.out.println("이름은 30자 이하로만 입력해주세요");
					continue;
				}
				break;
			}
			while(true) {
				System.out.println("현재 주소를 입력해주세요 > ");
				address = sc.nextLine();
				boolean addressCheck = mc.addressCheck(address);
				if (addressCheck == false) {
					System.out.println("주소는 100자 이하로만 입력해주세요");
					continue;
				}
				break;
			}
			DeliMember member = new DeliMember(memberId, memberPw, memberName, address);
			int result = mc.insertMember(member);
			if(result > 0) {
				System.out.println("회원가입에 성공했습니다.");
			} else {
				System.out.println("회원가입에 실패했습니다.");
			}
			break;
		}
	}
	
	// 가게/메뉴 서비스
	private void restaurantMenu() {
		while(true) {
			System.out.println("==============================");
			System.out.println("가게/메뉴 서비스 목록");
			System.out.println("------------------------------");
			System.out.println("1. 전체 가게 목록 조회");
			System.out.println("2. 카테고리별 가게 목록 조회");
			System.out.println("3. 가게 상세 메뉴 조회");
			System.out.println("0. 이전 목록으로 돌아가기");
			System.out.println("------------------------------");
			System.out.print("원하시는 서비스의 번호를 입력해주세요 > ");
			String menu = sc.nextLine();
			switch(menu) {
			case "0" : return;
			case "1" : selectAllRestaurant(); break;
			case "2" : restaurantFindByKeyword(); break;
			case "3" : menuFindByrestaurant(); break;
			default  : System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
		}
	}
	// 가게명, 카테고리, 최소주문, 배달비, 별점 표시
	private void selectAllRestaurant() {
		System.out.println("==============================");
		System.out.println("전체 가게 목록");
		System.out.println("------------------------------");
		List<Restaurant> restaurants = rc.selectAllRestaurant();
		restaurants.forEach(r -> System.out.println("가게 번호 : "+ r.getRestNo() + 
													" | 가게 이름 : " + r.getRestName() +
													" | 카테고리 : " + r.getCategory() +
													" | 최소 주문금액 : " + r.getMinPrice() +
													"원 | 배달비 : " + r.getDeliveryFee() + "원"));
	}
	// 동적 SQL <if> 필수 (카테고리 미입력 시 전체)
	private void restaurantFindByKeyword() {
		
	}
	// 가게 1개 선택 → 해당 가게의 메뉴 목록 전체 조회
	private void menuFindByrestaurant() {
		
	}
	
	// 주문 서비스
	private void orderMenu() {
		while(true) {
			System.out.println("==============================");
			System.out.println("주문 서비스 목록");
			System.out.println("------------------------------");
			System.out.println("1. 주문하기");
			System.out.println("2. 내 주문내역");
			System.out.println("3. 주문취소하기");
			System.out.println("0. 이전 목록으로 돌아가기");
			System.out.println("------------------------------");
			System.out.print("원하시는 서비스의 번호를 입력해주세요 > ");
			String menu = sc.nextLine();
			switch(menu) {
			case "0" : return;
			case "1" : insertOrder(); break;
			case "2" : selectMyOrders(); break; 
			case "3" : deleteOrder(); break; 
			default  : System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
		}
	}
	// 가게 → 메뉴 → 수량 입력 → 주문 등록 (품절 메뉴는 거부)
	private void insertOrder() {
		
	}
	// 가게명 + 메뉴명 + 수량 + 상태 JOIN해서 표시 ☆★ 핵심 ★☆
	private void selectMyOrders() {
		
	}
	// 상태가 ‘주문접수’ 일 때만 가능
	private void deleteOrder() {
		
	}
	
}
