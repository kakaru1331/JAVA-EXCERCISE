import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<>();
		
		map.put("spring", "sp");
		map.put("summer", "su");
		map.put("fall", "fa");
		map.put("winter", "wi");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디: ");
			String id = scanner.nextLine();
			
			System.out.println("비밀번호: ");
			String pwd = scanner.nextLine();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(pwd)) {
					System.out.println("로그인!");
					break;
				} else {
					System.out.println("Incorrect. plz, try again.");
				}
			} else {
				System.out.println("There's no id which matched");
			}
		}

	}

}
