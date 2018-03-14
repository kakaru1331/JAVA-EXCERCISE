
public class ColorExam {

	public static void main(String[] args) {
		Color red1 = new Color("red");
		Color red2 = new Color("red");
		Color blue = new Color("blue");
		
		String strRed = "red";

		if (red1.equals(red2)) {
			System.out.println(red1.name + " equals to " + red2.name);
		} else {
			System.out.println("no same");
		}
		
		if (red1.equals(blue)) {
			System.out.println(red1.name + " equals to " + blue.name);
		} else {
			System.out.println("no same");
		}
		
		if (red1.equals(strRed)) {
			System.out.println(red1.name + " equals to " + strRed);
		} else {
			System.out.println("no same");
		}
		
	}

}
