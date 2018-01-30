import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		
		treeSet.add("apple");
		treeSet.add("banana");
		treeSet.add("cherry");
		treeSet.add("doll");
		treeSet.add("energy");		
		treeSet.add("feather");
		treeSet.add("gold");
		treeSet.add("holic");
		
		System.out.println("search between c ~ f");
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "g", true);
		for(String word : rangeSet) {
			System.out.println(word);
		}
		System.out.println();
		
		rangeSet = treeSet.headSet("g", true);
		for(String word : rangeSet) {
			System.out.println(word);
		}

	}

}
