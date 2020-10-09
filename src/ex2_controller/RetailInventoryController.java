package ex2_controller;

import ex2_database.InventoryStorage;
import ex2_models.Category;
import ex2_models.Product;
import ex2_view.ViewProductsDetail;

public class RetailInventoryController {

	public final static int TOTAL_CATEGORIES = 3;
	
	private InventoryStorage inventoryStorage = null;
	private ViewProductsDetail viewProductDetail = null;

	public RetailInventoryController() {
		inventoryStorage = new InventoryStorage();
		viewProductDetail = new ViewProductsDetail();
	}

	public void addInventory() {
		Product item1 = new Product(1, "Rice", 10, 1, Category.GROCERY);
		Product item2 = new Product(2, "flour", 8, 1, Category.GROCERY);
		Product item3 = new Product(3, "Sports Show", 100, 1, Category.FOOTWEAR);
		Product item4 = new Product(4, "Snow Shoe", 180, 1, Category.FOOTWEAR);
		Product item5 = new Product(5, "Oven", 250, 1, Category.ELECTRONICS);
		Product item6 = new Product(6, "Refrigerator", 500, 1, Category.ELECTRONICS);

		inventoryStorage.addProductInInventory(item1);
		inventoryStorage.addProductInInventory(item2);
		inventoryStorage.addProductInInventory(item3);
		inventoryStorage.addProductInInventory(item4);
		inventoryStorage.addProductInInventory(item5);
		inventoryStorage.addProductInInventory(item6);
	}

	public boolean updateInventoryForProduct(int id, int price) {
		return inventoryStorage.updateProductDetail(id, price);
	}

	public void deleteProductFromInventory(String name) {
		Product product = inventoryStorage.deleteProduct(name);
		ViewDetailofDeletedNode(product);
	}

	public void viewProductInventory(String message) {
		ViewProductsDetail.viewAllProductsDetail(getInventoryStorage().getProducts(), message);
	}

	public InventoryStorage getInventoryStorage() {
		return inventoryStorage;
	}

	public void setInventoryStorage(InventoryStorage inventoryStorage) {
		this.inventoryStorage = inventoryStorage;
	}

	public void ViewDetailofDeletedNode(Product product) {
		ViewProductsDetail.displayDeletionResults(product);
	}
}
