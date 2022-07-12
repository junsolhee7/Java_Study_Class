package com.iu.object2;

public class Method3 {

	//salary
	public void sal(int salary) {
		System.out.println("월급 계산");
		System.out.println(salary*0.967); //매개변수 !인자값
		salary=20;
	}
	
	public void hap(int num1, int num2) {
		System.out.println(num1+num2);
		
	}
	
	public void info(String name, int age, String email) {
		System.out.println("이름:"+name+" 나이:"+age+" 이메일주소:"+email);
	}
	
	public void info2(Member member) {
		System.out.println(member.name);
		System.out.println(member.age);
		System.out.println(member.email);
		member.age=100;
	}
//	info : 이름 나이 이메일 주소를 받아서 출력
}
