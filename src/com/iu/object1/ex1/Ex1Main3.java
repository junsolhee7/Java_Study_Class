package com.iu.object1.ex1;

import java.util.Scanner;

public class Ex1Main3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student [] students = new Student[3];
		
		for(int i=0; i<students.length; i++) {
			Student st = new Student();
			students[i] = st;
			System.out.println("이름 입력");
//			students[i].name = sc.next();//아래와같은코드
			st.name=sc.next();//지역변수,참조변수
		}

	}

}
