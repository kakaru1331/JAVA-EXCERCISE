
public class NullPointerExam {

	public static void main(String[] args) {
		String str = null;
		
		try {
			str.toString();
		} catch(NullPointerException e) {
			e.printStackTrace();
		}

	}

}
