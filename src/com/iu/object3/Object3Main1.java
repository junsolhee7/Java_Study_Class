package com.iu.object3;

import java.util.Scanner;

public class Object3Main1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ReturnTest rt = new ReturnTest();
		int num = rt.makeRandom();
//		rt.info();
		System.out.println(num);
		System.out.println("==========================");
		
		System.out.println("수를 입력하세요.");
		System.out.println("==========================");
		int numFor = sc.nextInt();
		int [] nums = rt.makeRandom2(numFor);
		for(int i=0;i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		Account ac = rt.makeAccount();
		System.out.println(ac.title);
		System.out.println(ac.host);
		System.out.println(ac.numbers);
		System.out.println(ac.balance);

	}

}
