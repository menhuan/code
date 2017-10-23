package study.race;

public class LeetCodeOne {

	public static void main(String[] args) {
		
		int[] nums ={3,2,3};
		int target = 6 ;
		int[] num  =new LeetCodeOne().twoSum(nums, target);
		
		System.out.println(num[0]);
		System.out.println(num[1]);
		
	}

	
	
	 public int[] twoSum(int[] nums, int target) {
		 
		int[] num = new int[2];
		for(int index =0 ; index < nums.length-1 ; index ++){
			
			for(int indexSuff = index+1 ; indexSuff < nums.length ; indexSuff ++ ){
				if(nums[index] + nums[indexSuff] == target){
					num[0]=index ;
					num[1]=indexSuff;
				}
			}
				
		}
		 
		 
		return num;
	        
	 }
}
