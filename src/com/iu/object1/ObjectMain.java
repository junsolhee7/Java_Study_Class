package com.iu.object1;

public class ObjectMain {

	public static void main(String[] args) {

		System.out.println("프로그램 시작");
		//object생성
		//클래스명 변수명 = new 클래스명(); 
		//new = 힙에 생성
		//데이터타입 변수명
		Monster monster = new Monster();
		System.out.println(monster);
		//멤버 접근
		//변수명.멤버명
		System.out.println(monster.name);
		System.out.println(monster.level);
		System.out.println(monster.hp);
		monster.name = "오크";
		monster.level = 5;
		monster.hp = 100;
		System.out.println(monster.name);
		System.out.println(monster.level);
		System.out.println(monster.hp);
		System.out.println("======================");
		Monster monster2 = new Monster();
		monster2.name = "다람쥐";
		monster2.level = 1;
		monster2.hp = 10;
		System.out.println(monster2.name);
		System.out.println(monster2.level);
		System.out.println(monster2.hp);
		
		Weapon sword = new Weapon();
		sword.name = "단검";
		sword.damage = 10;
		sword.inchant = 1;
		
		monster.weapon = sword;
		System.out.println(monster.weapon.name);
		
		
		System.out.println(monster2.weapon.name);
		
		
		System.out.println("프로그램 종료");

	}

}
