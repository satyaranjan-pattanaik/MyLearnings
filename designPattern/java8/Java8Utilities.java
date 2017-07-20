package designPattern.java8;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Utilities {
	
	
	
	
	
  public Integer sum(Optional<Integer> a, Optional<Integer> b){
	
     //Optional.isPresent - checks the value is present or not
		
     System.out.println("First parameter is present: " + a.isPresent());
     System.out.println("Second parameter is present: " + b.isPresent());
		
     //Optional.orElse - returns the value if present otherwise returns
     //the default value passed.
     Integer value1 = a.orElse(new Integer(0));
		
     //Optional.get - gets the value, value should be present
     Integer value2 = b.get();
     return value1 + value2;
  }
	

	private static List<String> collect;

	public static void main(String[] args) {
		ConcurrentHashMap<K, V>
		List<String> listString = Arrays.asList("spring", "node", "mkyong");
		System.out.println("*******Use of Filter Along Colllect to list*****");

		collect = listString.stream().filter(lin -> !"node".equals(lin))
				.collect(Collectors.toList());
		collect.forEach(System.out::println);
		System.out.println("*******Use of Filter Along with print*****");

		listString.stream().filter(lin -> !"node".equals(lin))
				.forEach(S -> System.out.println(S));

		System.out.println("*****Use Of Comaprator******");
		listString.sort((line1, line2) -> line1.compareTo(line2));
		listString.forEach(System.out::println);
		System.out.println("******Use of FindAny*****");

		String orElse = listString.stream().filter(line -> "exce".equals(line))
				.findAny().orElse("SaytaSai");
		System.out.println(orElse);

		System.out.println("*****Use Of Map******");
		List<String> collect2 = listString.stream().map(String::toUpperCase)
				.collect(Collectors.toList());
		collect2.forEach(S -> System.out.println(S));

		System.out.println("******One object to Another object*****");

		List<StringBuffer> collect3 = listString.stream()
				.filter(line -> !"node".equals(line)).map(sbf -> {
					StringBuffer sb = new StringBuffer();
					sb.append(sbf);
					return sb;
				}).collect(Collectors.toList());

		collect3.forEach(System.out::println);
		
		System.out.println("*****grouing and Counting *****");
		
		 List<String> items =
	                Arrays.asList("apple", "apple", "banana",
	                        "apple", "orange", "banana", "papaya");
		 
		Map<String, Long> result2 =  items.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(result2);
		
		//3 apple, 2 banana, others 1
        List<Item> fruitsitems = Arrays.asList(
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 20, new BigDecimal("19.99")),
                new Item("orang", 10, new BigDecimal("29.99")),
                new Item("watermelon", 10, new BigDecimal("29.99")),
                new Item("papaya", 20, new BigDecimal("9.99")),
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 10, new BigDecimal("19.99")),
                new Item("apple", 20, new BigDecimal("9.99"))
        );
        Map<String, Integer> sum =
        fruitsitems.stream().collect(Collectors.groupingBy(Item::getName,Collectors.summingInt(Item::getQty)));
		System.out.println(sum);
		
        
      //group by price
        Map<BigDecimal, List<Item>> groupByPriceMap = fruitsitems.stream().collect(Collectors.groupingBy(Item::getPrice));
        System.out.println(groupByPriceMap);
		
        
     // group by price, uses 'mapping' to convert List<Item> to Set<String>
        Map<BigDecimal, Set<Item>> result = fruitsitems.stream().collect(Collectors.groupingBy(Item::getPrice, Collectors.toSet()));
        System.out.println(result);
        
        Map<BigDecimal, Set<String>> resultAno = fruitsitems.stream().collect(Collectors.groupingBy(Item::getPrice, Collectors.mapping(Item::getName, Collectors.toSet())));
        System.out.println(resultAno);
        
		
        System.out.println(" *****Example – Reuse a stream*****");
        
        String[] array = {"a", "b", "c", "d", "e"};
        Supplier<Stream<String>>  suplier = ()->Stream.of(array);
       List<String> listStringOfAtrray =  suplier.get().filter(o -> !"b".equals(o)).collect(Collectors.toList());
       System.out.println(listStringOfAtrray);
     
        
		System.out.println("******Optional Impl*****");
		 Integer value1 = null;
	     Integer value2 = -1;
	     
	   //Optional.ofNullable - allows passed parameter to be null.
	     Optional<Integer> a = Optional.ofNullable(value1);
	     
	     System.out.println(a.isPresent());
	     int value = a.orElse(12).intValue();
		  	System.out.println(value);
	     //Optional.of - throws NullPointerException if passed parameter is null
	     Optional<Integer> b = Optional.of(value2);
	     System.out.println(b.isPresent());
	     System.out.println(b.get());

	     

	}

}
