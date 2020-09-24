import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		int[] nums = new int[5];
		nums[0] = 3;
		nums[1] = 9;
		nums[2] = 4;
		nums[3] = 2;
		nums[4] = 7;
		System.out.println("Enter Array: ");
		Scanner array = new Scanner(System.in);
		String value = array.nextLine();
		if (value.equals("nums[0]")) {
			System.out.println(nums[0]);
		} else if (value.equals("nums[1]")) {
			System.out.println(nums[1]);
		} else if (value.equals("nums[2]")) {
			System.out.println(nums[2]);
		} else if (value.equals("nums[3]")) {
			System.out.println(nums[3]);
		} else if (value.equals("nums[4]")) {
			System.out.println(nums[4]);
		} else {
			System.out.println("Unknown Array!");
		}
	} 
}