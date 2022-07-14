package com.iu.object4;

public class Object4Main1 {

	public static void main(String[] args) {
		Resume re = new Resume();
		// re.Resume(); // 객체생성시 한번만 사용가능한 메서드
		Car car1 = new Car(null);
//		car1.brand="토렌트";
		car1.info();
		
		Car car2 = new Car("Black");
		car2.info();
		

	}

}
