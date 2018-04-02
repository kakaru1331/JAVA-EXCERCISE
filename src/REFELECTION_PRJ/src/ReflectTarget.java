
public class ReflectTarget {
	
	private String str;
	
	public ReflectTarget() {
		str = "Have you ever eaten Chicken?";
	}
	
	public void yellChicken() {
		System.out.println(str + " Chicken!!!");
	}
	
	public void yellAnother(String str) {
		System.out.println(str + "!!!");
	}
	
	private void whisperChicken() {
		System.out.println("chi... cken...");
	}
	
}
