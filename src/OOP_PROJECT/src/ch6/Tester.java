package ch6;

public class Tester {

	public static void main(String[] args) {
//		new Person("Chu", 34).buy();

//		Person[] personSet = new Person[100];		
//		CoffeeStore cs = new CoffeeStore();
//		
//		int i = 0;
//		for(Person val : personSet) {
//			val = new Person("A", i++);
//			val.buy(cs);
//		} 
		
//		������Ǯ��
		Person[] ps = new Person[100];
		CoffeeStore cs = new CoffeeStore();
		for (int j = 0; j < 100; j++) {
			ps[j] = new Person("ȫ"+j, 20 + j);
			ps[j].buy(cs);
		}
		System.out.println(ps);
		
	}

}
