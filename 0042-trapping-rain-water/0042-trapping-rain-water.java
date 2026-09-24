class Solution {
    public int trap(int[] height) {
     int n=height.length;
     int left[]=new int[n];
     int right[]=new int[n];
      int lm=height[0];
     int rm=height[n-1];
     for(int i=0;i<n;i++){
        lm=Math.max(lm,height[i]);
         left[i]=lm;
     }
     for(int i=n-1;i>=0;i--){
        rm=Math.max(rm,height[i]);
        right[i]=rm;
     }
        int trap=0;
        for(int i=0;i<height.length;i++){
            
            trap+=(Math.min(left[i],right[i]))-height[i];
        }
        return trap;
    }
}