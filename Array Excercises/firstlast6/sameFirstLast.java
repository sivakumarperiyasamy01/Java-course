public boolean sameFirstLast(int[] nums) {
  
  
    if(nums.length==0){
      return false;
    }
    
    int firstIndex=nums[0];//1
    int length=nums.length-1; //2
    int lastIndex=nums[length];// 3
    
    
    if(firstIndex==lastIndex && nums.length>=1){
      return true;
    }
  
   return false;  
    
    
  }
  