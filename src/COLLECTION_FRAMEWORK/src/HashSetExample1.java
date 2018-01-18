import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		// 5°³ Ãß°¡		
		System.out.println("set size: " + set.size());
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String elem = iterator.next();
			System.out.println(elem);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		System.out.println();
		
		System.out.println("set size: " + set.size());
		
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String elem = iterator.next();
			System.out.println(elem);
		}		

	}

}
