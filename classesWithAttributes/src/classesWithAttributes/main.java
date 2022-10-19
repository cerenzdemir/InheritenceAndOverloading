package classesWithAttributes;

public class main {

	public main(String[] args) {
	Product product = new Product(1,"Laptop","Asus Laptop",5000,3,"L1");
	
	product.setName("Laptop");
	product.setId(1);
	product.setDescription("Asus Laptop");
	product.setPrice(5000);
	product.setStockAmound(3);
	product.setCode("L1");
	
	
	
	ProductManager productManager = new ProductManager();
	productManager.Add(product);
	
	System.out.println(product.hashCode());
	

	}

}
