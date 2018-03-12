
public class NumberFormatExam {

	public static void main(String[] args) {
		String str1 = "10";
		String str2 = "1O"; 
		
		try {
			System.out.println(Integer.parseInt(str1));
			System.out.println(Integer.parseInt(str2)); // 'O' -> Generate NumberFormatException	
		} catch(NumberFormatException e) {
			e.printStackTrace();
		}

	}

}
