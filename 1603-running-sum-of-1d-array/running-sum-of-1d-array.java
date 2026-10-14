class Solution {
    public int[] runningSum(int[] nums) {
        int[] sum=new int[nums.length];
        int add=0;
        for(int i=0;i<nums.length;i++){
            add=nums[i]+add;
            sum[i]=add;
        }
        return sum;
    }
}

// class Solution {
//     public int[] runningSum(int[] nums) {
//         int[] sum={0};
//         return Arrays.stream(nums)
//         .map(num->sum[0]+=num)
//         .toArray();
//     }
// }