import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("Son", 27);
		map.put("Bruyne", 28);
		map.put("Ronaldo", 43);
		map.put("Ronaldo", 34); // key가 중복되기 때문에, 호돈을 호우가 대체
		System.out.println("Entry: " + map.size());
		System.out.println("Ronaldo: " + map.get("Ronaldo"));
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer age = map.get(key);
			System.out.println("Name: " + key + " | Age: " + age);
		}
		
		map.remove("Ronaldo");
		System.out.println("Entry after removing: " + map.size());
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer val = entry.getValue();
			
			System.out.println(key + " " + val);
		}
		
		map.clear();
		System.out.println("Entry after clearing: " + map.size());
	}

}
