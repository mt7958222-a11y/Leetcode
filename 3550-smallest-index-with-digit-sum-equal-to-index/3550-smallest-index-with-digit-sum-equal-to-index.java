class Solution {
     
         int digitsum(int a){
            int sum=0;
            while(a>0){
                int r=a%10;
                sum+=r;
                a/=10;
            }
            return sum;
         }
         public int smallestIndex(int[] nums) {
         for(int i=0;i<nums.length;i++){
            if(i==digitsum(nums[i]))
            return i;
         }
         return -1;
        }
    }
