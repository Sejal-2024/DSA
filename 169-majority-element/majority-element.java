class Solution {
    public int majorityElement(int[] nums) {
        // int maxcnt=0;
        // int maxele=nums[0];
        // int cnt=0;
        // // nums[]=Arrays.sort(nums);
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]==nums[i-1]){
        //         cnt++;
        //     }
        //     else{
        //         // maxcnt=Math.max(cnt,maxcnt);
        //         if(cnt>maxcnt){
        //             if(maxele==nums[i-1]){
        //                  maxcnt=cnt+maxcnt;
        //                  maxele=nums[i-1];
        //             }
        //             else{
        //                 maxcnt=cnt;
        //                 maxele=nums[i-1];
        //             }
        //         }
        //         cnt=0;
        //     }
        // }
        // return maxele;

 int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
        
    }
}