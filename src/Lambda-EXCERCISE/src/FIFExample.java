
public class FIFExample {

	public static void main(String[] args) {
		FIF fif;
		
		fif = (x, y) -> x * y;
		System.out.println(fif.method(5, 10));
		
		fif = (x, y) -> {
			return x * y;
		};
		System.out.println(fif.method(10, 10));
		
	}

}
