
public class Product<T, M> {
	private T model;
	private M price;
	
	public T getModel() {
		return model;
	}
	public void setModel(T model) {
		this.model = model;
	}
	public M getPrice() {
		return price;
	}
	public void setPrice(M price) {
		this.price = price;
	}		
	
}
