package com.cogent.streamAPIBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Customers> ls = new ArrayList<>();
		ls.add(new Customers(111, "Janet", 50000.11f, "Seattle", "male"));
		ls.add(new Customers(112, "John", 90000.22f,"Toronto", "female"));
		ls.add(new Customers(113, "Mary", 12000.33f,"London", "male"));
		ls.add(new Customers(114, "Mary", 77000.44f,"Scottland", "male"));
		
//		ls.stream()
//		.map(b -> b.balance > 70000.00)
//		.forEach(System.out::println);
//		
//		long count = ls.stream()
//		.map(n -> n.id > 113)
//		.count();
		
		//System.out.println("count: "+count);
		
		
		
		// //
		List<Customers> listLs =ls.stream()
			.collect(Collectors.toList());
			
		System.out.println("listLs: "+ listLs);
		
//		ls.stream()
//		.distinct()
//		.forEach(System.out::println);
		
		
		
//		ls.stream()
//		.sorted( Comparator.comparing(Customers:: getName))
//		.forEach(System.out::println);
		
//		Object[] ls3 = ls.stream()
//		.filter(n -> n.balance> 50000)
//		.forEach(System.out::println);

		//System.out.println("ls3: "+ ls3.toString());
		
		List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);
		  
        // Using stream.min() to get minimum
        // element according to provided Integer Comparator
        Integer var = list.stream().min(Integer::compare).get();
  
        System.out.println("var: "+ var);
        Integer var2 = list.stream().max(Integer::compare).get();
        
        System.out.println("var2: "+ var2);
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
//        int result = numbers
//          .stream()
//          .reduce(2, (subtotal, element) -> subtotal + element);
        
        int result = numbers.stream().reduce(0, Integer::sum);
        
        
        System.out.println("numbers: "+ numbers);
        System.out.println("result: "+ result);
        
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        .filter(i -> i % 2 == 0)
        .skip(2)
        .forEach(i -> System.out.print(i + " "));
        System.out.println();
        
        // Creating a Stream of Integers
        Stream<Integer> stream = Stream.of(5, 6, 7, 8, 9, 10);
  
        // Using Stream toArray()
        Object[] arr = stream.toArray();
  
        // Displaying the elements in array arr
        System.out.println(Arrays.toString(arr));
        
	}

}
