package ch6;

public class CoffeeStore {
	
	int coffeeCount = 100;
	
	int sell(int money) {
		this.coffeeCount--;
		System.out.println("�Ƹ޸�ī�븦 �ȾҾ��." + this.coffeeCount);
		return money-5000;
	}
	
	
	
}
