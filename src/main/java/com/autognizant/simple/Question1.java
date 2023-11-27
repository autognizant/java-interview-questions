//		Q. Write a java program for a given input array A consisting of N integers, returns the biggest value X, 
//         which occurs in A exactly X times.
//		   If there is no such value, the function should return 0.
//		 
//		Input/Expected Output:
//		int[] intArray1 = { 3, 8, 2, 3, 3, 2 }; // Output : 3
//		int[] intArray2 = { 7, 1, 2, 8, 2 }; // Output : 2
//		int[] intArray3 = { 3, 1, 4, 1, 5 }; // Output : 0
//		int[] intArray4 = { 5, 5, 5, 5, 5, 5 }; // Output : 0
//		int[] intArray5 = { 5, 5, 5, 5, 5 }; // Output : 5
//		Solution:-
//		Step1:- Find out the number of occurrences of each element in array - Map
//		Step2:- Find out the Biggest Key in Map 
//		Step3:- Compare the Biggest key with its Value, If the Key and the value matches, we get the answer
//              Otherwise find out the next max key in remaining keys in the map.


package com.autognizant.simple;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Question1 {

	public static void main(String[] args) {
		int[] intArray1 = { 3, 8, 2, 3, 3, 2 }; // Output : 3
		int[] intArray2 = { 7, 1, 2, 8, 2 }; // Output : 2
		int[] intArray3 = { 3, 1, 4, 1, 5 }; // Output : 0
		int[] intArray4 = { 5, 5, 5, 5, 5, 5 }; // Output : 0
		int[] intArray5 = { 5, 5, 5, 5, 5 }; // Output : 5
		
		int output1 = findBiggestValueX(intArray1);
		System.out.println("Output for intArray1 = " + output1);
		
		int output2 = findBiggestValueX(intArray2);
		System.out.println("Output for intArray2 = " + output2);
		
		int output3 = findBiggestValueX(intArray3);
		System.out.println("Output for intArray3 = " + output3);
		
		int output4 = findBiggestValueX(intArray4);
		System.out.println("Output for intArray4 = " + output4);
		
		int output5 = findBiggestValueX(intArray5);
		System.out.println("Output for intArray5 = " + output5);
	}

	private static int findBiggestValueX(int[] intArray) {
		Map<Integer,Integer> map = new HashMap<>();
		for (int i : intArray) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}else {
				map.put(i, 1);
			}
		}
//		System.out.println("Map = " + map);
		for(int i=0;i<=map.keySet().size();i++) {
//			int maxKey = findMaxKey(map);
			int maxKey = Collections.max(map.keySet());

//			System.out.println("maxKey = " + maxKey);
			int maxKeyValue = map.get(maxKey);
//			System.out.println("maxKeyValue = " + maxKeyValue);
			if(maxKey == maxKeyValue) {
				return maxKey;
			}else {
				map.remove(maxKey);
			}
		}
		return 0;
	}

	private static int findMaxKey(Map<Integer,Integer> map) {
		int max =0;
		for (int i : map.keySet()) {
			if(max < i) {
				max = i;
			}
		}
		return max;
	}

}
