
public class FunctionalIFExample {

	public static void main(String[] args) {
		FunctionalIF functionalIf;
		
		functionalIf = () -> {
			System.out.println("안녕하세요!");
		};
		functionalIf.forLambda();
		
		functionalIf = () -> {
			System.out.println("네, 안녕이에요! ^^");
		};
		functionalIf.forLambda();

	}

}
