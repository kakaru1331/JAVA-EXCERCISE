
public class ParameterExample {
	public static void main(String[] args) {
		Parameter param;
		
		param = (x) -> {
			System.out.println(x * 10);
		};
		param.forLambda(10);
		
		param = x -> {
			System.out.println(x * 100);
		};
		param.forLambda(10);
		
	}
}
