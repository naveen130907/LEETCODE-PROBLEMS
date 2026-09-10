1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int l=0;
4        int[]b=new int[2];
5        for(int i=0;i<nums.length;i++){
6            for(int j=i+1;j<nums.length;j++){
7                if(nums[i]+nums[j]==target){
8                    b[l++]=i;
9                    b[l++]=j;
10                }
11            }
12        } 
13        return b;
14    }
15}