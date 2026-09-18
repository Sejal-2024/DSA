class Solution {
    public int missingNumber(int[] nums) {
        // int ans=nums.length;
        // for(int i=0;i<nums.length;i++){
        //     ans ^=i^nums[i];
        // }
        // return ans;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<=nums.length;i++){
            if(map.containsKey(i)){}
            else{
                return i;
            }
        }
        return -1;
    }
}