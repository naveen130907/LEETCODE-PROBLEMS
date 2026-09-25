class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>a=new HashSet<>();
        boolean d=false;
        for(int x:nums){
            if(!a.add(x)){
                d=true;
                break;
            }
        }
        return d;
    }
}