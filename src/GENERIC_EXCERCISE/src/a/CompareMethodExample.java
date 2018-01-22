package a;

public class CompareMethodExample {

	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<>(1, "apple");
		Pair<Integer, String> p2 = new Pair<>(1, "apple");
		
		boolean ret1 = Util.<Integer, String>compare(p1, p2);
		if(ret1) {
			System.out.println("It is a equal object");
		} else {
			System.out.println("Not a equal object");
		}
		
		Pair<String, String> p3 = new Pair<>("hands", "Son");
		Pair<String, String> p4 = new Pair<>("football", "Son");
		
		boolean ret2 = Util.<String, String>compare(p3, p4);
		if(ret2) {
			System.out.println("It is a equal object");
		} else {
			System.out.println("Not a equal object");
		}

	}

}
