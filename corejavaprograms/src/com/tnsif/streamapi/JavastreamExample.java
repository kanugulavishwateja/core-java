package com.tnsif.streamapi;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavastreamExample {
	
	public static void main(String[] args) {
		
		List<Product> productlist=new ArrayList<Product>();
		
		productlist.add(new Product(1,"hp",25000f));
		productlist.add(new Product(2,"lenova",45000f));
		productlist.add(new Product(3,"apple",95000f));
		productlist.add(new Product(4,"Dell",75000f));
		
		List<Float> pl=productlist.stream().filter(p->p.price>30000).map(p->p.price).collect(Collectors.toList());
		System.out.println(pl);
				// filter the data (filter)
		// map() - fetching price
		// collect - collecting as list
		
		
	}

}