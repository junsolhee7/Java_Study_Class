package com.iu.object3;

import java.util.Random;
import java.util.Scanner;

public class ReturnTest {
		
		//makeAccount
		//title,host,통장번호,잔액입력받아서 리턴
		public Account makeAccount() {
			Account ac = new Account();
			Scanner sc = new Scanner(System.in);
			System.out.println("title을 입력하세요.");
			ac.title = sc.next();
			System.out.println("host을 입력하세요.");
			ac.host = sc.next();
			System.out.println("numbers을 입력하세요.");
			ac.numbers = sc.next();
			System.out.println("balance를 입력하세요.");
			ac.balance = sc.nextInt();
			return ac;
		}
		
		
		//호출시 숫자를 받아서 그 숫자만큼 랜덤한수를 뽑아서 return
		public int [] makeRandom2(int numFor) {
			Random random = new Random();
			int [] nums = new int [numFor];
			
			for(int i=0; i<numFor; i++) {
				nums[i] = random.nextInt(45);
				System.out.println(nums[i]);
			}
			return nums;
		}

		public int makeRandom() {
			Random random = new Random();
			int num = random.nextInt(50);// 인자값
			return num; //선 void 나중에 수정 
			
		}
	
		public void info() {
			System.out.println("실행 후 그냥 종료");
		}
		
}
