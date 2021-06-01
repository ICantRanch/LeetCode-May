package LeetCode.May;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class TargetArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPossible(new int[] {2,900000002});
	}
	
	public static boolean isPossible(int[] target) {

        
        
        int sum = Arrays.stream(target).sum();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (int i : target) {
			pq.add(i);
		}
		int largest;
        int inter;
        int temp;
		
		while(pq.peek() > 1) {
			
			largest = pq.poll();
            inter = 2*largest - sum;
			
            if(inter > pq.peek()){
                
                temp = sum-largest;
                
                System.out.println(temp);
                System.out.println(inter);
                
                inter = inter % temp;
                    
                sum = temp + inter;
            }else{
                sum = largest;
            }
            System.out.println(inter);
            if(inter < 1) {return false;}
			pq.add(inter);
		}
		return true;

	}

}
