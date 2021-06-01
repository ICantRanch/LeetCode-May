package LeetCode.May;

import java.util.Arrays;
import java.util.Iterator;

public class minMoves2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int minMoves2(int[] nums) {

		int avg = Arrays.stream(nums).sum()/nums.length;
		int moves = 0;
		
		for (int i : nums) {
			moves += Math.abs(i-avg);
		}
		
		return moves;
	}

}
