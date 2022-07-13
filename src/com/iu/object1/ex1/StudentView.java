package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentView {

	public void viewMessage(String message) {
		System.out.println(message);
		//문자열을 받아서 그 문자열을 출력                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
	}
	
	public void viewOne(Student student) {
		System.out.print("이름:"+student.name);
		System.out.print(" 번호:"+student.num);
		System.out.print(" 국어:"+student.kor);
		System.out.print(" 영어:"+student.eng);
		System.out.print(" 수학:"+student.math);
		System.out.print(" 총점:"+student.total);
		System.out.println(" 평균:"+student.avg);
		//학생 한명의 정보를 받아서 모든 정보를 출력
	}

	public void viewAll(Student [] students) {
		//학생들의 정보를 받아서 모든 정보를 출력
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<students.length; i++) {
			System.out.print("이름:"+students[i].name);
			System.out.print(" 번호:"+students[i].num);
			System.out.print(" 국어:"+students[i].kor);
			System.out.print(" 영어:"+students[i].eng);
			System.out.print(" 수학:"+students[i].math);
			System.out.print(" 총점:"+students[i].total);
			System.out.println(" 평균:"+students[i].avg);
		}
		
	}
}
