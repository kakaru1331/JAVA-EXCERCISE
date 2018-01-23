package b;

public class BoundedTypeParameterExample {

	public static void main(String[] args) {
		int ret1 = Util.compare(10, 20);
		System.out.println(ret1);
		
		int ret2 = Util.compare(4.5, 3);
		System.out.println(ret2);

	}

}
