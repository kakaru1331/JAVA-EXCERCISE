
public class SplitExam {
	
	public static void main(String[] args) {
		String word = "Alex&Bobby&Chris&Doe&Eden&Faul";
		
		String[] names = word.split("&");
		
		for (String name : names)
			System.out.println(name);
	}
}
