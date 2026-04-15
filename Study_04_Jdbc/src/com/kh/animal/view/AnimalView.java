package com.kh.animal.view;

import java.util.List;
import java.util.Scanner;

import com.kh.animal.controller.AnimalController;
import com.kh.animal.model.dto.AnimalDto;

public class AnimalView {
	Scanner sc = new Scanner(System.in);
	AnimalController ac = new AnimalController();
	
	public void animalMenu() {
		System.out.println("=========================");
		System.out.println("동물 관련 정보에 오신걸 환영합니다.");
		while(true) {
			System.out.println("-------------------------");
			System.out.println("동물 메뉴");
			System.out.println("=========================");
			System.out.println("1. 모든 동물 보기");
			System.out.println("2. 동물 추가하기");
			System.out.println("3. 동물 이름 개명하기");
			System.out.println("4. 동물 구역 배정하기");
			System.out.println("5. 동물 조련사 배정하기");
			System.out.println("6. 동물 방생하기");
			System.out.println("0. 동물원 메뉴로 돌아가기");
			System.out.print("원하시는 서비스 번호를 골라주세요 > ");
			String menu = sc.nextLine();
			
			switch(menu) {
			case "1" : animalFindAll(); break;
			case "2" : break;
			case "3" : break;
			case "4" : break;
			case "5" : break;
			case "6" : break;
			case "0" : return;
			default : System.out.println("잘못된 번호 입니다.");
			}
			

		}
	}

	private void animalFindAll() {
		System.out.println("=========================");
		System.out.println("모든 동물 보기");
		System.out.println("-------------------------");
		
		List<AnimalDto> animalList = ac.animalFindAll();
	}
}
