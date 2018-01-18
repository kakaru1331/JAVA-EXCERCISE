import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample2 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
		set.add(new Member("Son", 27));
		set.add(new Member("Bruyne", 28));
		set.add(new Member("Son", 27)); // 중복 객체는 저장되지 않음.
		set.add(new Member("Son", 7)); // 동명이인 (나이가 다른) 객체는 저장됨.
		
		System.out.println("set size: " + set.size());
		
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Member tmp = (Member) iterator.next();
			
			System.out.println("name: " + tmp.name + " | age: " + tmp.age);
		}
	}

}
