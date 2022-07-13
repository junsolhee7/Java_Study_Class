package com.iu.object2;

public class Object2Main3 {

	public static void main(String[] args) {

		Method3 m3 = new Method3();
		Member member = new Member();
		//월급 입력
		int salary = 5000000; //인자값 !매개변수
		m3.sal(salary);
		System.out.println(salary); //메모리영역이 다름 (스택,스택)
		m3.hap(10, 20 );
		m3.info("전하준",25,"junsolhee7@naver.com");
		member.name = "전하준";
		member.age = 25;
		member.email = "junsolhee7@naver.com";
		m3.info2(member);
		System.out.println(member.age);//메모리영역이 다름(스택,힙)
		
	}

}
