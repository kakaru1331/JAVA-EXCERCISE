
public class Product {
	private String name;
	private String company;
	
	public Product(String name, String company) {
		this.name = name;
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "Product name: " + name + " & company: " + company; 
	}
}
