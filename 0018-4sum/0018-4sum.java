class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
                List<List<Integer>> result = new ArrayList<>();
                 int n=nums.length;
                Arrays.sort(nums);
                 for(int a=0;a<n-3;a++){
                    if(a>0 && nums[a]==nums[a-1]){
                        continue;
                    }
                    for(int j=a+1;j<n-2;j++){
                        if(j>a+1 && nums[j]==nums[j-1]){
                            continue;
                        }
                    int  left=j+1;
                    int right=n-1;
                    while(left<right){
                        long sum=(long) nums[a]+nums[j]+nums[left]+nums[right];
                        if(sum==target){
                            result.add(Arrays.asList(nums[a],nums[j],nums[left],nums[right]));
                        
                        while(left<right && nums[left]==nums[left+1]){
                            left++;
                        }
                        while(left<right && nums[right]==nums[right-1]){
                            right--;
                        }
                        left++;
                        right--;
                    }
                    else if(sum<target){
                        left++;
                    }
                    else{
                    right--;
           }
         }
        }
     }
     
        return result;
    }
}