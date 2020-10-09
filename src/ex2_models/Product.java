package ex2_models;

public class Product {
	
	private int product_Id;
	private String product_Name;
	private int product_Price;
	private int product_Qty;
	private Category product_Category;
	
	public Product(int product_Id, String product_Name, int product_Price, int product_Qty,Category category) {
		super();
		this.product_Id = product_Id;
		this.product_Name = product_Name;
		this.product_Price = product_Price;
		this.product_Qty = product_Qty;
		this.product_Category =category;
	}


	public int getProduct_Id() {
		return product_Id;
	}

	public void setProduct_Id(int product_Id) {
		this.product_Id = product_Id;
	}

	public String getProduct_Name() {
		return product_Name;
	}

	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}

	public int getProduct_Price() {
		return product_Price;
	}

	public void setProduct_Price(int product_Price) {
		this.product_Price = product_Price;
	}

	public int getProduct_Qty() {
		return product_Qty;
	}

	public void setProduct_Qty(int product_Qty) {
		this.product_Qty = product_Qty;
	}
	
	public Category getProduct_Category() {
		return product_Category;
	}

	public void setProduct_Category(Category product_Category) {
		this.product_Category = product_Category;
	}


	@Override
	public String toString() {
		return "Product [product_Id=" + product_Id + ", product_Name=" + product_Name + ", product_Price="
				+ product_Price + ", product_Qty=" + product_Qty + ", product_Category=" + product_Category + "]";
	}


	
	
	
	

}
