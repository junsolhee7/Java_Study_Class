package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		boolean check = true;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("프로그램 시작");
		//StudentController의 start 메서드 호출
		StudentController stc = new StudentController();
		while (check) {
			stc.input();
			stc.view();
			stc.search();
			stc.delete();
			stc.add();
			stc.exit();
			int select = sc.nextInt();
			switch(select) {
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			case 4:
				System.out.println("4");
				break;
			case 5:
				System.out.println("5");
				break;
			default:
				System.out.println("6");
				check = false;
				break;
			}
		}
		
		
		
		
		System.out.println("프로그램 종료");

	}

}
