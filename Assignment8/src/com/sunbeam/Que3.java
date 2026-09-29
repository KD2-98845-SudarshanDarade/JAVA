package com.sunbeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Que3 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		System.out.println("Before add New Number : ");
		for(Integer num : arr) {
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.println("Enter a new");
		int index = sc.nextInt();
		arr.set(1 , index);
		System.out.println("After adding number");
		for(Integer num : arr) {
			System.out.print(num + " ");
		}
		sc.close();
	}
}
