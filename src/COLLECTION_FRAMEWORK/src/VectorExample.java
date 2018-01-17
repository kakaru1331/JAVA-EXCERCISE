import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		List<String> list = new Vector<String>();
		
		list.add("1. Gerrad");
		list.add("2. Rooney");
		list.add("3. Ronaldo");
		list.add("4. Hamsik");
		list.add("5. Lukaku");
		
		list.remove(0);
		list.remove(1);
		
		for(String val : list) {
			System.out.println(val);
		}

	}

}
