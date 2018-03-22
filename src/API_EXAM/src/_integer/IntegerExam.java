package _integer;

public class IntegerExam {

	public static void main(String[] args) {
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE+1);
		
		int number = 11;
		
		System.out.println(Integer.toHexString(number));
		System.out.println(Integer.toOctalString(number));
		System.out.println(Integer.toBinaryString(number));	
		
		System.out.println(Integer.parseInt("FF", 16));
		System.out.println(varyNotate("100"));
		
	}
	
	static String varyNotate(String strNum) {
		int tmp;
		
		tmp = Integer.parseInt(strNum);
		
		return "Binary: " + Integer.toBinaryString(tmp) + "\nOctal: " + Integer.toOctalString(tmp) + "\nHexa: " +Integer.toHexString(tmp);
	}

}
