
public class ArithmeticalProgression {

	public static void main(String[] args) {
		calculate(1, 100);
		calculate(23, 45);
		calculate(44, 78);
	}
	
	public static void calculate(int startNum, int endNum) {
		int sumTwo, length, times, sum;
		int remainder = 0;
		
		sumTwo = startNum + endNum;
		length = endNum - startNum + 1;
		times = length / 2;

		if (length%2 != 0) {
			remainder = startNum + times;
		}
		
		sum = sumTwo * times + remainder;
		
		System.out.println("[" + startNum + ", " + endNum + "] progression result: " + sum);
	}

}
