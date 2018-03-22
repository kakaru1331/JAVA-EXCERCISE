package _boolean;

public class BooleanExam {
	
	public static void main(String[] args) {
		System.out.println(Boolean.parseBoolean("true"));
		System.out.println(Boolean.parseBoolean("false"));
		System.out.println(Boolean.parseBoolean("f"));
		System.out.println(Boolean.parseBoolean("TrUE"));
		
		boolean bool = false;
		
		System.out.println(Boolean.valueOf(bool));
		bool = true;
		System.out.println(Boolean.valueOf(bool));
		
	}
}
