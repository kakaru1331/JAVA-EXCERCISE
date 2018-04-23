import java.util.Arrays;

public class Basic3 {
	
	public static void main(String[] args) {
		int[] nums = { 2, 1, 3, 9 };
		// 할 일 #1 오름차순
		for (int j = 0; j < nums.length - 1; j++) {
			for (int i = 0; i < nums.length - 1; i++) {
				int temp = 0;
				
				if (nums[i] < nums[i+1]) {
					temp = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = temp;
				}
//				System.out.println(Arrays.toString(nums));
			}			
		}
		System.out.println(Arrays.toString(nums));
	
		// 할 일 #2 내림차순
		for (int x = 0; x < nums.length - 1; x++) {
			for (int y = 0; y < nums.length - 1; y++) {
				int temp = 0;
				
				if (nums[y] > nums[y+1]) {
					temp = nums[y];
					nums[y] = nums[y+1];
					nums[y+1] = temp;
				}
//				System.out.println(Arrays.toString(nums));
			}
		}
		System.out.println(Arrays.toString(nums));
	}
}
