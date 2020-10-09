package ex2_view;

import java.util.ArrayList;


import ex2_models.Product;

public class ViewProductsDetail {
	
	public static void viewAllProductsDetail(ArrayList<Product> products,String message)
	{
		System.out.println();
		System.out.println("--------------------------------------");
		System.out.println(message);
		System.out.println("length of array " + products.size());
		for(Product product : products) {
			System.out.println("beginning of loop");
			System.out.println(product);
			System.out.println("end of loop");
		}
		System.out.println("--------------------------------------");
		System.out.println();
	}
	
	public static void displayDeletionResults(Product product) {
		if(product != null) {
			System.out.println("deletion was successful!");
			System.out.println(product.toString());
		}else {
			System.out.println("deletion did not happen.");
		}
	}

}
