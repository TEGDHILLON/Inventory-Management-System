package ex2_database;

import java.util.ArrayList;

import ex2_models.Product;

public class InventoryStorage {
	private ArrayList<Product> products = new ArrayList<Product>();

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void addProductInInventory(Product product) {
		products.add(product);
	}

	public boolean updateProductDetail(int id, int cost) {
		Product productToUpdate = findAssessmentItemById(id);
		if (null != productToUpdate) {
			productToUpdate.setProduct_Price(cost);
			return true;
		}
		return false;

	}

	public Product deleteProduct(String name) {
		Product productToDelete = findAssessmentItemByName(name);
		if (null != productToDelete) {
			products.remove(productToDelete);
			return productToDelete;
		}
		return null;
	}

	public Product findAssessmentItemById(int id) {
		for (Product product : getProducts()) {
			if (product.getProduct_Id() == id) {
				return product;
			}
		}
		return null;
	}

	public Product findAssessmentItemByName(String productName) {
		for (Product product : getProducts()) {
			if (product.getProduct_Name().equalsIgnoreCase(productName)) {
				return product;
			}
		}
		return null;
	}
}
