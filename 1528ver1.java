class Solution {
    public String restoreString(String s, int[] indices) {
        char[] stringArray = new char[s.length()];
        
        for(int i = 0; i < s.length(); i++){
            stringArray[indices[i]] = s.charAt(i);
        }
        
        String restore = String.valueOf(stringArray);
        return restore;
    }
}