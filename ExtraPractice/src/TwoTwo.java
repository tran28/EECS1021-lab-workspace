
public class TwoTwo {
	public boolean twoTwo(int[] nums) {
		boolean twoTwo = true;
		  if(nums.length==1){
		    if(nums[0]==2){
		      twoTwo = false;
		    }
		  }
		  else if(nums.length == 2){
		    if(nums[0]!=2 || nums[1]!=2){
		      twoTwo = false;
		    }
		  }
		  else{
		    for(int i = 1; i < (nums.length-1) && twoTwo; i++){
		      if(nums[nums.length-2] != 2 && nums[nums.length-1] == 2){
		          twoTwo = false;
		      }
		      else{
		        if(nums[i]==2){
		          if(nums[i-1]!=2 && nums[i+1]!=2){
		           twoTwo = false;  
		          }
		        }
		      }
		    }
		  }
		  return twoTwo;
	}

}
