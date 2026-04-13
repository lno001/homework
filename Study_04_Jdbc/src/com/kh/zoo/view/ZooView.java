package com.kh.zoo.view;

import java.util.Scanner;

import com.kh.animal.view.AnimalView;

public class ZooView {
	Scanner sc = new Scanner(System.in);
	AnimalView av = new AnimalView();
	
	public void zooMenu() {
		System.out.println("=========================");
		System.out.println("동물원에 오신걸 환영합니다.");
		while(true) {
			System.out.println("-------------------------");
			System.out.println("동물원 메뉴");
			System.out.println("=========================");
			System.out.println("1. 동물 관련 정보");
			System.out.println("2. 구역 관련 정보");
			System.out.println("3. 조련사 관련 정보");
			System.out.println("0. 프로그램 종료");
			System.out.print("원하시는 서비스 번호를 골라주세요 > ");
			String menu = sc.nextLine();
			
			switch(menu) {
			case "1" : av.animalMenu(); break;
			case "2" : break;
			case "3" : break;
			case "0" : sc.close(); return;
			default : System.out.println("잘못된 번호 입니다.");
			}
		}
		
	}

}
