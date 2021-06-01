package LeetCode.May;

public class HopSkip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(jump(new int[] {2,3,1,1,4}));
		
	}
	public static int jump(int[] nums) {
		
		int index = 0;
		int jumps = 0;
		int max;
		while(index != nums.length-1){
			max = 0;
			System.out.println("Index:" + index);
			for(int i = 1;i <= nums[index];i++){
				if(index + i == nums.length-1){return jumps+1;}
				if((index + i) + nums[index+i] > max + nums[max]){
					System.out.println("new max:" + ((index + i) + nums[index+i]));
					max = index+i; 
					System.out.println("Max:" + max);
				}
			}
			index = max;
			jumps++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}



		return jumps;
    }

}
