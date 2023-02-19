package com.cogent.collectionFly;

import java.util.ArrayList;

public class ShoppingCart {
	
	void addProduct() {
		//create Objects of Product
		//Create Collection or Bucket to Add Product to it
		ArrayList<Product> bucket = new ArrayList<>();
		Product p1 = new Product(11, "Laptopt", 35000.55f);
		Product p3= new Product(111, "Laptopt", 35000.55f);
		Product p4= new Product(111, "Laptopt", 35000.55f);
		
		bucket.add(p1);
		bucket.add(new Product(222, "AC", 25000.55f));
		bucket.add(p3);
		bucket.add(p4);
		
		System.out.println(bucket);
	}

}
