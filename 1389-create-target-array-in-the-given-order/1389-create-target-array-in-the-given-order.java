class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer>a=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            a.add(index[i],nums[i]);
        }
        int ab[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ab[i]=a.get(i);
        }
        return ab;
    }
}