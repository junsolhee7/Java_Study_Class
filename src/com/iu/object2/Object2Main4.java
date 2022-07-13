package com.iu.object2;

public class Object2Main4 {

	public static void main(String[] args) {

		Member member = new Member();
		member.name = "iu";
		member.age = 30;
		member.email = "iu@gmail.com";
		
		Member member2 = new Member();
		member2.name = "suji";
		member2.age = 31;
		member2.email = "suji@gmail.com";
		
		Member member3 = new Member();
		member3.name = "choa";
		member3.age = 32;
		member3.email = "choa@gmail.com";
		
		Member [] members = new Member[3];
		members[0] = member;
		members[1] = member2;
		members[2] = member3;
		
		Method4 m4 = new Method4();
		m4.info1(members);
		System.out.println(members.length);

	}

}
