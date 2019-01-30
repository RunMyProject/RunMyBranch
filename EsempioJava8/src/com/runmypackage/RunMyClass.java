/**
 * 
 */
package com.runmypackage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author lenovo
 *
 */
public class RunMyClass {

	/**
	 * 
	 */
	public RunMyClass() {
		// TODO Auto-generated constructor stub
	}

	
	public static void myPrint(String s) {
		System.out.println("MyPrint: " + s);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("TEST Stream");
		
		List<String> myList = Arrays.asList("Marte", "Luna", "Terra", "Plutone", "Mercurio", "Giove");

		myList.stream().filter(s -> s.startsWith("M")).map(String::toUpperCase).sorted()
		.forEach(System.out::println);
		
		Arrays.asList("Marte", "Luna", "Terra")
	    .stream()
	    .findFirst()
	    .ifPresent(System.out::println);		
		
		Stream.of("Plutone", "Mercurio", "Giove")
	    .findFirst()
	    .ifPresent(System.out::println);		
		
		IntStream.range(1, 4)
		.forEach(System.out::println);
	}

}
