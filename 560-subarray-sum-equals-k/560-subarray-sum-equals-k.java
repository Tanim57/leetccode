class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap();
        
        int sum = 0;
        int ans = 0;
        
        //map.put(0,1);
        
        for(int num:nums){
            
            sum += num;
            
            if(map.containsKey(sum-k)){
                ans+= map.get(sum-k);
            }
            
            if(sum==k){
                ans++;
            }
            
            map.put(sum,map.getOrDefault(sum,0)+1);
            
        }
        
        return ans;
        
    }
}