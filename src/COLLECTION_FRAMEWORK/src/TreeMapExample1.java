import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();
		
		scores.put(87, "Alice");
		scores.put(98, "Bobby");
		scores.put(75, "Chris");
		scores.put(95, "Dudu");
		scores.put(80, "Elena");
		scores.put(86, "Frek");
		
		Map.Entry<Integer, String> entry = null;
		
		entry = scores.firstEntry();
		System.out.println("bottom score: " + entry.getKey() + " : " + entry.getValue());
		
		entry = scores.lastEntry();
		System.out.println("top score: " + entry.getKey() + " : " + entry.getValue());
				
	}

}
