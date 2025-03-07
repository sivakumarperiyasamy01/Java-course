public boolean firstLast6(int[] nums) {
  
  int firstindex=nums[0];
  int length=nums.length;
  int lastindex=nums[length-1];
  
  if(firstindex==6){
    return true;
  }else if(lastindex==6){
    return true;
  };
  
  return false;
  
}