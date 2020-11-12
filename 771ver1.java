class Solution {
    public int numJewelsInStones(String J, String S) {
        
        int count = 0;
        int[] jewels = new int['z'+1];
        for(char j : J.toCharArray()){
            jewels[j] = 1;
        }
        for(char s : S.toCharArray()){
            if(jewels[s] == 1){
                count++;
            }
        }
        return count;
    }
}