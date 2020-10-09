package ex2_app;

import java.util.Scanner;

import ex2_controller.RetailInventoryController;
import ex2_models.Category;
import ex2_view.PromptUserForDeleteProduct;

public class Driver {

	public static void main(String[] args) {
		System.out.println("THIS STORE HAS ONLY "+RetailInventoryController.TOTAL_CATEGORIES  +" TYPES OF ITEMS");
		for(Category cat: Category.values())
		{
			System.out.println(cat.toString());
		}
	
		RetailInventoryController retailInventoryController = new RetailInventoryController();
		retailInventoryController.viewProductInventory("assessments before populating");
		retailInventoryController.addInventory();
		retailInventoryController.viewProductInventory("assessments after populating");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product Id for change its price :");
		int id = sc.nextInt();
		System.out.println("Enter new Price:");
		int price = sc.nextInt();
		boolean isSuccess = retailInventoryController.updateInventoryForProduct(id, price);
		if (isSuccess) {
			System.out.println("update is successful!");
		}
		else
		{
			System.out.println("update is unsuccessful!! Product Id not found");
		}

		retailInventoryController.viewProductInventory("assessments after updating");
		String productName = PromptUserForDeleteProduct.promptUserForProductToDelete();
		retailInventoryController.deleteProductFromInventory(productName);
		retailInventoryController.viewProductInventory("assessments Deletion ");
		sc.close();
	}
        
}
