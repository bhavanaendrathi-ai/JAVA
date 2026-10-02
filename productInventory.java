class ProductInventory {

	int productId;
	String productName;
	double price;

	public ProductInventory() {
		this(0, "Unknown", 0.0);
		System.out.println("No argument constructor is called.\n");
	}

	public ProductInventory(int productId, String productName, double price) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;

		System.out.println("Parameterized contructor called.\n");
	}

	public void display() {
		System.out.println("Product Id: "+ productId);
		System.out.println("Product Name: "+ productName);
		System.out.println("Product Price: "+ price+ "\n");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object is being destroyed.");
	}

	public static void main(String[] args) {
		
		ProductInventory product1 = new ProductInventory();
		System.out.println("Displaying product1 details: ");
		product1.display();

		ProductInventory product2 = new ProductInventory(101, "Laptop", 55000);
		System.out.println("Displaying product2 details: ");
		product2.display();

		ProductInventory product3 = product2;
		System.out.println("Displaying product2 details: (Accessing through product3 refernce)");
		product3.display();


		product1 = null;

		System.gc();	
	}
}