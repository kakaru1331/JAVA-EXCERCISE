
public class Basic1 {

	public static void main(String[] args) {
		 System.out.println("Hello, World!");

		 int a = 10;
		 int b = 20;
		 int c = a - b;
		 System.out.println(c);
		
		 if(c > 0) {
			 System.out.println("c�� 0���� Ů�ϴ�.");
		 } else if(c == 0) {
			 System.out.println("c�� 0�Դϴ�.");
		 } else {
			 System.out.println("c�� 0���� �۽��ϴ�.");
		 }
		 
//		 else {
//		 if(c == 0) {
//		 System.out.println("c�� 0�Դϴ�.");
//		 } else {
//		 System.out.println("c�� 0���� ũ�� �ʾƿ�.");
//		 }
//		 }

		 System.out.println("������: " + 11 % 2);
		 for(int i = 0; i < 10; i++) {
			 if (i >= 5) {
				 if (i%2 == 0) {
					 System.out.println(i);
				 }
			 }
		 }
		
		 int[] arr1 = { 10, 20, 30 };
		 int[] arr2 = new int[] { 30, 20, 10 };
		 int[] arr3 = new int[3];
		
		 arr3[0] = 10;
		 arr3[1] = 20;
		 arr3[2] = 30;

//		�� �� #1 1~100�� ��� �迭 ����
//		�� �� #2 �迭 �� ¦���� ��
//		�� �� #3 ��� ���

		 int[] number = new int[100];
		 int sum = 0;
		
		 for(int i = 0; i < 100; i++) {
			 number[i] = i+1;
		 }
		
		 for(int j = 0; j < 100; j++) {
			 if(number[j]%2 == 0) {
				 sum += number[j];
			 }			
		 }
		 System.out.println(sum);

		/*
		 * int ret = 0; 
		 * for(int val : number) { 
		 * 	if(val%2 == 0) { 
		 * 		ret += val; 
		 * 	} 
		 * }
		 * System.out.println(ret);
		 */		

	}

}
