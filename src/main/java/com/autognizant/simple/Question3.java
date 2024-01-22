/*
Take any string input from user and print the string after removing all vowels from it 
and print also the count of each vowels chars like 
for e.g. in the word "Education" print A=1, E=1, I=1, O=1, U=1 etc. and after removing vowels print: "dctn"

//Steps to Solve the problem
1) Accept the string input from user and store it in StringBuilder (not in String variable as String is immutable in Java)
2) Declare one HashMap<Character,Integer> to store vowel as key & its count as value
3) Iterate of the all characters in input string
4) Store the character and its count in  HashMap if it is vowel
5) Delete the vowel character from the input String using deleteCharAt(index) method
*/

package com.autognizant.simple;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		System.out.print("Enter Input String = ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();
		StringBuilder builder = new StringBuilder(str);
		Map<Character,Integer> data = new HashMap<>();
		
		for (char c : str.toCharArray()) {
			if(c == 'A' || c == 'E' || c== 'I' || c=='O' || c=='U' || c == 'a' || c == 'e' || c== 'i' || c=='o' || c=='u') {
				if(data.containsKey(c)) {
					data.put(c, data.get(c) + 1);
				}else {
					data.put(c, 1);
				}
				int index = builder.indexOf(String.valueOf(c));
				builder = builder.deleteCharAt(index);
				System.out.println("after deleting vowels = " + builder);
			}
		}
		System.out.println("HashMap = " + data);
		System.out.println("Output string = " + builder);

	}

}
