import java.util.StringTokenizer;

public class StringTokenizerExam {

	public static void main(String[] args) {
		String word = "Alex&Bobby&Chris";
		
		StringTokenizer stringTokenizer = new StringTokenizer(word, "&");
		int numOfToken = stringTokenizer.countTokens();
		
		for (int i=0; i < numOfToken; i++) {
			System.out.println(stringTokenizer.nextToken());
		}
		
		stringTokenizer = new StringTokenizer(word, "&");
		while(stringTokenizer.hasMoreTokens()) {
			System.out.println(stringTokenizer.nextToken());
		}
	}

}
