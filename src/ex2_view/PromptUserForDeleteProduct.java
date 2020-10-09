package ex2_view;

import java.util.Scanner;

public class PromptUserForDeleteProduct {
	
	public static String promptUserForProductToDelete() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter Product name that you would like to delete:");
		String product_name = scanner.nextLine();
		scanner.close();
		if(product_name.equalsIgnoreCase("")) {
			System.out.println("You entered empty string");
		}
		return product_name;
	}

}
