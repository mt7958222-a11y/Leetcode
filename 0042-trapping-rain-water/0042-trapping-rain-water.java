class Solution {
    public int trap(int[] height) {
     int n=height.length;
     ArrayList<Integer> left = new ArrayList<>();
     ArrayList<Integer> right = new ArrayList<>();
     int lm=height[0];
     int rm=height[n-1];
     for(int i=0;i<n;i++){
        lm=Math.max(lm,height[i]);
         left.add(lm);
     }
     for(int i=n-1;i>=0;i--){
        rm=Math.max(rm,height[i]);
        right.add(rm);
     }
        int trap=0;
        for(int i=0;i<height.length;i++){
            
            trap += Math.min(left.get(i), right.get(n - 1 - i)) - height[i];
        }
        return trap;
    }
}