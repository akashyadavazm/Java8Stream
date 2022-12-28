package javaStreamAPI;

import java.util.*;

public class StreamAPIUC2 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("13","10","17","23","92","15","53","46","87","68");
		list.stream().mapToDouble(num -> Double.parseDouble(num)).forEach(System.out::println);;

	}

}
