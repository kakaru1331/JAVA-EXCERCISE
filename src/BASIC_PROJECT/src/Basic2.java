
public class Basic2 {

	public static void main(String[] args) {
		/*
		 * ���� 
		 * Ŀ�� 100�� �ֹ� 
		 * �Ƹ޸�ī�� 4000��, �� 5000�� 
		 * Ȧ�� ��° �ֹ��� ��, 
		 * ¦�� ��° �ֹ��� �Ƹ޸�ī�� 
		 * !!! 3�� ��� ��° �ֹ��� 10% ����
		 */

		int[] coffee = new int[100];
		int americano = 4000;
		int latte = 5000;
		int total = 0;

		for (int i = 0; i < coffee.length; i++) {
			int order = i + 1;
			double coast = 0;

			if (order % 3 == 0) {
				if (order % 2 == 0) {
					coast = americano * 0.9;
					coffee[i] = (int) coast;
					continue;
				} else {
					coast = latte * 0.9;
					coffee[i] = (int) coast;
					continue;
				}
			}

			if (order % 2 == 0) {
				coast = americano;
				coffee[i] = (int) coast;
			} else {
				coast = latte;
				coffee[i] = (int) coast;
			}
		}

		int k = 1;
		for (int val : coffee) {
			total += val;

			System.out.println(k + "��° �ֹ�: " + val);
			k++;
		}
		System.out.println("�� ���� �ݾ�: " + total);

		
		
		// ������ Ǯ��
		int ame = 4000;
		int lat = 5000;
		int sum = 0;
		double[] prices = new double[100];
		
		for (int i = 1 ; i < 101 ; i++) {
			double price = 0;
			
			if (1 == i % 2) {
				//��
				if(0 == i % 3) {
					//3�� ���
					sum += lat * 0.9;
					price = lat * 0.9;
				} else {
					sum += lat;
					price = lat;
				}
			} else {
				//�Ƹ޸�ī��
				if(0 == i % 3) {
					//3�� ���
					sum += ame * 0.9;
					price = ame * 0.9;
				} else {
					sum += ame;
					price = ame;
				}
			}
			prices[i-1] = price;
			System.out.println(prices[i-1]);
//			System.out.println(i + "." + price);
		}
		
		System.out.println(sum);
		
	}

}
