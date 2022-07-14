package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentService {
	
	
		public StudentService() {
			Scanner sc = new Scanner(System.in);
		}
		
		//removeStudent
		//학생들의 정보를 받아서
		//삭제하려는 학생의 번호를 입력 받음
		//학생의 번호와 일치하는 학생을 삭제
		//남은학생 정보들을 리턴
		
		//addStudent
		//학생들의 정보를 받아서
		//학생 한명 추가
		//학생정보들을 리턴
		
		
		//findStudent
		//검색하고싶은 학생의 번호를 입력받아서
		//같은 번호의 학생을 찾아서 그 학생 한명을 리턴
		//없으면 null을 리턴
		
		public Student findStudent(Student [] students) {
			Scanner sc = new Scanner(System.in);
			System.out.println("번호를 입력하세요");
			int num = sc.nextInt();
			//리턴하려는학생
			Student student = null;
			for(int i=0; i<students.length;i++) {
				if(num==students[i].num) {
					student = students[i];
					break;
				}
			}
			return student;
		}
		//makeStudents
		//학생수를 입력 받고,
		//학생수만큼 정보를 입력 받고,
		//학생들을 리턴
		public Student [] makeStudents() {
			Scanner sc = new Scanner(System.in);
			System.out.println("학생수를 입력하세요");
			int count = sc.nextInt();
			Student [] students = new Student[count];
			for(int i=0;i<students.length;i++) {
				Student student = new Student();
				System.out.println("이름 입력");
				student.name = sc.next();
				System.out.println("번호 입력");
				student.num = sc.nextInt();
				System.out.println("국어 입력");
				student.kor = sc.nextInt();
				System.out.println("영어 입력");
				student.eng = sc.nextInt();
				System.out.println("수학 입력");
				student.math = sc.nextInt();
				student.total = student.kor + student.eng+student.math;
				student.avg = student.total/3.0;
				students[i]=student;
			}
			
			return students;
			
		}
}
