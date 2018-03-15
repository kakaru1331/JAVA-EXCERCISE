
public class StringBuilderExam {

	public static void main(String[] args) {
		StringBuilder sentence = new StringBuilder();
		
		sentence.append("Hi!");
		sentence.append(" How are you?");
		System.out.println(sentence.toString());
		
		int length = sentence.length();
		System.out.println("sentence's count of letter");
		
		sentence.insert(0, "setence: ");
		System.out.println(sentence.toString());
	}

}
