package com.iu.object1.ex1;

public class Student {
	//이름,번호,국어,영어,수학 입력후 계산 총점,평균
	String name;
	int num;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	public void setTotal() {//지역변수
		this.total = this.kor + this.eng + this.math;//멤버변수(this는 생략, 객체생성시 생성되는 변수가 this)
		this.setAvg();
	}
	public void setAvg() {
		this.avg = this.total/3.0;
	}

}
