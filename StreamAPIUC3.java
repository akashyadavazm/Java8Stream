package javaStreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPIUC3 {

	public static void main(String[] args) {
		List<String> listS = Arrays.asList("13", "10", "17", "23", "92", "15", "53", "46", "87", "68");
		List<Double> listD = listS.stream().mapToDouble(num -> Double.parseDouble(num)).boxed().collect(Collectors.toList());
		listD.forEach(System.out::println);
	}

}
