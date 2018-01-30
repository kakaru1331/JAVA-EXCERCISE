import java.util.TreeSet;

public class TreeSetExample1 {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		scores.add(86);
		
		
		Integer score = null;
		
		score = scores.first();
		System.out.println("bottom score: " + score);
		
		score = scores.last();
		System.out.println("top score: " + score);
		
		score = scores.lower(95);
		System.out.println("under 95: " + score);
		
		score = scores.higher(95);
		System.out.println("over 95: " + score);
		
		score = scores.floor(95);
		System.out.println("or under 95: " + score);
		
		score = scores.ceiling(85);
		System.out.println("or over 85: " + score);
		
		while(!scores.isEmpty()) {
			score = scores.pollFirst();
			System.out.println(score + " 남은 객체 수: " + scores.size());
		}
		
		
	}

}
