package Day1;

import java.util.stream.Stream;

/*Q.1 WAP to check the given no is palindrome or not. Don’t use divide 
method. */
public class PalindromNoEx {




		   public static boolean isPalindrome(int number)
		    {



		       return number == Stream.iterate(number, i -> i / 10)
		            .map(n -> n % 10)
		            .limit(String.valueOf(number).length())
		            .reduce(0, (a, b) -> a = a * 10 + b);
		    }
		    
		    public static void main(String[] args) {
		        
		        boolean palindrome = isPalindrome(104);
		        System.out.println(palindrome);
		    }
		

}
