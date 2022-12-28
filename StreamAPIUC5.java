package javaStreamAPI;

import java.util.*;

public class StreamAPIUC5 {
	
	public static void main(String[] args) {
		List<String> listS = Arrays.asList("13", "10", "17", "23", "92", "15", "53", "46", "87", "68");

		listS.stream().mapToInt(num -> Integer.parseInt(num)).filter(num -> num%2 == 0).findFirst();
	}

}
