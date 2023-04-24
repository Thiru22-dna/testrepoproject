package com.example.testing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {

	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(12,13,34,15,27,28);
		
		List<Integer> EvenNumber=numbers.stream().filter(x->x%2==0).collect(Collectors.toList());
		
		System.out.println(EvenNumber);

	}

}
