class Solution {
    public String defangIPaddr(String address) {
        String[] addressArray = address.split("[.]");

        String newString = String.join("[.]", addressArray);
        return newString;
        
    }
}