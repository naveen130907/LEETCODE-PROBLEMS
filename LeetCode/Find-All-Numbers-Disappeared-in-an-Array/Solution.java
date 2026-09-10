1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        HashSet<Integer>a=new HashSet<>();
4        for(int b:nums){
5            a.add(b);
6        }
7        ArrayList<Integer>b=new ArrayList<>();
8        for(int i=0;i<nums.length;i++){
9            if(!a.contains(i+1)){
10                b.add(i+1);
11            }
12        }
13        return b;
14    }
15}