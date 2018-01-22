
public class BoxingMethodExample {

	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int val1 = box1.get();
		
		Box<String> box2 = Util.boxing("Son");
		String val2 = box2.get();
		
		System.out.println(val1 + " | " + val2);

	}

}
