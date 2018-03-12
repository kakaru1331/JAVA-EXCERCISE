
public class TryWithResource {

	public static void main(String[] args) {
		try(CloseImpl file = new CloseImpl("dummy.txt")) {
			file.read();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
