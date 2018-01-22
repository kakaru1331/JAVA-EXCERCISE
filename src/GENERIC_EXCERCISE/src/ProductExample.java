
public class ProductExample {

	public static void main(String[] args) {
		Product<String, Integer> product1 = new Product<>();
		product1.setModel("OS X");
		product1.setPrice(100);
		
		String model1 = product1.getModel();
		int price1 = product1.getPrice();
		
		Product<String, String> product2 = new Product<>();
		product2.setModel("Åº¶ì");
		product2.setPrice("4µþ¶ó");
		
		String model2 = product2.getModel();
		String price2 = product2.getPrice();
		
		System.out.println(model1 + " | " + price1);
		System.out.println(model2 + " | " + price2);

	}

}
