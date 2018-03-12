import java.util.Arrays;
import java.util.List;

public class ArrayIndexExam {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		for (int num : list) {
			System.out.println("list: " + num);
		}
		
		try {
			for (int i=0; i < list.size()+1; i++) {
				System.out.println("list[" + i + "] :" + list.get(i));
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

}
