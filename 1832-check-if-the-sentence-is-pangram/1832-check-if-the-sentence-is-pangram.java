class Solution {
    public boolean checkIfPangram(String s) {
        for(char c='a';c<='z';c++){
            if(s.indexOf(c)==-1){
                return false;
            }
        }
        return true;
    }
}