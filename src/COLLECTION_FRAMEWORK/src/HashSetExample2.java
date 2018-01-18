import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample2 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
		set.add(new Member("Son", 27));
		set.add(new Member("Bruyne", 28));
		set.add(new Member("Son", 27)); // �ߺ� ��ü�� ������� ����.
		set.add(new Member("Son", 7)); // �������� (���̰� �ٸ�) ��ü�� �����.
		
		System.out.println("set size: " + set.size());
		
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Member tmp = (Member) iterator.next();
			
			System.out.println("name: " + tmp.name + " | age: " + tmp.age);
		}
	}

}
