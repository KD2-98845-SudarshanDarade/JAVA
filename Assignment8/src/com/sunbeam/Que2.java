package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Que2 {

	public static void main(String[] args) {
		List<String> arr = new ArrayList<>();
		arr.add("Orange");
		arr.add("Red");
		arr.add("Pink");
		arr.add("Yellow");
		arr.add("Black");
		
		Collections.sort(arr);
		for(String color : arr) {
			System.out.print(color + " ");
		}
	}
}
