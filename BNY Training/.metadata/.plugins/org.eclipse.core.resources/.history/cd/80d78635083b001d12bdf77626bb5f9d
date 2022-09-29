package Day1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class TestItem {
	public static void main(String[] args) {
//		WAP to find the average price of item from the list of given items. 
		List<Item> lItem=new LinkedList<>();
			lItem.add(new Item(1, "Iphone", LocalDateTime.of(LocalDate.of(2011, 01, 01),LocalTime.of(12, 30) ), 
					LocalDateTime.of(LocalDate.of(2020, 01, 20),LocalTime.of(12, 30) ), 120000.89f));
			lItem.add(new Item(1, "oppo", LocalDateTime.of(LocalDate.of(2020, 01, 20),LocalTime.of(12, 30) ), 
					LocalDateTime.of(LocalDate.of(2020, 01, 20),LocalTime.of(12, 30) ), 10000.89f));
			lItem.add(new Item(1, "Iphone", LocalDateTime.of(LocalDate.of(2020, 01, 20),LocalTime.of(12, 30) ), 
					LocalDateTime.of(LocalDate.of(2020, 01, 20),LocalTime.of(12, 30) ), 10000.89f));
			Double average=lItem.stream() .mapToDouble(a -> a.getPrice())
	                .average().orElse(0);
		System.out.println(average);
		
//		WAP to print detail of item which is having highest and lowest price.
		double maxprice = lItem.stream().mapToDouble(p->p.getPrice()).max().orElse(0);
		System.out.println(maxprice);
		
		double minprice = lItem.stream().mapToDouble(p->p.getPrice()).min().orElse(0);
		System.out.println(minprice);
//		WAP to store item name and price from list to set. 
		Set<String> set = lItem.stream().map(p->p.getIname()+"Price OF Item"+p.getPrice()).collect(Collectors.toSet());
		System.out.println(set);
		
		
		
//		WAP to remove duplicate prices from the list of the items.
		 DoubleStream  removeDublicate= lItem.stream().mapToDouble(p->p.getPrice()).distinct();
		removeDublicate.forEach(s->System.out.println(s));
	
//		WAP to print the item with maximum price and not having any expiry 
//		date(item like water bottle, and dresses not having any expiry date
		
		
		
		
		
	}
}
