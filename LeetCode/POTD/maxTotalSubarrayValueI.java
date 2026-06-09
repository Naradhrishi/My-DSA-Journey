class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        for(long num: nums){
            min = Math.min(num, min);
            max = Math.max(num, max);
        }
        System.out.println(min + " " + max);
        return (max - min) * k;
    }
}