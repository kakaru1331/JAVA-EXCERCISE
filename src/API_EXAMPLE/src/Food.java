
public class Food implements Comparable<Food> {
	String name;
	
	Food(String name) {
		this.name = name;
	}
	
	@Override
	public int compareTo(Food o) {
		return name.compareTo(o.name);
	}
	

}
