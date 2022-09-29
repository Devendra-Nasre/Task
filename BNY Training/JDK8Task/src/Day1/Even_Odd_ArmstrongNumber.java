package Day1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//Q.3 User will be asked to enter two integer like 1 34 or 2 44 or 3 151 or 4 
//454. 1 to check given no is even, 2 for odd number, 3 for Armstrong 
//number, 4 for palindrome number

public class Even_Odd_ArmstrongNumber {



	   public static void main(String[] args) {
	        
	        List<Integer> number=Arrays.asList(34,44,151,454);
	         displayEvenNumber(number);
	         displayOddNumber(number);
	         
	         for (Integer integer : number) {
				List<Integer> list = displayArmstrongNumber(integer);
				System.out.println(list);
				
			}
	        
	         
	    
	         
	    }



	   private static List<Integer> displayArmstrongNumber(int num) {
		
		  
		  
		   
		
		   return Stream.iterate(1, i -> ++i)
	                .filter(i -> i == Stream.of(String.valueOf(i).split(""))
                    .map(Integer::valueOf)
                    .map(n -> (n*n*n))
                    .mapToInt(n -> n)
                    .sum())
            .limit(num)
            .collect(Collectors.toList());
	        
	    }



	   private static void displayOddNumber(List<Integer> num) {
	    Predicate<Integer> isEven=(number)->number %2==0;
	      System.out.println("Even Number");
	      num.stream().filter(isEven).forEach(System.out::println);
	        
	    }



	   private static void displayEvenNumber(List<Integer> num) {
	        Predicate<Integer> isOdd=(number)->number %2!=0;
	          System.out.println("Odd Number");
	          num.stream().filter(isOdd).forEach(System.out::println);
	            
	        
	    }
}