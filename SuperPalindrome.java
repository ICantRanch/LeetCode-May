package LeetCode.May;

public class SuperPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		superpalindromesInRange("40000000000000000", "50000000000000000");
	}
	
	public static int superpalindromesInRange(String left, String right) {

		int sum = 0;
		int sqrt;
		StringBuilder sb;

		for(int i = Integer.parseInt(left);i < Integer.parseInt(right);i++){

			sb = new StringBuilder(Integer.toString(i));
			sb.reverse();
			if(sb.toString().equals(Integer.toString(i))) {
				System.out.println("Palindrome:" + i);
				sqrt = (int)Math.sqrt(i);
				System.out.println(sqrt);
				System.out.println(Math.pow(sqrt, 2));
				if(i == (int) Math.pow(sqrt, 2)) {
					sb = new StringBuilder(Integer.toString(sqrt));
					sb.reverse();
					if(sb.toString().equals(Integer.toString(sqrt))) {
						System.out.println("SuperPalindrome:" + i);
						sum++;
					}	
				}
			}
		}
		return sum;	
	}
}
